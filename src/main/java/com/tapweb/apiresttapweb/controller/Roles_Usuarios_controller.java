package com.tapweb.apiresttapweb.controller;


import javax.validation.Valid;

import com.tapweb.apiresttapweb.entity.Roles_Usuarios;
import com.tapweb.apiresttapweb.llaves_compuestas.Roles_Usuarios_Id;
import com.tapweb.apiresttapweb.service.Roles_Usuarios_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/v1")
public class Roles_Usuarios_controller {
    @Autowired
    @Qualifier("roles_serv")
    private Roles_Usuarios_service roles_serv;

    @GetMapping(value = "/roles_usuarios/list")
    public Iterable<Roles_Usuarios> getRoles(){
        return roles_serv.listar_roles_u();
    }

    @PostMapping(value="/roles_usuarios/registrar")
    public boolean postMethodName(@RequestBody @Valid Roles_Usuarios_Id pk){                
        return roles_serv.registrar(pk);
    }
    
    
}