package com.whc.client.modules.controller;


import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import com.whc.client.modules.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: RouteController <br/>
 * Description: <br/>
 * date: 2020/9/15 19:17<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/api")
public class RouteController {
    @Autowired
    private RouteService routeService;

    /**
     * 127.0.0.1:8110/api/route ---post
     * {"sceneryIdList":"1,2,3","routeName":"都江堰->熊猫基地->青城山","totalPrice":"50"}
     */
    @PostMapping(value = "/route", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Route> addRouteByRoute(@RequestBody Route route) {
        return routeService.addRouteByRoute(route);
    }

    /**
     * 127.0.0.1:8110/api/route/1---delete
     */
    @DeleteMapping("/route/{routeId}")
    public Result<Route> deleteRouteByRouteId(@PathVariable int routeId) {
        return routeService.deleteRouteByRouteId(routeId);
    }

    /**
     * 127.0.0.1:8110/api/route ---put
     * {"sceneryIdList":"1,2,6","routeName":"都江堰->熊猫基地->杜甫草堂","totalPrice":"70","routeId":"1"}
     */
    @PutMapping("/route")
    public Result<Route> updateRouteByRoute(@RequestBody Route route) {
        return routeService.updateRouteByRoute(route);
    }

    /**
     * 127.0.0.1:8110/api/routes ---post
     * {"currentPage":"1","pageSize":"5","keyWord":"都江堰"}
     */
    @PostMapping(value = "/routes", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PageInfo<Route> getRouteBySearchVo(@RequestBody Serachvo serachvo) {
        return routeService.getRouteBySearchVo(serachvo);
    }

    /**
     * 127.0.0.1:8110/api/route/1---get
     */
    @GetMapping("/route/{routeId}")
    public Result<Route> getRouteByRouteId(@PathVariable int routeId) {
        return routeService.getRouteByRouteId(routeId);
    }

}