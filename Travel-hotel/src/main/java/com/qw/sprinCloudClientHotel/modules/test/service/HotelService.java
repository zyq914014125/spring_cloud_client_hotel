package com.qw.sprinCloudClientHotel.modules.test.service;


import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Hotel;

import java.util.List;

/**
 * ClassName: CityService <br/>
 * Description: <br/>
 * date: 2020/8/11 21:47<br/>
 *
 * @author Acer-pc<br/>
 * @since JDK 1.8
 */
public interface HotelService {
    List<Hotel> getHotelsBySceneryId(int sceneryId);

    List<Hotel> getHotels();

    Result<Hotel> insertHotel(Hotel hotel);

    PageInfo<Hotel> getHotelsBySearchVo(Serachvo serachvo);

    Result<Hotel> updateHotel(Hotel hotel);

    Result<Object> deleteHotel(int hotelId);

    Hotel getHotelByHotelId(int hotelId);
}
