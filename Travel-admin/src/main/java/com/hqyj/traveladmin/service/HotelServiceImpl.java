package com.hqyj.traveladmin.service;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Hotel;
import com.hqyj.traveladmin.service.HotelServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/21
 */
@Service
public class HotelServiceImpl {
    @Autowired
    private HotelServiceClient hotelServiceClient;
    public PageInfo<Hotel> getHotelsBySearchVo(@RequestBody Serachvo serachvo){
        return hotelServiceClient.getHotelsBySearchVo(serachvo);
    }
}
