package com.hqyj.traveladmin.controller;

import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.User;
import com.hqyj.traveladmin.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mr.X
 **/
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;

    //新增
    @RequestMapping(value = "/api/register")
    public String insert(User user, ModelMap map) {
        Result<User> result = userService.register(user);
        if (result.getState() == 200) {
            return "index";
        } else
            return "errot";
    }

    @RequestMapping(value = "/api/login")
    public String login(User user) {
        Result<Object> result = userService.login(user);
        System.out.println(result.getMessage());
        if (result.getState() == 200) {
            return "index";
        }
        return "errot";
    }


}
