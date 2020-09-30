package com.qw.sprinCloudClientHotel.modules.test.controller;


import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Hotel;
import com.qw.sprinCloudClientHotel.modules.test.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: CityController <br/>
 * Description: <br/>
 * date: 2020/8/11 19:59<br/>
 *
 * @author Acer-pc<br/>
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/api")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    /**
     * 127.0.0.1:8764/api/scenery/1 ---- get
     * 通过景点id查询酒店
     *
     * @PathVariable 获取路径参数
     */
    @GetMapping("/scenery/{sceneryId}")
    public List<Hotel> getHotelsBySceneryId(@PathVariable int sceneryId) {
        return hotelService.getHotelsBySceneryId(sceneryId);
    }

    /**
     * 127.0.0.1:8764/api/hotels  ---- get
     * 查询所有
     */
    @GetMapping("/hotels")
    public List<Hotel> getHotels() {
        return hotelService.getHotels();
    }

    /**
     * 127.0.0.1:8764/api/hotel  --- post
     * {"hotelName":"阿玛尼大酒店"}
     * 新增
     */
    @PostMapping(value = "/hotel", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Hotel> insertHotel(@RequestBody Hotel hotel) {
        return hotelService.insertHotel(hotel);
    }

    /**
     * 127.0.0.1:8764/api/hotels ---- post
     * {"currentPage":"1","pageSize":"5","keyWord":"青","orderBy":"hotel_name","sort":"desc"}
     * 模糊查询，脚本查询
     */
    @PostMapping(value = "/hotels", consumes = "application/json")
    public PageInfo<Hotel> getHotelsBySearchVo(@RequestBody Serachvo serachvo) {
        return hotelService.getHotelsBySearchVo(serachvo);
    }

    /**
     * 127.0.0.1:8764/api/updateHotel ---- put
     * {"hotelName":"aaa","hotelId":"69"}
     * 修改
     */
    @PutMapping(value = "/updateHotel", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Hotel> updateHotel(@RequestBody Hotel hotel) {
        return hotelService.updateHotel(hotel);
    }

    /**
     * 127.0.0.1:8764/api/deleteHotel/69 ---- delete
     * 删除
     */
    @DeleteMapping("/deleteHotel/{hotelId}")
    public Result<Object> deleteHotel(@PathVariable int hotelId) {
        return hotelService.deleteHotel(hotelId);
    }

    /**
     * 127.0.0.1:8764/api/hotel/1 ---- get
     * 查询
     */
    @GetMapping("/hotel/{hotelId}")
    public Hotel getHotelByHotelId(@PathVariable int hotelId) {
        return hotelService.getHotelByHotelId(hotelId);
    }
}
