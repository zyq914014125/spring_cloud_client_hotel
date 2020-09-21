package com.whc.client.modules.dao;


import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Scenery;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: SceneryDao <br/>
 * Description: <br/>
 * date: 2020/9/15 10:50<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
@Repository
@Mapper
public interface SceneryDao {

    @Insert("insert scenery(scenery_id, scenery_name, scenery_level,ticket_price,img_url,scenery_address,scenery_describe) value" +
            "(#{sceneryId}, #{sceneryName}, #{sceneryLevel},#{ticketPrice},#{imgUrl},#{sceneryAddress},#{sceneryDescribe})")
    @Options(useGeneratedKeys = true, keyProperty = "sceneryId", keyColumn = "scenery_id")
    void addScenery(Scenery scenery);

    @Update("update scenery set scenery_name=#{sceneryName}, scenery_level=#{sceneryLevel},ticket_price=#{ticketPrice}," +
            "img_url=#{imgUrl}, scenery_address = #{sceneryAddress},scenery_describe=#{sceneryDescribe} where scenery_id=#{sceneryId}")
    void updateScenery(Scenery scenery);

    @Delete("delete from scenery where scenery_id = #{sceneryId}")
    void deleteScenery(int sceneryId);

    @Select("<script>" +
            "select * from scenery "
            + "<where> "
            + "<if test='keyWord != \"\" and keyWord != null'>"
            + "and scenery_name like '%${keyWord}%' "
            + "</if>"
            + "</where>"
            + "<choose>"
            + "<when test='orderBy != \"\" and orderBy != null'>"
            + "order by ${orderBy} ${sort}"
            + "</when>"
            + "<otherwise>"
            + "order by scenery_id desc"
            + "</otherwise>"
            + "</choose>"
            + "</script>")
    List<Scenery> getSceneryBySearchVo(Serachvo serachvo);

    @Select("select * from scenery where scenery_name = #{sceneryName} limit 1")
    Scenery getSceneryBySceneryName(String sceneryName);

    @Select("select * from scenery where scenery_id = #{sceneryId}")
    Scenery getSceneryBySceneryId(int sceneryId);
}