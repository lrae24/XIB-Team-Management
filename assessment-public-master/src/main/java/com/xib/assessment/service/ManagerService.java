package com.xib.assessment.service;

import com.xib.assessment.controller.models.Manager;
import com.xib.assessment.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public void saveManager(Manager manager){
        managerRepository.save(manager);
    }
}
