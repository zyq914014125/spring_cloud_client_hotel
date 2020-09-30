package com.hqyj.traveluser.user.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.User;
import com.hqyj.traveluser.user.dao.UserMapper;
import com.hqyj.traveluser.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Optional;

/**
 * @author yjq
 * @date 2020/09/16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public Result<User> register(User user) {
        User userTemp = userMapper.getUserByUserName(user.getUserName());
        if (userTemp != null) {
            return new Result<User>(
                    Result.ResultState.ERROR_RESPONSE, "User name is repeat.");
        }

        userMapper.insertUser(user);
        return new Result<User>(
                Result.ResultState.SUCCESS_RESPONSE, "Insert Success.", user);
    }

    @Override
    @Transactional
    public Result<User> updateUser(User user) {
        User userTemp = userMapper.getUserByUserName(user.getUserName());
        if (userTemp != null && userTemp.getUserId() != user.getUserId()) {
            return new Result<User>(
                    Result.ResultState.ERROR_RESPONSE, "User name is repeat.");
        }
        userMapper.updateUser(user);
        return new Result<User>(
                Result.ResultState.SUCCESS_RESPONSE, "Update User success", user);
    }

    @Override
    @Transactional
    public Result<Object> deleteUser(int userId) {
        userMapper.deleteUser(userId);
        return new Result<Object>(
                Result.ResultState.SUCCESS_RESPONSE, "Delete User success.");
    }

    @Override
    public PageInfo<User> getUsersBySearchVo(Serachvo serachvo) {
        serachvo.initSearchVo();
        PageHelper.startPage(serachvo.getCurrentPage(), serachvo.getPageSize());
        return new PageInfo<User>(Optional
                .ofNullable(userMapper.getUsersBySearchVo(serachvo))
                .orElse(Collections.emptyList()));

    }

    @Override
    public User getUserByUserId(int userId) {
        return userMapper.getUserByUserId(userId);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }


}
