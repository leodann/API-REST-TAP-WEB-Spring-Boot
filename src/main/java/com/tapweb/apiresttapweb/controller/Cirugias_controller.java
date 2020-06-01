package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.entity.Cirugias;
import com.tapweb.apiresttapweb.model.Cirugias_model;
import com.tapweb.apiresttapweb.service.Cirugias_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/v1")
public class Cirugias_controller {
    @Autowired
    @Qualifier("cir_serv")
    private Cirugias_service cir_serv;

    @GetMapping(value = "/antecedentes/cirugias/listar")
    public List<Cirugias_model>listar(){                        
        return cir_serv.listar_cirugias();
    }
    
    @PostMapping(value="/antecendentes/cirugias/registrar")
    public boolean registrar (@RequestBody @Valid Cirugias_model cirugia){
        return cir_serv.registrar(cirugia);
    }

    @GetMapping(value = "/antecedentes/cirugias/ByPaciente")
    @ResponseBody
    public List<Cirugias>listar_byPaciente(int id_paciente){
        return cir_serv.getCirguiaByPaciente(id_paciente);
    }    
}