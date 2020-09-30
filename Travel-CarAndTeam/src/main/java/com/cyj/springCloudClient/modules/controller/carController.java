package com.cyj.springCloudClient.modules.controller;


import com.cyj.springCloudClient.modules.service.carService;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class carController {

    @Autowired
    private carService carService;


    @GetMapping("/car/{carId}")
    public Car selectAllByCarId(@PathVariable int carId) {
        return carService.selectCarByCarId(carId);
    }

    @PostMapping(value = "/car", consumes = "application/json")
    public Result<Car> insertCar(@RequestBody Car car) {
        return carService.insertCar(car);
    }

    @DeleteMapping("/car/{carId}")
    public Result<Car> delCar(@PathVariable int carId) {
        return carService.delCar(carId);
    }

    @PutMapping(value = "/car", consumes = "application/json")
    public Result<Car> updateCar(@RequestBody Car car) {
        return carService.updateCar(car);
    }

    //查询空闲车辆
    @GetMapping("/car/selectState")
    public List<Car> selectCarByState() {
        return carService.selectCarByState();
    }


}
