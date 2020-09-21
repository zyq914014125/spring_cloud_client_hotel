package com.cyj.springCloudClient.modules.controller;


import com.cyj.springCloudClient.modules.service.TeamService;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.Team;
import com.hqyj.TravelSpringBoot.module.entity.User;
import com.hqyj.TravelSpringBoot.module.entity.UserTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeamController {

    @Autowired
    TeamService teamService;

    @GetMapping("/team/{teamId}")
    public Team selectTeamByTeamId(@PathVariable int teamId){
        return teamService.selectTeamByTeamId(teamId);
    }

    @GetMapping("/teams/{teamId}")
    public List<User> selectUsersByTeamId(@PathVariable int teamId){
        return teamService.selectUsersByTeamId(teamId);
    }

    @PutMapping(value = "/team",consumes = "application/json")
    public Result<Team> updateTeam(@RequestBody Team team){
        return teamService.updateTeam(team);
    }

    @PostMapping(value = "/team",consumes = "application/json")
    public  Result<Team> insertTeam(@RequestBody Team team){
        return teamService.insertTeam(team);
    }

    @PostMapping(value = "/teams",consumes = "application/json")
    public  Result<UserTeam> insertTeamUser(@RequestBody UserTeam userTeam){
        return teamService.insertTeamUser(userTeam);
    }

    @DeleteMapping("/team/{teamId}")
    public Result<Team> delTeam(@PathVariable int teamId){
        return teamService.delTeam(teamId);
    }




}
