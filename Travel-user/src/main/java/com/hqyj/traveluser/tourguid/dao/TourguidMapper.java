package com.hqyj.traveluser.tourguid.dao;

import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Tourguid;
import com.hqyj.TravelSpringBoot.module.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TourguidMapper {

    @Select("select * from tourguid where tourguid_name = #{tourguidName}")
    Tourguid getTourByTourguidName(String tourguidName);


    @Insert("insert into tourguid (tourguid_name,tourguid_sex,age,tourguid_tel,tourguid_state,tourguid_describe) value(#{tourguidName},#{tourguidSex}," +
            "#{age},#{tourguidTel},#{tourguidState},#{tourguidDescribe})")
    @Options(useGeneratedKeys = true, keyColumn = "tourguid_id", keyProperty = "tourguidId")
    void insertTour(Tourguid tourguid);


    @Update("update tourguid set tourguid_name=#{tourguidName},tourguid_sex=#{tourguidSex},age=#{age}," +
            "tourguid_tel=#{tourguidTel},tourguid_state=#{tourguidState},tourguid_describe=#{tourguidDescribe} where tourguid_id=#{tourguidId}")
    void updateTour(Tourguid tourguid);

    @Delete("delete from tourguid where tourguid_id = #{tourguidId}")
    void deleteTour(int tourguidId);

    @Select("<script>" +
            "select * from tourguid "
            + "<where> "
            + "<if test='keyWord != \"\" and keyWord != null'>"
            + " and (tourguid_name like '%${keyWord}%') "
            + "</if>"
            + "</where>"
            + "<choose>"
            + "<when test='orderBy != \"\" and orderBy != null'>"
            + " order by ${orderBy} ${sort}"
            + "</when>"
            + "<otherwise>"
            + " order by tourguid_id asc"
            + "</otherwise>"
            + "</choose>"
            + "</script>")
    List<Tourguid> getTourBySearchVo(Serachvo serachvo);

    @Select("select * from tourguid where tourguid_id = #{tourguidId}")
    Tourguid getTourByTourId(int tourguidId);
}
