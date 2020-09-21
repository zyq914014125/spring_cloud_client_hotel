package com.hqyj.traveluser.tourguid.service;

import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Tourguid;


public interface TourguidService {

    Result<Tourguid> addTour(Tourguid tourguid);

    Result<Tourguid> updateTour(Tourguid tourguid);

    Result<Object> deleteTour(int tourguidId);

    PageInfo<Tourguid> getToursBySearchVo(Serachvo serachvo);

    Tourguid getTourByTourguidId(int tourguidId);
}
