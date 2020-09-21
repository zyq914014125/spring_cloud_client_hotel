package com.hqyj.traveluser.user.controller;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.User;
import com.hqyj.traveluser.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/16
 */
@RequestMapping("/api")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 127.0.0.1:8150/api/register---post
     * {"user_name":"zyq","user_pwd":"123","user_sex":"男","user_age":"23","user_tel":"1356"}
     */
    @PostMapping(value = "/register",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<User> register(@RequestBody User user){
        return userService.register(user);
    }

    /**
     * 127.0.0.1:8150/api/users ---post
     * {"currentPage":"1","pageSize":"5","keyWord":"li","orderBy":"userName","sort":"asc"}
     */
    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PageInfo<User> getUsersBySearchVo(@RequestBody Serachvo serachvo) {
        return userService.getUsersBySearchVo(serachvo);
    }

    /**
     *127.0.0.1:8150/api/users ---put
     * {"userId":"10","userName":"lisa4","userAge":12,"userSex":"女","userTel":"1010"}
     */
    @PutMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<User> updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    /**
     * 127.0.0.1:8150/api/users/1 ---- delete
     */
    @DeleteMapping("/users/{userId}")
    public Result<Object> deleteUser(@PathVariable int userId) {
        return userService.deleteUser(userId);
    }


    /**
     * 127.0.0.1:8150/api/user/1 ---- get
     */
    @GetMapping("/user/{userId}")
    public User getUserByUserId(@PathVariable int userId) {
        return userService.getUserByUserId(userId);
    }


}