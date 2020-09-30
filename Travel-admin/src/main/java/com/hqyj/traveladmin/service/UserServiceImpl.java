package com.hqyj.traveladmin.service;

import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mr.X
 **/
@Service
public class UserServiceImpl {
    @Autowired
    private UserServiceClient userServiceClient;

    public User getUserByUserName(String username) {
        System.out.println(username);
        return userServiceClient.getUserByUserName(username);
    }

    public Result<User> register(User user) {
        //加密测试代码
        //设置加密方式
        String algorithmName = "MD5";
        //设置待加密的原密码
        Object source = user.getUserPwd();
        //设置加盐方式(一般来说都是以用户名来加盐)
        Object salt = ByteSource.Util.bytes(user.getUserName());
        //加密次数
        int hashIterations = 1024;
        SimpleHash newPassword = new SimpleHash(algorithmName, source, salt, hashIterations);
        user.setUserPwd(newPassword.toString());

        return userServiceClient.register(user);
    }

    public Result<Object> login(User user) {
        //当前对象
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            // 把用户名和密码封装为 UsernamePasswordToken 对象
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getUserPwd());
            // remembermMe记住密码
            token.setRememberMe(true);
            try {
                // 执行登录.
                currentUser.login(token);
                // 登录成功...
                return new Result<Object>(Result.ResultState.SUCCESS_RESPONSE, " /index");
            } catch (IncorrectCredentialsException e) {
                return new Result<Object>(Result.ResultState.SOMETHING_WRONG, "登录密码错误");
            } catch (ExcessiveAttemptsException e) {
                return new Result<Object>(Result.ResultState.SOMETHING_WRONG, "登录失败次数过多");
            } catch (LockedAccountException e) {
                return new Result<Object>(Result.ResultState.SOMETHING_WRONG, "帐号已被锁定");
            } catch (DisabledAccountException e) {
                return new Result<Object>(Result.ResultState.SOMETHING_WRONG, "帐号已被禁用");
            } catch (ExpiredCredentialsException e) {
                return new Result<Object>(Result.ResultState.SOMETHING_WRONG, "帐号已过期");
            } catch (UnknownAccountException e) {
                return new Result<Object>(Result.ResultState.SOMETHING_WRONG, "帐号不存在");
            } catch (Exception e) {
                return new Result<Object>(Result.ResultState.SOMETHING_WRONG, "something error");
            }
        }
        // 登录成功，重定向到LoginSuccess.action
        return new Result<Object>(Result.ResultState.SUCCESS_RESPONSE, "/index");
    }
}
