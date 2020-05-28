package com.tapweb.apiresttapweb;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ApiRestTapWebApplication {    
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ApiRestTapWebApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ApiRestTapWebApplication.class, args);
    }

    @EventListener  
    private void onAplicatioStarted(ApplicationStartedEvent applicationStartedEvent){
        log.info("Apilcation Started");   
    }

}
