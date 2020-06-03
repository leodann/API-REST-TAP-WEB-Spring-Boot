package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.entity.Enf_Cronicas;
import com.tapweb.apiresttapweb.model.Enf_Cronicas_model;
import com.tapweb.apiresttapweb.service.Enf_Cronicas_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping("/v1")
public class Enf_Cronicas_controller {
    @Autowired
    @Qualifier("enf_serv")
    private Enf_Cronicas_service enf_serv;

    @GetMapping(value = "/antecedentes/enf_cronicas/listar")
    public List<Enf_Cronicas_model>listar(){
        return enf_serv.listar_cronicas();
    }

    @PostMapping(value = "/antecedentes/enf_cronicas/registrar")
    public boolean registrar(@RequestBody @Valid Enf_Cronicas_model cronicas){
        return enf_serv.registrar(cronicas);
    }

    @GetMapping(value="/antecedentes/enf_cronicas/getByPaciente")
    @ResponseBody
    public List<Enf_Cronicas>listar_byPaciente(@RequestParam int id_paciente) {
        return enf_serv.getCronicasByPaciente(id_paciente);
    }
    
}