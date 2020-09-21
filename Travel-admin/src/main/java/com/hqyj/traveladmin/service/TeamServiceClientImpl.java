package com.hqyj.traveladmin.service;

import com.hqyj.TravelSpringBoot.module.entity.Team;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/21
 */

public class TeamServiceClientImpl implements TeamServiceClient{
    @Override
    public Team selectTeamByTeamId(int teamId) {
        return new Team();
    }
}
