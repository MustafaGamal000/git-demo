package com.datascience.controller;

import com.datascience.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    DemoService demoService;
    @GetMapping("/hi")
    public String sayHi(){
        return demoService.sayHi();
    }
}
