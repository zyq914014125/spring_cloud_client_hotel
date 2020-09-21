package com.whc.client.modules.service;


import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;

/**
 * ClassName: RouteService <br/>
 * Description: <br/>
 * date: 2020/9/15 19:18<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
public interface RouteService {
    Result<Route> addRouteByRoute(Route route);

    Result<Route> deleteRouteByRouteId(int routeId);

    Result<Route> updateRouteByRoute(Route route);

    PageInfo<Route> getRouteBySearchVo(Serachvo serachvo);

    Result<Route> getRouteByRouteId(int routeId);
}
