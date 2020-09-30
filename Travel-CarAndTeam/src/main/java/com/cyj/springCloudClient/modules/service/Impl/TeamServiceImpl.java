package com.cyj.springCloudClient.modules.service.Impl;


import com.cyj.springCloudClient.modules.dao.TeamDao;
import com.cyj.springCloudClient.modules.dao.User_TeamDao;
import com.cyj.springCloudClient.modules.service.TeamService;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.Team;
import com.hqyj.TravelSpringBoot.module.entity.User;
import com.hqyj.TravelSpringBoot.module.entity.UserTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    User_TeamDao userTeamDao;

    @Autowired
    TeamDao teamDao;

    @Override
    public Team selectTeamByTeamId(int teamId) {
        return teamDao.selectTeamByTeamId(teamId);
    }

    @Override
    public List<User> selectUsersByTeamId(int teamId) {
        return Optional
                .ofNullable(userTeamDao.getUserBySearchVo(teamId))
                .orElse(Collections.emptyList());
    }

    @Override
    public Result<Team> updateTeam(Team team) {
        teamDao.updateTeam(team);
        return new Result<Team>(Result.ResultState.SUCCESS_RESPONSE, "update success");
    }

    @Override
    public Result<Team> insertTeam(Team team) {
        teamDao.insertTeam(team);
        return new Result<Team>(Result.ResultState.SUCCESS_RESPONSE, "insert success");
    }

    @Override
    public Result<UserTeam> insertTeamUser(UserTeam userTeam) {

        List<Object> objects = userTeamDao.selectTeamIdAndUserId(userTeam);
        if (objects.isEmpty()) {
            userTeamDao.insertTeamUser(userTeam);
            return new Result<UserTeam>(Result.ResultState.SUCCESS_RESPONSE, "insert success");
        } else {
            return new Result<UserTeam>(Result.ResultState.ERROR_RESPONSE, "请勿重复报团");
        }
    }

    @Override
    @Transactional
    public Result<Team> delTeam(int teamId) {
        teamDao.delTeam(teamId);
        return new Result<Team>(Result.ResultState.SUCCESS_RESPONSE, "delete success");
    }
}
