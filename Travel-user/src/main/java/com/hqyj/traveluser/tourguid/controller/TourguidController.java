package com.hqyj.traveluser.tourguid.controller;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Permission;
import com.hqyj.TravelSpringBoot.module.entity.Tourguid;
import com.hqyj.traveluser.tourguid.service.TourguidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/16
 */
@RequestMapping("/api")
@RestController
public class TourguidController {
    @Autowired
    private TourguidService tourguidService;

    /**
     * 127.0.0.1:8150/api/tour  ---post
     * {"tourguidName":"熊杉","tourguidSex":"女","age":"30","tourguidTel":"13008080888","tourguidDescribe":"专业专注、用心服务、真诚的服务、合理的价格!","tourguidState":"0"}
     */

    @PostMapping(value = "/tour", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Tourguid> addTour(@RequestBody Tourguid tourguid) {
        return tourguidService.addTour(tourguid);
    }

    /**
     * 127.0.0.1:8150/api/tours  ----post
     * {"currentPage":"1","pageSize":"5"}
     */
    @PostMapping(value = "/tours", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PageInfo<Tourguid> getTourBySearchVo(@RequestBody Serachvo serachvo) {
        return tourguidService.getToursBySearchVo(serachvo);
    }


    /**
     * 127.0.0.1:8150/api/tour ---put
     * {"tourguidId":"11","tourguidTel":"110"}
     */
    @PutMapping(value = "/tour", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Tourguid> updateTour(@RequestBody Tourguid tourguid) {
        return tourguidService.updateTour(tourguid);
    }


    /**
     * 127.0.0.1:8150/api/tour/11 ---delete
     */
    @DeleteMapping(value = "/tour/{tourguidId}")
    public Result<Object> deleteTour(@PathVariable int tourguidId) {
        return tourguidService.deleteTour(tourguidId);
    }

    /**
     * 127.0.0.1:8150/api/tour/1  ----post
     */
    @PostMapping("/tour/{tourguidId}")
    public Tourguid getTourByTourId(@PathVariable int tourguidId) {
        return tourguidService.getTourByTourguidId(tourguidId);
    }


}
