package com.xib.assessment.repositories;

import com.xib.assessment.controller.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
