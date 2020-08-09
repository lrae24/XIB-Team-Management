package com.xib.assessment.controller;

import com.xib.assessment.controller.models.Agent;
import com.xib.assessment.controller.models.Team;
import com.xib.assessment.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentController {

    @Autowired
    AgentService agentService;

    @GetMapping(path="agent/{id}", produces = "application/json")
    public Agent findAgent(@PathVariable("id") Long id) {
        Agent a = agentService.retrieveAgent(id);
        return a;
    }

    @GetMapping(path="agents", produces = "application/json")
    public List<Agent> findAgent() {
        List<Agent> a = agentService.retrieveAllAgents();
        return a;
    }

    @PostMapping(path="agent", consumes = "application/json")
    public void addAgent(@RequestBody Agent agent) {
        agentService.saveAgent(agent);
    }
}
