package com.xib.assessment.service;

import com.xib.assessment.controller.models.Agent;
import com.xib.assessment.controller.models.Team;
import com.xib.assessment.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentService {

    @Autowired
    AgentRepository agentRepository;

    public Agent retrieveAgent(Long id){
      Agent  agent = agentRepository.findById(id).get();
        return agent;
    }

    public List<Agent> retrieveAllAgents(){
       List<Agent> agent = agentRepository.findAll();
        return agent;
    }


    public Page<Agent> retrieveAllPaginatedAgents(int pageSize, int size){
        Pageable pageable = PageRequest.of(pageSize,size);
        Page<Agent> agent = agentRepository.findAll(pageable);
        return agent;
    }

    public void saveAgent(Agent agent){
        agentRepository.save(agent);
    }
    public void saveAgent(Agent agent, Team team){
        agent.setTeam(team);
        agentRepository.save(agent);
    }
}
