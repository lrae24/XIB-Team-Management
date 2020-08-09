package com.xib.assessment.controller;

import com.xib.assessment.controller.models.Agent;
import com.xib.assessment.controller.models.Team;
import com.xib.assessment.repositories.TeamRepository;
import com.xib.assessment.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamsController {

    @Autowired
    TeamService teamService;

    @GetMapping(path="team/{id}", produces = "application/json")
    public Team findTeam(@PathVariable("id") Long id) {
        Team a = teamService.retrieveTeam(id) ;
        return a;
    }

    @GetMapping(path="teams", produces = "application/json")
    public List<Team> findTeams() {
        List<Team> a = teamService.retrieveAllTeams();
        return a;
    }


    @PostMapping(path="team", consumes = "application/json")
    public void addTeam(@RequestBody Team team) {
      teamService.saveTeam(team);
    }

}
