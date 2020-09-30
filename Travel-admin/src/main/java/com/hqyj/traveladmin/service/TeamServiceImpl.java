package com.hqyj.traveladmin.service;

import com.hqyj.TravelSpringBoot.module.entity.Team;
import com.hqyj.traveladmin.service.TeamServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/21
 */
@Service
public class TeamServiceImpl {
    @Autowired
    private TeamServiceClient teamServiceClient;

    public Team selectTeamByTeamId(int teamId) {
        return teamServiceClient.selectTeamByTeamId(teamId);
    }
}
