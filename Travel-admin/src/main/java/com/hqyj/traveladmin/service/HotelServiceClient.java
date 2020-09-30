package com.hqyj.traveladmin.service;


import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Hotel;
import com.hqyj.traveladmin.service.impl.HotelServiceClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "sc-client-hotel", fallback = HotelServiceClientImpl.class)
public interface HotelServiceClient {
    @PostMapping(value = "/api/hotels", consumes = "application/json")
    public PageInfo<Hotel> getHotelsBySearchVo(@RequestBody Serachvo serachvo);

    @GetMapping("/api/scenery/{sceneryId}")
    public List<Hotel> getHotelsBySceneryId(@PathVariable int sceneryId);

}
