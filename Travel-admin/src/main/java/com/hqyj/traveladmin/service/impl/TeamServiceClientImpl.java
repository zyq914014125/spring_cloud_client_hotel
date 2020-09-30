package com.hqyj.traveladmin.service.impl;

import com.hqyj.TravelSpringBoot.module.entity.Team;
import com.hqyj.traveladmin.service.TeamServiceClient;
import org.springframework.stereotype.Controller;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/21
 */
@Controller
public class TeamServiceClientImpl implements TeamServiceClient {
    @Override
    public Team selectTeamByTeamId(int teamId) {
        return new Team();
    }
}
