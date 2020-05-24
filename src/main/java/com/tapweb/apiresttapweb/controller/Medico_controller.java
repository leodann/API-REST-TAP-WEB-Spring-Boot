package com.tapweb.apiresttapweb.controller;

import javax.validation.Valid;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.model.Medico_model;
import com.tapweb.apiresttapweb.model.Paciente_model;
import com.tapweb.apiresttapweb.service.Medico_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Medico_controller {
    @Autowired
    @Qualifier("med_serv")
    Medico_service med_serv;

    @PutMapping(value="/medico/registrar")
    public boolean registrarMedico(@RequestBody @Valid Medico medico){
        return med_serv.registrar(medico);
    }

    @GetMapping(value="/medico/listar")
    public List<Medico_model> listarMedicos(){
        return med_serv.listar_medicos();
    }
    
    @GetMapping(value="/medico/paciente/native")
    public List<Paciente_model>lisar_pac_native(){
        return med_serv.listar_pacientes_desde_medicos();
    }
}