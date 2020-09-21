package com.hqyj.traveladmin.service;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import com.hqyj.traveladmin.service.RouteServiceclient;
import org.springframework.stereotype.Component;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/19
 */
@Component
public class RouteServiceclientImpl implements RouteServiceclient {

    @Override
    public PageInfo<Route> getRouteBySearchVo(Serachvo serachvo) {
        return null;
    }
}