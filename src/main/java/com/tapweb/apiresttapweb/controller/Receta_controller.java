package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.composite_objects.Receta_wrapper;
import com.tapweb.apiresttapweb.entity.Receta;
import com.tapweb.apiresttapweb.model.Receta_model;
import com.tapweb.apiresttapweb.service.Receta_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/v1")
public class Receta_controller {
    @Autowired
    @Qualifier ("rec_serv")
    private Receta_service rec_serv;

    @GetMapping(value = "/recetas/listar")
    public List<Receta> listar (){
        return rec_serv.listar_receta();
    }

    @GetMapping(value = "/recetas/getByConsulta")
    public Receta getReceta (int id_consulta){
        return rec_serv.getReceta(id_consulta);
    }

    @PostMapping(value="/recetas/registrar")
    public boolean registrar (@RequestBody @Valid Receta_model r) {
        return rec_serv.registrarReceta(r);
    }    

    @PutMapping(value = "/recetas/update")
    public int update (@RequestBody @Valid Receta_wrapper rw){
        return rec_serv.UpdateReceta(rw);
    }

    @DeleteMapping(value = "/recetas/delete")
    public boolean delete (@RequestBody @Valid Receta_wrapper rw){
        return rec_serv.delete(rw);
    }
}