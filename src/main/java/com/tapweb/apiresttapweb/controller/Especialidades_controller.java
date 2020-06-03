package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.entity.Especialidades;
import com.tapweb.apiresttapweb.model.Especialidades_model;
import com.tapweb.apiresttapweb.service.Especialidades_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class Especialidades_controller {
    @Autowired
    @Qualifier("esp_serv")
    private Especialidades_service esp_serv;

    @GetMapping(value = "/especialidades/listar")
    public List<Especialidades_model> listar(){
        return esp_serv.listar_especialidades();
    }

    @GetMapping(value = "/especialidades/consulta/listar")
    public List<Especialidades_model>listarByConsulta(int id_consulta){
        return esp_serv.getEspByConsulta(id_consulta);
    }

    @PostMapping(value = "/especialidades/registrar")    
    public boolean registrar(@RequestBody @Valid Especialidades especialidad){
        return esp_serv.registrar_especialidad(especialidad);
    }
}