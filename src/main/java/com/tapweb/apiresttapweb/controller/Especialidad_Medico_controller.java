package com.tapweb.apiresttapweb.controller;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.entity.Especialidad_Medico;
import com.tapweb.apiresttapweb.llaves_compuestas.Especialidad_Medico_Id;
import com.tapweb.apiresttapweb.service.Especialidad_Medico_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/v1")

public class Especialidad_Medico_controller {
    
    @Autowired
    @Qualifier("esp_med_serv")
    private Especialidad_Medico_service esp_med_serv;

    @GetMapping(value="/esp_med/list")
    public Iterable<Especialidad_Medico> list(){
        return esp_med_serv.getAll();
    }

    @PostMapping(value = "/esp_med/registrar")
    public Especialidad_Medico registrar(@RequestBody @Valid Especialidad_Medico_Id pk){              
        return esp_med_serv.registrar_esp_med(pk);
    }
}