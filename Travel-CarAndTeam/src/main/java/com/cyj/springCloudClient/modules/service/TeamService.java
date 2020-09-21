package com.cyj.springCloudClient.modules.service;


import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.Team;
import com.hqyj.TravelSpringBoot.module.entity.User;
import com.hqyj.TravelSpringBoot.module.entity.UserTeam;

import java.util.List;

public interface TeamService {

    Team selectTeamByTeamId(int teamId);

    List<User> selectUsersByTeamId(int teamId);

    Result<Team> updateTeam(Team team);

    Result<Team> insertTeam(Team team);

    Result<UserTeam> insertTeamUser(UserTeam userTeam);

    Result<Team> delTeam(int teamId);
}
