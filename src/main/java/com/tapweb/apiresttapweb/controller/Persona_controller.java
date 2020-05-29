package com.tapweb.apiresttapweb.controller;

import com.tapweb.apiresttapweb.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Persona_controller {
    @Autowired
    @Qualifier("per_serv")
    private Persona_service per_serv;
    
   
    
}