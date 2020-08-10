package com.xib.assessment.controller;

import com.xib.assessment.controller.models.Agent;
import com.xib.assessment.controller.models.Manager;
import com.xib.assessment.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @PostMapping(path="agent", consumes = "application/json")
    public void addAgent(@RequestBody Manager manager) {
        managerService.saveManager(manager);
    }
}
