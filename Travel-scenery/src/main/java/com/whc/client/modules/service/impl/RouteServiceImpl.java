package com.whc.client.modules.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import com.whc.client.modules.dao.RouteDao;
import com.whc.client.modules.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Optional;

/**
 * ClassName: RouteServiceImpl <br/>
 * Description: <br/>
 * date: 2020/9/15 19:18<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteDao routeDao;

    //增加
    @Override
    @Transactional
    public Result<Route> addRouteByRoute(Route route) {
        Route route_db = routeDao.getRouteByRouteName(route.getRouteName());
        if (route_db != null) {
            return new Result<Route>(Result.ResultState.ERROR_RESPONSE, "this route is exist");
        } else {
            routeDao.addRoute(route);
            return new Result<Route>(Result.ResultState.SUCCESS_RESPONSE, "add success", route);
        }
    }

    //删除
    @Override
    @Transactional
    public Result<Route> deleteRouteByRouteId(int routeId) {
        routeDao.deleteRoute(routeId);
        return new Result<Route>(Result.ResultState.SUCCESS_RESPONSE, "delete success");

    }

    //修改
    @Override
    @Transactional
    public Result<Route> updateRouteByRoute(Route route) {
        routeDao.updateRoute(route);
        return new Result<Route>(Result.ResultState.SUCCESS_RESPONSE, "update success", route);
    }

    //分页查询
    @Override
    public PageInfo<Route> getRouteBySearchVo(Serachvo serachvo) {
        serachvo.initSearchVo();
        PageHelper.startPage(serachvo.getCurrentPage(), serachvo.getPageSize());
        return new PageInfo<Route>(Optional.ofNullable(routeDao.getRouteBySearchVo(serachvo))
                .orElse(Collections.emptyList()));
    }

    //根据id查询
    @Override
    public Result<Route> getRouteByRouteId(int routeId) {
        Route route = routeDao.getRouteByRouteId(routeId);
        if (route != null) {
            return new Result<Route>(Result.ResultState.SUCCESS_RESPONSE, "select success", route);
        } else {
            return new Result<Route>(Result.ResultState.ERROR_RESPONSE, "this route is not exist");
        }
    }
}
