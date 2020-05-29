package com.tapweb.apiresttapweb.controller;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.entity.Roles_Usuarios;
import com.tapweb.apiresttapweb.service.Roles_Usuarios_service;
import com.tapweb.apiresttapweb.composite_keys.Roles_Usuario_PK;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/v1")
public class Roles_Usuarios_controller {
    @Autowired
    @Qualifier("roles_u_serv")
    private Roles_Usuarios_service roles_u_serv;
    
    @ResponseBody
    @GetMapping(value = "/roles_usuarios/listar")
    public Iterable<Roles_Usuarios> getRoles(){
        return roles_u_serv.listar_roles_u();
    }

    @PostMapping(value="/roles_usuarios/registrar")
    public boolean postMethodName(@RequestBody @Valid Roles_Usuario_PK pk){    
        System.out.println(pk.toString());                  
        return roles_u_serv.registrar(pk);
    }
}