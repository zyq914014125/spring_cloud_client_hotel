package com.cyj.springCloudClient.modules.dao;


import com.hqyj.TravelSpringBoot.module.entity.Team;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TeamDao {

    @Select("select * from team where team_id = #{teamId}")
    Team selectTeamByTeamId(int teamId);


    @Update("update team set team_name = #{teamName}," +
            "tourguid_id = #{tourguidId}," +
            "send_time=#{sendTime}," +
            "end_time=#{endTime}," +
            "route_id=#{routeId}," +
            "car_id=#{carId} where team_id =#{teamId}")
    void updateTeam(Team team);

    @Insert("insert into team(end_time,send_time,team_name,tourguid_id,route_id,car_id)" +
            "values (#{endTime},#{sendTime},#{teamName},#{tourguidId},#{routeId},#{carId})")
    void insertTeam(Team team);


    @Delete("delete from team where team_id=#{teamId}")
    void delTeam(int teamId);
}
