package com.hqyj.traveladmin.controller;

import com.hqyj.TravelSpringBoot.module.entity.Team;
import com.hqyj.traveladmin.service.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/21
 */
@RequestMapping("/team")
@RestController
public class TeamController {
    @Autowired
    private TeamServiceImpl teamService;
    @GetMapping("/team/{teamId}")
    public Team selectTeamByTeamId(@PathVariable int teamId){
        return teamService.selectTeamByTeamId(teamId);
    }
}

