package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.entity.Servicios;
import com.tapweb.apiresttapweb.model.Servicios_model;
import com.tapweb.apiresttapweb.service.Servicios_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Servicios_controller {
    @Autowired
    @Qualifier("serv_serv")
    private Servicios_service serv_serv;

    @GetMapping(value="/servicios/list")
    public List<Servicios_model> servicios(){
        return serv_serv.listar();
    }

    @PostMapping(value = "/servicios/registrar")
    public boolean registrar(@RequestBody Servicios servicio){
        System.out.println(servicio.toString());
        return true;
    }

    /*@PostMapping(value="/servicios/insertar")
    public boolean insertar(@RequestBody @Valid Servicios servicio){
        System.out.println(servicio.toString());
        return true;
        //return serv_serv.registrar(servicio);
    }*/

}