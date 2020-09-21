package com.hqyj.traveladmin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import com.hqyj.traveladmin.service.RouteServiceclient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/19
 */
@Service
public class RouteServiceImpl {

    @Autowired
    private RouteServiceclient routeServiceclient;
    public PageInfo<Route> getRouteBySearchVo(Serachvo serachvo) {
        return routeServiceclient.getRouteBySearchVo(serachvo);
}
}
