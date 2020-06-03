package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.composite_keys.Esp_Consultas_PK;
import com.tapweb.apiresttapweb.model.Esp_Consutlas_model;
import com.tapweb.apiresttapweb.service.Esp_Consultas_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Esp_Consultas_controller {
    @Autowired
    @Qualifier("esp_cons_serv")
    private Esp_Consultas_service esp_cons_serv;

    @GetMapping(value = "/esp_cons/listar")
    public List<Esp_Consutlas_model>listar(){
        return esp_cons_serv.listAll();
    }

    @PostMapping(value = "/esp_cons/registrar")
    public boolean registrarEsp_cons (@RequestBody @Valid Esp_Consultas_PK pk ){
        return esp_cons_serv.registrar(pk);
    }
    
}