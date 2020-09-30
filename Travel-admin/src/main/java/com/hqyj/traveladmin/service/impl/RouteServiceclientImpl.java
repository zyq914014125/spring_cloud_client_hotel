package com.hqyj.traveladmin.service.impl;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import com.hqyj.TravelSpringBoot.module.entity.Scenery;
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

    @Override
    public Result<Route> getRouteByRouteId(int routeId) {
        return null;
    }

    @Override
    public Result<Scenery> getSceneryBySceneryId(int sceneryId) {
        return null;
    }

    @Override
    public PageInfo<Scenery> getSceneryBySearchVo(Serachvo serachvo) {
        return null;
    }
}