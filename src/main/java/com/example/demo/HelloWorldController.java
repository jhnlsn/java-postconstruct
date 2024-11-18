package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public HelloWorldController(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @GetMapping("/")
    public String helloWorld() {
        eventPublisher.publishEvent(new RefreshScopeRefreshedEvent());
        return "Create parameters";
    }
}