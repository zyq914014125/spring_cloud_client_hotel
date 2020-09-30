package com.cyj.springCloudClient.modules.service.Impl;

import com.cyj.springCloudClient.modules.dao.carDao;
import com.cyj.springCloudClient.modules.service.carService;

import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class carServiceImpl implements carService {

    @Autowired
    carDao carDao;

    @Override
    public Car selectCarByCarId(int carId) {

        return carDao.selectCarByCarId(carId);
    }

    @Override
    public Result<Car> insertCar(Car cars) {
        carDao.insertCar(cars);
        return new Result<Car>(Result.ResultState.SUCCESS_RESPONSE,
                "Insert success.");
    }

    @Override
    @Transactional
    public Result<Car> delCar(int carId) {
        carDao.delCar(carId);
        return new Result<Car>(Result.ResultState.SUCCESS_RESPONSE, "delete success");
    }

    @Override
    public Result<Car> updateCar(Car car) {
        Car cars = carDao.selectCarByCarId(car.getCarId());
        if (cars != null) {
            carDao.updateCar(car);
            return new Result<Car>(Result.ResultState.SUCCESS_RESPONSE, "update success");
        } else {
            return new Result<Car>(Result.ResultState.ERROR_RESPONSE, "null!");
        }
    }

    @Override
    public List<Car> selectCarByState() {
        return Optional
                .ofNullable(carDao.selectCarByState())
                .orElse(Collections.emptyList());
    }
}
