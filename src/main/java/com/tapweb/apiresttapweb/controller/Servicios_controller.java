package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.entity.Servicios;
import com.tapweb.apiresttapweb.model.Servicios_model;
import com.tapweb.apiresttapweb.service.Servicios_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Servicios_controller {
    @Autowired
    @Qualifier("serv_serv")
    private Servicios_service serv_serv;

    @GetMapping(value="/servicios/listar")
    public List<Servicios_model> servicios(){
        return serv_serv.listar();
    }

    @PostMapping(value = "/servicios/registrar")
    public boolean registrar(@RequestBody Servicios_model servicio){
        return serv_serv.registrar(servicio);        
    }  
    
    @GetMapping(value="/servicios/listar/ByMedico")
    @ResponseBody
    public List<Servicios_model>listarByMedico(int id_persona){
        return serv_serv.listarByMedico(id_persona);
    }

    @GetMapping("/servicios/listar/ById")
    @ResponseBody
    public Servicios_model listarById(int id_servicio){
        return serv_serv.getServicioById(id_servicio);        
    }

    @PutMapping("/servicios/update")
    public int update(@RequestBody @Valid Servicios actualizado){
        return serv_serv.updateServicio(actualizado);
    }


    @DeleteMapping(value="/servicios/delete")
    public boolean deleteServicio(@RequestBody @Valid Servicios_model servicio) {
        return serv_serv.delete(servicio);
    }    
}