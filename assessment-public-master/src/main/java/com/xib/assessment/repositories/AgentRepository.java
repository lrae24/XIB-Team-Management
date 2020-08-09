package com.xib.assessment.repositories;

import com.xib.assessment.controller.models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}
