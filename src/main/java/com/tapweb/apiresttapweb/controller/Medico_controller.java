package com.tapweb.apiresttapweb.controller;

import javax.validation.Valid;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.service.Medico_service;
import com.tapweb.apiresttapweb.model.Medico_model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class Medico_controller {
    @Autowired
    @Qualifier("med_serv")
    private Medico_service med_serv;

    @PostMapping(value="/medico/registrar")
    public boolean registrarMedico(@RequestBody @Valid Medico medico){
        return med_serv.registrar(medico);
    }

    @GetMapping(value="/medico/listar")
    public List<Medico_model> listarMedicos(){
        return med_serv.listar_medicos();
    }

    @GetMapping(value = "/medico/getMedico")
    public Medico_model getMedico(int id_medico){
        Medico m = med_serv.getMedicoById(id_medico);
        Medico_model medico = new Medico_model(m);
        return medico;
    }
}