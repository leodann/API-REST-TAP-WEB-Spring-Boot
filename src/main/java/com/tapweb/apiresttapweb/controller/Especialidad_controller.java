package com.tapweb.apiresttapweb.controller;

import javax.validation.Valid;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Especialidad;
import com.tapweb.apiresttapweb.service.Especialidad_service;
import com.tapweb.apiresttapweb.model.Especialidad_model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Especialidad_controller {
    @Autowired
    @Qualifier("esp_serv")
    private Especialidad_service esp_serv;

    @PutMapping(value="/especialidad/registrar")
    public boolean registrarEspecialidad(@RequestBody @Valid Especialidad especialidad){
        return esp_serv.registrar_especialidad(especialidad);
    }
    
    @GetMapping(value="/especialidad/listar")
    public List<Especialidad_model> listarEspecialidades(){
        return esp_serv.listar_especialidades();
    }
}