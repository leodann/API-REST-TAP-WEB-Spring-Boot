package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.composite_objects.Sintomas_wrapper;
import com.tapweb.apiresttapweb.model.Sintomas_model;
import com.tapweb.apiresttapweb.service.Sintomas_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Sintomas_controller {
    @Autowired
    @Qualifier("sint_serv")
    private Sintomas_service sint_serv;

    @GetMapping(value = "/sintomas/listar")
    public List<Sintomas_model>listar(int id_consulta){
        return sint_serv.listarSintomas(id_consulta);
    }

    @PostMapping(value = "/sintomas/registrar")
    public boolean registrar(@RequestBody @Valid Sintomas_wrapper sw ){
        return sint_serv.registrar(sw);
    }
}