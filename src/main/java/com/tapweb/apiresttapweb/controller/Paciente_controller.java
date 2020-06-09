package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.entity.Paciente;
import com.tapweb.apiresttapweb.model.Paciente_model;
import com.tapweb.apiresttapweb.service.Paciente_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Paciente_controller {
    @Autowired
    @Qualifier("pac_serv")
    private Paciente_service pac_serv;

    @PostMapping(value = "/paciente/registro")
    public  boolean registrar(@RequestBody @Valid Paciente paciente){
        return pac_serv.registrar(paciente);
    }

    @GetMapping(value = "/paciente/listar")
    public List<Paciente_model>listar_pacientes(){
        return pac_serv.listar_pacientes();
    }

    @GetMapping(value = "/paciente/getPaciente")
    public Paciente_model getPaciente (int id_paciente){
        Paciente p = pac_serv.getPaciente(id_paciente);
        Paciente_model paciente = new Paciente_model(p);
        return paciente;
    }
}