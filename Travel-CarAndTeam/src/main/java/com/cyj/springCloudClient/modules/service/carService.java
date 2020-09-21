package com.cyj.springCloudClient.modules.service;


import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.Car;

import java.util.List;

public interface carService {

    Car selectCarByCarId(int carId);

    Result<Car> insertCar(Car cars);

    Result<Car> delCar(int carId);

    Result<Car> updateCar(Car car);

    List<Car> selectCarByState();
}
