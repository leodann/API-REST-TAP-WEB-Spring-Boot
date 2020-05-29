package com.tapweb.apiresttapweb.controller;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.composite_keys.Esp_med_PK;
import com.tapweb.apiresttapweb.entity.Esp_med;
import com.tapweb.apiresttapweb.service.Esp_med_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/v1")
public class Esp_med_controller {
    @Autowired
    @Qualifier("esp_med_serv")
    private Esp_med_service esp_med_serv;

    @GetMapping(value = "/esp_med/listar")
    public Iterable<Esp_med>listar_esp_med(){
        return esp_med_serv.getAll();
    }

    @PostMapping(value="/esp_med/registrar")
    public Esp_med registrar(@RequestBody @Valid Esp_med_PK pk) {                
        return esp_med_serv.registrar_esp_med(pk);
    }    
}