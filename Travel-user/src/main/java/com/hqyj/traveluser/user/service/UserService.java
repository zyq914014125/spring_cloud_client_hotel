package com.hqyj.traveluser.user.service;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.User;

public interface UserService {
    Result<User> register(User user);

    Result<User> updateUser(User user);

    Result<Object> deleteUser(int userId);

    PageInfo<User> getUsersBySearchVo(Serachvo serachvo);

    User getUserByUserId(int userId);


}
