package com.xib.assessment.repositories;

import com.xib.assessment.controller.models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
