package com.hqyj.traveladmin.controller;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import com.hqyj.traveladmin.service.RouteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author yjq
 * @date 2020/09/19
 */
@RequestMapping("/route")
@RestController
public class RouteController {
    @Autowired
    private RouteServiceImpl routeService;

    /**
     *127.0.0.1:8170/route/routes----post
     *
     */
    @PostMapping(value = "/routes", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PageInfo<Route> getRouteBySearchVo(@RequestBody Serachvo serachvo) {
        return routeService.getRouteBySearchVo(serachvo);
    }

}
