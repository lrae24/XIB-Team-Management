package com.xib.assessment.service;

import com.xib.assessment.controller.models.Agent;
import com.xib.assessment.controller.models.Team;
import com.xib.assessment.repositories.AgentRepository;
import com.xib.assessment.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public Team retrieveTeam(Long id){
        Team  team = teamRepository.findById(id).get();
        return team;
    }

    public List<Team> retrieveAllTeams(){
        List<Team> teams = teamRepository.findAll();
        return teams;
    }

    public void saveTeam(Team team){
        teamRepository.save(team);
    }
}
