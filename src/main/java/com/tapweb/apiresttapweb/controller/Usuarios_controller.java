package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;


import com.tapweb.apiresttapweb.entity.Usuarios;
import com.tapweb.apiresttapweb.model.Usuarios_model;
import com.tapweb.apiresttapweb.service.Usuarios_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Usuarios_controller {
    @Autowired
    @Qualifier("user_serv")
    private Usuarios_service user_serv;
    @Autowired

    @GetMapping(value="/usuarios/listar")
    public List<Usuarios_model> listar_usuarios(){
        return user_serv.listar_usuarios();
    }

    @PostMapping(value="/usuarios/registrar")
    public boolean registrar_usuario(@RequestBody @Valid Usuarios usuario){
        return user_serv.registrar(usuario);
    }   

    @GetMapping(value = "/usuarios/get")
    public Usuarios_model getaUser(){
        return user_serv.getUserBypassword("test@mail.com", "testpass");
    }

    /*@PostMapping(value = "/usuarios/login")
    public User_login login (@RequestBody @Valid Usuarios aux_usuario){
        User_login loged;
        String password = aux_usuario.getPassword();        
        String email = aux_usuario.getEmail();                
        Usuarios_model user = user_serv.getUserBypassword(email,password);                
        Roles_Usuarios_model rol = roles_serv.getRolesByUser(user.getId_usuario());
        int id_persona = per_serv.getIdUser(user.getId_usuario());
        loged = new User_login(user.getId_usuario(), rol.getId_rol(), id_persona, true);
        return loged;
    }*/   
    
}