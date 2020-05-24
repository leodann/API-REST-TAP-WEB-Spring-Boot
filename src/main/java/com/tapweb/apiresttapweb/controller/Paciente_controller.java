package com.tapweb.apiresttapweb.controller;

import javax.validation.Valid;
import java.util.List;

import com.tapweb.apiresttapweb.service.Paciente_service;
import com.tapweb.apiresttapweb.model.Paciente_model;
import com.tapweb.apiresttapweb.entity.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Paciente_controller {
    @Autowired
    @Qualifier("pac_serv")
    Paciente_service pac_serv;

    @PutMapping(value="/paciente/registrar")
    public boolean registrarPaciente(@RequestBody @Valid Paciente paciente){
        return pac_serv.registrar_paciente(paciente);
    }

    @GetMapping(value="/paciente/listar")
    public List<Paciente_model>listarPacientes(){
        return pac_serv.listar_pacientes();
    }

    @GetMapping(value="/paciente/native")
    public List<Paciente_model>listarPacientesNative(){
        return pac_serv.listar_pacientes_native();
    }        
}