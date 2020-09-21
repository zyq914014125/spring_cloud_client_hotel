package com.hqyj.traveladmin.controller;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Hotel;
import com.hqyj.traveladmin.service.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/21
 */
@RequestMapping("/hotel")
@RestController()
public class HotelController {
    @Autowired
    private HotelServiceImpl hotelService;

    @PostMapping(value = "/hotels",consumes = "application/json")
    public PageInfo<Hotel> getHotelsBySearchVo(@RequestBody Serachvo serachvo){
        return hotelService.getHotelsBySearchVo(serachvo);
    }
}
