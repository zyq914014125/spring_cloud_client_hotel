package com.qw.sprinCloudClientHotel.modules.test.dao;

import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Hotel;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: CityDao <br/>
 * Description: <br/>
 * date: 2020/8/11 22:02<br/>
 *
 * @author Acer-pc<br/>
 * @since JDK 1.8
 */
@Repository
@Mapper
public interface HotelDao {
    //通过id查询景点
    @Select("select * from hotel where scenery_id = #{sceneryId}")
    List<Hotel> getHotelsBySceneryId(int sceneryId);

    //查询所有酒店
    @Select("select * from hotel")
    List<Hotel> getHotels();

    //通过name查询
    @Select("select * from hotel where hotel_name = #{hotelName}")
    Hotel getHotelByHotelName(String hotelName);

    //新增
    @Insert("insert into hotel (hotel_name) values(#{hotelName})")
    @Options(useGeneratedKeys = true, keyColumn = "hotel_id", keyProperty = "hotelId")
    void insertHotel(Hotel hotel);

    //模糊查询
    @Select("<script>" +
            "select * from hotel "
            + "<where> "
            + "<if test='keyWord != \"\" and keyWord != null'>"
            + " and (hotel_name like '%${keyWord}%' or scenery_id like '%${keyWord}%') "
            + "</if>"
            + "</where>"
            + "<choose>"
            + "<when test='orderBy != \"\" and orderBy != null'>"
            + " order by ${orderBy} ${sort}"
            + "</when>"
            + "<otherwise>"
            + " order by hotel_id desc"
            + "</otherwise>"
            + "</choose>"
            + "</script>")
    List<Hotel> getHotelsBySearchVo(Serachvo serachvo);

    //修改
    @Update("update hotel set hotel_name = #{hotelName},hotel_cost = #{hotelCost} where hotel_id = #{hotelId}")
    void updateHotel(Hotel hotel);

    //删除
    @Delete("delete from hotel where hotel_id = #{hotelId}")
    void deleteHotel(int hotelId);

    //查询hotel
    @Select("select * from hotel where hotel_id = #{hotelId}")
    Hotel getHotelByHotelId(int hotelId);
}
