package com.hqyj.traveluser.user.dao;

import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Select("select * from user where user_name = #{userName}")
    User getUserByUserName(String userName);

    @Insert("insert into user (user_name, user_pwd, salt, comment,permission_id,user_idCard,user_sex,user_tel,order_id) " +
            "values (#{userName}, #{userPwd}, #{salt}, #{comment},#{permissionId},#{userIdCard},#{userSex},#{userTel},#{orderId})")
    @Options(useGeneratedKeys = true, keyColumn = "user_id", keyProperty = "userId")
    void insertUser(User user);

    @Update("update user set user_name=#{userName},user_pwd=#{userPwd},comment=#{comment},permission_id=#{permissionId}," +
            "user_idCard=#{userIdCard},user_sex=#{userSex},user_tel=#{userTel},order_id=#{orderId} where user_id=#{userId}")
    void updateUser(User user);

    @Delete("delete from user where user_id = #{userId}")
    void deleteUser(int userId);

    @Select("<script>" +
            "select * from user "
            + "<where> "
            + "<if test='keyWord != \"\" and keyWord != null'>"
            + " and (user_name like '%${keyWord}%') "
            + "</if>"
            + "</where>"
            + "<choose>"
            + "<when test='orderBy != \"\" and orderBy != null'>"
            + " order by ${orderBy} ${sort}"
            + "</when>"
            + "<otherwise>"
            + " order by user_id desc"
            + "</otherwise>"
            + "</choose>"
            + "</script>")
    List<User> getUsersBySearchVo(Serachvo serachvo);


    @Select("select * from user where user_id = #{userId}")
    User getUserByUserId(int userId);

}
