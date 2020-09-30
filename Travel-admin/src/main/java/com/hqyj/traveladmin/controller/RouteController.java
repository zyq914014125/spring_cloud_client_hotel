package com.hqyj.traveladmin.controller;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import com.hqyj.TravelSpringBoot.module.entity.Scenery;
import com.hqyj.traveladmin.service.RouteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @author yjq
 * @date 2020/09/19
 */
@Controller
public class RouteController {
    @Autowired
    private RouteServiceImpl routeService;

    /**
     * 127.0.0.1:8170/routes----post
     */
    //这里跳转就携带参数
    @RequestMapping("/routes")

    public String getRouteBySearchVo(Serachvo serachvo, ModelMap map) {
        if (serachvo == null) {
            serachvo = new Serachvo();
            serachvo.setCurrentPage(1);
            serachvo.setPageSize(5);
        }
        PageInfo<Route> pageInfo = routeService.getRouteBySearchVo(serachvo);
        map.addAttribute("map", pageInfo);
        return "route";
    }

    //路线详情
    @GetMapping(value = "/routes/{routeId}")
    public String getOneRoute(@PathVariable int routeId, ModelMap map) {
        Route price = routeService.getOneRouteByRouteId(routeId);
        System.out.println(price.getTotalPrice());
        Map<String, Object> route = routeService.getRouteByRouteId(routeId);
        map.addAttribute("route", route);
        map.addAttribute("price", price.getTotalPrice());
        return "scr_index";
    }

    //景区列表
    @RequestMapping("/sceneries")
    public String getSceneryBySearchVo(Serachvo serachvo, ModelMap map) {
        if (serachvo == null) {
            serachvo = new Serachvo();
            serachvo.setCurrentPage(1);
            serachvo.setPageSize(10);
        }
        System.out.println(serachvo);
        PageInfo<Scenery> pageInfo = routeService.getSceneryBySearchVo(serachvo);
        map.addAttribute("map", pageInfo);
        return "scre";
    }

    @GetMapping("/scenery/{sceneryId}")
    public String getSceneryBySceneryId(@PathVariable int sceneryId, ModelMap map) {
        Scenery route = routeService.getSceneryBySceneryId(sceneryId);
        System.out.println(route);
        map.addAttribute("route", route);
        return "scre_index2";
    }
}
