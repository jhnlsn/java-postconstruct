package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ConfigRefreshListener {

    @PostConstruct
    public void init() {
        System.out.println("Post construct!");
    }

    @EventListener
    public void handleRefreshScopeRefreshedEvent(RefreshScopeRefreshedEvent event) {
        System.out.println("Config refresh!");
    }
}