package com.hqyj.traveladmin.service;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import com.hqyj.TravelSpringBoot.module.entity.Scenery;
import com.hqyj.traveladmin.service.impl.RouteServiceclientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "scenery-client", fallback = RouteServiceclientImpl.class)
public interface RouteServiceclient {
    @PostMapping(value = "/api/routes", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PageInfo<Route> getRouteBySearchVo(@RequestBody Serachvo serachvo);

    @GetMapping("/api/route/{routeId}")
    public Result<Route> getRouteByRouteId(@PathVariable int routeId);

    @GetMapping("/api/scenery/{sceneryId}")
    public Result<Scenery> getSceneryBySceneryId(@PathVariable int sceneryId);

    @PostMapping(value = "/api/sceneries", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PageInfo<Scenery> getSceneryBySearchVo(@RequestBody Serachvo serachvo);



}
