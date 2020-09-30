package com.hqyj.traveladmin.service.impl;

import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.User;

import com.hqyj.traveladmin.service.UserServiceClient;
import org.springframework.stereotype.Component;

/**
 * @author Mr.X
 **/
@Component
public class UserServiceClientImpl implements UserServiceClient {
    @Override
    public Result<User> register(User user) {
        return null;
    }

    @Override
    public User getUserByUserId(int userId) {
        return null;
    }

    @Override
    public User getUserByUserName(String userName) {
        return null;
    }

}
