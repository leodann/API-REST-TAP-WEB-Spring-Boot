package com.tapweb.apiresttapweb.controller;

import com.tapweb.apiresttapweb.model.Antecedentes;
import com.tapweb.apiresttapweb.service.Antecedentes_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/v1")
public class Antecedentes_controller {
    @Autowired
    @Qualifier("ant_serv")
    private Antecedentes_service ant_serv;

    @GetMapping(value="/antecedentes/listar")
    public Antecedentes listar (int id_paciente){
        return ant_serv.listar_antecedentes(id_paciente);
    }
    
}