package com.hqyj.traveluser.tourguid.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Tourguid;
import com.hqyj.TravelSpringBoot.module.entity.User;
import com.hqyj.traveluser.tourguid.dao.TourguidMapper;
import com.hqyj.traveluser.tourguid.service.TourguidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/16
 */
@Service
public class TourguidServiceImpl implements TourguidService {

    @Autowired
    private TourguidMapper tourguidMapper;

    @Override
    public Result<Tourguid> addTour(Tourguid tourguid) {
        Tourguid tourguid1 = tourguidMapper.getTourByTourguidName(tourguid.getTourguidName());
        if (tourguid1 != null) {
            return new Result<Tourguid>(Result.ResultState.ERROR_RESPONSE, "tourguidName is repeate!");
        }
        tourguidMapper.insertTour(tourguid);
        return new Result<Tourguid>(Result.ResultState.SUCCESS_RESPONSE, "Insert success!",tourguid);
    }

    @Override
    public Result<Tourguid> updateTour(Tourguid tourguid) {
        Tourguid tourguid1 = tourguidMapper.getTourByTourguidName(tourguid.getTourguidName());
        if (tourguid1 != null && tourguid1.getTourguidId() != tourguid1.getTourguidId()) {
            return new Result<Tourguid>(
                    Result.ResultState.ERROR_RESPONSE, "TourguidName is repeat.");
        }
        tourguidMapper.updateTour(tourguid);
        return new Result<Tourguid>(
                Result.ResultState.SUCCESS_RESPONSE, "Update Tourguid success", tourguid);
    }

    @Override
    public Result<Object> deleteTour(int tourguidId) {
        tourguidMapper.deleteTour(tourguidId);
        return new Result<Object>(
                Result.ResultState.SUCCESS_RESPONSE, "Delete Tourguid success");
    }

    @Override
    public PageInfo<Tourguid> getToursBySearchVo(Serachvo serachvo) {
        serachvo.initSearchVo();
        PageHelper.startPage(serachvo.getCurrentPage(), serachvo.getPageSize());
        return new PageInfo<Tourguid>(Optional
                .ofNullable(tourguidMapper.getTourBySearchVo(serachvo))
                .orElse(Collections.emptyList()));
    }

    @Override
    public Tourguid getTourByTourguidId(int tourguidId) {
        return tourguidMapper.getTourByTourId(tourguidId);
    }
}
