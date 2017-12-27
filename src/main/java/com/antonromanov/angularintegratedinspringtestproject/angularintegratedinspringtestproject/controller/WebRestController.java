package com.antonromanov.angularintegratedinspringtestproject.angularintegratedinspringtestproject.controller;

// This Project created by Anton Romanov (www.antonromanov.com) 27.12.2017 at 17:02
// Source URL - http://javasampleapproach.com/java-integration/integrate-angular-4-springboot-web-app-springtoolsuite#I_Technologies
// Git Hub repo - ...


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @RequestMapping("/api/hi")
    public String hi() {
        return "Hello World from Restful API";
    }


}
