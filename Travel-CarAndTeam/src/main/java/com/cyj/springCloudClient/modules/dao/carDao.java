package com.cyj.springCloudClient.modules.dao;


import com.hqyj.TravelSpringBoot.module.entity.Car;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface carDao {

    @Select("select c.* from car c where car_id = #{carId}")
    Car selectCarByCarId(int carId);

    @Insert("insert into car(car_id,car_num,car_state)" +
            "values (#{carId},#{carNum},#{carState})"
    )
    @Options(useGeneratedKeys = true, keyColumn = "car_id", keyProperty = "carId")
    void insertCar(Car cars);


    @Delete("delete from car where car_id=#{carId}")
    void delCar(int carId);

    @Update("update car set car_num = #{carNum},car_state=#{carState} where car_id =#{carId}")
    void updateCar(Car car);

    @Select("select * from car where car_state = 0")
    List<Car> selectCarByState();
}
