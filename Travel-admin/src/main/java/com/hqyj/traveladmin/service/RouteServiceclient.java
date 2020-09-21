package com.hqyj.traveladmin.service;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "scenery-client",fallback = RouteServiceclientImpl.class)
public interface RouteServiceclient {
    @PostMapping(value = "/api/routes", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PageInfo<Route> getRouteBySearchVo(@RequestBody Serachvo serachvo);

}
