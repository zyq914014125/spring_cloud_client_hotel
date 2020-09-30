package com.qw.sprinCloudClientHotel.modules.test.service.Impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Hotel;
import com.qw.sprinCloudClientHotel.modules.test.dao.HotelDao;
import com.qw.sprinCloudClientHotel.modules.test.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * ClassName: CityServiceImpl <br/>
 * Description: <br/>
 * date: 2020/8/11 21:47<br/>
 *
 * @author Acer-pc<br/>
 * @since JDK 1.8
 */
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelDao hotelDao;

    //根据id查询
    @Override
    public List<Hotel> getHotelsBySceneryId(int sceneryId) {
        return Optional.ofNullable(hotelDao.getHotelsBySceneryId(sceneryId))
                .orElse(Collections.emptyList());
    }

    //查询所有
    @Override
    public List<Hotel> getHotels() {
        return hotelDao.getHotels();
    }

    //新增
    @Override
    public Result<Hotel> insertHotel(Hotel hotel) {
        //判断数据库是否有这个酒店
        Hotel hotel1 = hotelDao.getHotelByHotelName(hotel.getHotelName());
        if (hotel1 != null) {
            return new Result<Hotel>(Result.ResultState.ERROR_RESPONSE,
                    "Hotel name is repeat");
        }
        //修改
        hotelDao.insertHotel(hotel);

        return new Result<Hotel>(Result.ResultState.SUCCESS_RESPONSE,
                "Insert success.", hotel);
    }

    //模糊查询 分页
    @Override
    public PageInfo<Hotel> getHotelsBySearchVo(Serachvo serachvo) {
        serachvo.initSearchVo();
        PageHelper.startPage(serachvo.getCurrentPage(), serachvo.getPageSize());
        return new PageInfo<Hotel>(
                Optional.ofNullable(hotelDao.getHotelsBySearchVo(serachvo))
                        .orElse(Collections.emptyList()));
    }

    //修改
    @Override
    public Result<Hotel> updateHotel(Hotel hotel) {
        //判断数据库是否有这个酒店名字
        Hotel hotel1 = hotelDao.getHotelByHotelName(hotel.getHotelName());
        if (hotel1 != null) {
            return new Result<Hotel>(Result.ResultState.ERROR_RESPONSE,
                    "Hotel name is repeat");
        }

        //修改
        hotelDao.updateHotel(hotel);

        return new Result<Hotel>(Result.ResultState.SUCCESS_RESPONSE,
                "Update hotel success.", hotel);
    }

    //删除
    @Override
    public Result<Object> deleteHotel(int hotelId) {
        hotelDao.deleteHotel(hotelId);
        return new Result<Object>(Result.ResultState.SUCCESS_RESPONSE,
                "Delete hotel success.");
    }

    //查询
    @Override
    public Hotel getHotelByHotelId(int hotelId) {
        return hotelDao.getHotelByHotelId(hotelId);
    }

}
