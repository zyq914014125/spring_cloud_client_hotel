package com.hqyj.traveladmin.service;

import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.User;
import com.hqyj.traveladmin.service.impl.UserServiceClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Mr.X
 **/
@FeignClient(value = "Travel-user", fallback = UserServiceClientImpl.class)
public interface UserServiceClient {
    @PostMapping(value = "/api/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<User> register(@RequestBody User user);

    @GetMapping("/api/user/{userId}")
    public User getUserByUserId(@PathVariable int userId);

    @PostMapping("/api/user")
    public User getUserByUserName(String userName);
}
