package com.cyj.springCloudClient.modules.dao;

import com.hqyj.TravelSpringBoot.module.entity.User;

import com.hqyj.TravelSpringBoot.module.entity.UserTeam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface User_TeamDao {

    @Select("select u.* from user u join user_team uf on u.user_id = uf.user_id where team_id = #{teamId}")
    List<User> getUserBySearchVo(int teamId);

    @Insert("insert into user_team(team_id,user_id) values(#{teamId},#{userId})")
    void insertTeamUser(UserTeam userTeam);

    @Select("select * from user_team where team_id=#{teamId} and user_id=#{userId}")
    List<Object> selectTeamIdAndUserId(UserTeam userTeam);
}
