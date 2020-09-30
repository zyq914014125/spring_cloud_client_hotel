package com.hqyj.traveladmin.service.impl;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Hotel;
import com.hqyj.traveladmin.service.HotelServiceClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/21
 */
@Component
public class HotelServiceClientImpl implements HotelServiceClient {
    @Override
    public PageInfo<Hotel> getHotelsBySearchVo(Serachvo serachvo) {
        return null;
    }

    @Override
    public List<Hotel> getHotelsBySceneryId(int sceneryId) {
        return null;
    }
}
