package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.entity.Alergias;
import com.tapweb.apiresttapweb.model.Alergias_model;
import com.tapweb.apiresttapweb.service.Alergias_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Alergias_controller {
    @Autowired
    @Qualifier("aler_serv")
    private Alergias_service aler_serv;

    @GetMapping(value = "/antecedentes/alergias/listar")
    public List<Alergias_model>listar(){                        
        return aler_serv.listar_alergias();
    }
    
    @PostMapping(value="/antecendentes/alergias/registrar")
    public boolean registrar (@RequestBody @Valid Alergias_model alergia){
        return aler_serv.registrar(alergia);
    }

    @GetMapping(value = "/antecedentes/alergias/ByPaciente")
    @ResponseBody
    public List<Alergias>listar_byPaciente(int id_paciente){
        return aler_serv.getAlergiasByPaciente(id_paciente);
    }  
}