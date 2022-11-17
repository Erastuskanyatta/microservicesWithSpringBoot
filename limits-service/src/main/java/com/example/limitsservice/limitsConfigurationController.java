package com.example.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitsConfigurationController {

    @Autowired
    private  final configuration configuration;

    public limitsConfigurationController(com.example.limitsservice.configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public limitsConfiguration retrieveLimitsFromConfiguration(){
        return new limitsConfiguration(configuration.getMaximum(),
                configuration.getMinimum());
    }
}
