package com.xib.assessment.controller;

import com.xib.assessment.controller.models.Agent;
import com.xib.assessment.controller.models.Team;
import com.xib.assessment.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentController {

    @Autowired
    AgentService agentService;

    @GetMapping(path="agent/{id}", produces = "application/json")
    public Agent findAgent(@PathVariable("id") Long id) {
        Agent agent = agentService.retrieveAgent(id);
        return agent;
    }

    @GetMapping(path="agents", produces = "application/json")
    public List<Agent> findAgent() {
        List<Agent> agents = agentService.retrieveAllAgents();
        return agents;
    }

    @GetMapping(path="agents", produces = "application/json", params = { "page", "size" })
    public Page<Agent> findAgent(@RequestParam("page") int page,
                                 @RequestParam("size") int size) {
        Page<Agent> agents = agentService.retrieveAllPaginatedAgents(page,size);
        return agents;
    }

    @PostMapping(path="agent", consumes = "application/json")
    public void addAgent(@RequestBody Agent agent) {
        agentService.saveAgent(agent);
    }
}
