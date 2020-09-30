package com.hqyj.traveladmin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Hotel;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import com.hqyj.TravelSpringBoot.module.entity.Scenery;
import com.hqyj.traveladmin.service.RouteServiceclient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    @Autowired
    private HotelServiceClient hotelServiceClient;

    public PageInfo<Route> getRouteBySearchVo(Serachvo serachvo) {
        return routeServiceclient.getRouteBySearchVo(serachvo);
    }

    public Map<String, Object> getRouteByRouteId(int routeId) {
        Result<Route> route = routeServiceclient.getRouteByRouteId(routeId);
        Map<String, Object> routeline = new HashMap<String, Object>();
        List<Scenery> sceneries = new ArrayList<Scenery>();
        List<Hotel> hotels = new ArrayList<Hotel>();
        if (route.getState() == 200) {
            String routeLine = route.getObject().getSceneryIdList();
            String[] scrList = routeLine.split(",");
            for (String s : scrList) {
                Scenery scenery = routeServiceclient.getSceneryBySceneryId(Integer.parseInt(s)).getObject();
                List<Hotel> hotels1 = getHotelsBySceneryId(scenery.getSceneryId());
                hotels.add(hotels1.get(0));
                sceneries.add(scenery);
            }
        }
        routeline.put("route", sceneries);
        routeline.put("hotel", hotels);
        return routeline;
    }

    public PageInfo<Scenery> getSceneryBySearchVo(Serachvo serachvo) {
        return routeServiceclient.getSceneryBySearchVo(serachvo);
    }

    public Scenery getSceneryBySceneryId(int sceneryId) {
        return routeServiceclient.getSceneryBySceneryId(sceneryId).getObject();
    }

    public List<Hotel> getHotelsBySceneryId(int sceneryId) {
        return hotelServiceClient.getHotelsBySceneryId(sceneryId);
    }

    public Route getOneRouteByRouteId(int sceneryId) {
        Result<Route> routeResult = routeServiceclient.getRouteByRouteId(sceneryId);
        if (routeResult.getState() == 200) {
            return routeResult.getObject();
        } else
            return new Route();
    }


}
