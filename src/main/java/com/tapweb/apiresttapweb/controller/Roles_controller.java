package com.tapweb.apiresttapweb.controller;

import java.util.List;

import com.tapweb.apiresttapweb.model.Roles_model;
import com.tapweb.apiresttapweb.service.Roles_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Roles_controller {
    @Autowired
    @Qualifier("rol_serv")
    private Roles_service rol_serv;

    @GetMapping(value = "/roles/listar")
    public List<Roles_model>listar_roles(){
        return rol_serv.listar_roles();
    }
    
}