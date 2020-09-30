package com.hqyj.traveladmin.service;

import com.hqyj.TravelSpringBoot.module.entity.Team;
import com.hqyj.traveladmin.service.impl.TeamServiceClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "client-account", fallback = TeamServiceClientImpl.class)
public interface TeamServiceClient {
    @GetMapping("/api/team/{teamId}")
    public Team selectTeamByTeamId(@PathVariable int teamId);
}
