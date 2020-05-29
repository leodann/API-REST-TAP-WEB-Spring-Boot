package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.composite_objects.User_login;
import com.tapweb.apiresttapweb.entity.Usuarios;
import com.tapweb.apiresttapweb.model.Roles_Usuarios_model;
import com.tapweb.apiresttapweb.model.Usuarios_model;
import com.tapweb.apiresttapweb.service.Persona_service;
import com.tapweb.apiresttapweb.service.Roles_Usuarios_service;
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
    @Qualifier("roles_u_serv")
    private Roles_Usuarios_service roles_u_serv;
    @Autowired
    @Qualifier("per_serv")
    private Persona_service per_serv;

    @GetMapping(value="/usuarios/listar")
    public List<Usuarios_model> listar_usuarios(){
        return user_serv.listar_usuarios();
    }

    @PostMapping(value="/usuarios/registrar")
    public boolean registrar_usuario(@RequestBody @Valid Usuarios usuario){
        return user_serv.registrar(usuario);
    }

    @PostMapping(value="/usuarios/registrar/medico")
    public boolean registrar_usuario_medico(@RequestBody @Valid Usuarios usuario){                
        return user_serv.registrar_medico(usuario);
    }

    @PostMapping(value="/usuarios/registrar/paciente")
    public boolean registrar_usuario_paciente(@RequestBody @Valid Usuarios usuario){
        return user_serv.registrar_paciente(usuario);
    }

    @GetMapping(value = "/usuarios/get")
    public Usuarios_model getaUser(){
        return user_serv.getUserBypassword("test@mail.com", "testpass");
    }
    @PostMapping(value = "/usuarios/login")
    public User_login login (@RequestBody @Valid Usuarios aux_usuaio){
        User_login loged;
        String password = aux_usuaio.getPassword();
        String email = aux_usuaio.getEmail();
        Usuarios_model user = user_serv.getUserBypassword(email, password);
        Roles_Usuarios_model rol = roles_u_serv.getRolesByUser(user.getId_usuario());
        System.out.println(rol.toString());
        int id_persona = per_serv.getIdUser(user.getId_usuario());
        loged = new User_login(user.getId_usuario(),rol.getId_rol(),id_persona,true);
        return loged;
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