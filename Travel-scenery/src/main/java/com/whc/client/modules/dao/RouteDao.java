package com.whc.client.modules.dao;


import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Route;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: RouteDao <br/>
 * Description: <br/>
 * date: 2020/9/15 19:18<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
@Repository
@Mapper
public interface RouteDao {
    @Insert("insert route(route_id, route_name, scenery_id_list,total_price) value" +
            "(#{routeId}, #{routeName}, #{sceneryIdList},#{totalPrice})")
    @Options(useGeneratedKeys = true, keyProperty = "routeId", keyColumn = "route_id")
    void addRoute(Route route);

    @Update("update route set route_name=#{routeName}, scenery_id_list=#{sceneryIdList},total_price=#{totalPrice} where route_id=#{routeId}")
    void updateRoute(Route route);

    @Delete("delete from route where route_id = #{routeId}")
    void deleteRoute(int routeId);

    @Select("<script>" +
            "select * from route "
            + "<where> "
            + "<if test='keyWord != \"\" and keyWord != null'>"
            + "and route_name like '%${keyWord}%' "
            + "</if>"
            + "</where>"
            + "<choose>"
            + "<when test='orderBy != \"\" and orderBy != null'>"
            + "order by ${orderBy} ${sort}"
            + "</when>"
            + "<otherwise>"
            + "order by route_id desc"
            + "</otherwise>"
            + "</choose>"
            + "</script>")
    List<Route> getRouteBySearchVo(Serachvo serachvo);

    @Select("select * from route where route_name = #{routeName} limit 1")
    Route getRouteByRouteName(String routeName);

    @Select("select * from route where route_id = #{routeId}")
    Route getRouteByRouteId(int routeId);
}
