package com.hqyj.traveladmin.service;


import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "sc-client-hotel",fallback = HotelServiceClientImpl.class)
public interface HotelServiceClient {
    @PostMapping(value = "/api/hotels",consumes = "application/json")
    public PageInfo<Hotel> getHotelsBySearchVo(@RequestBody Serachvo serachvo);
}
