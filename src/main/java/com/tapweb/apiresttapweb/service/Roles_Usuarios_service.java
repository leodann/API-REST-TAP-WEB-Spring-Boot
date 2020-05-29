package com.tapweb.apiresttapweb.service;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Roles;
import com.tapweb.apiresttapweb.entity.Roles_Usuarios;
import com.tapweb.apiresttapweb.entity.Usuarios;
import com.tapweb.apiresttapweb.repository.Roles_Usuarios_repo;


import com.tapweb.apiresttapweb.composite_keys.Roles_Usuario_PK;
import com.tapweb.apiresttapweb.model.Roles_Usuarios_model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("roles_u_serv")
public class Roles_Usuarios_service {
    @Autowired
    @Qualifier("roles_u_repo")
    private Roles_Usuarios_repo roles_u_repo;    
    @Autowired
    @Qualifier("user_serv")
    private Usuarios_service user_serv;
    @Autowired
    @Qualifier("rol_serv")
    private Roles_service rol_serv;


    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;
    
    public boolean registrar(Roles_Usuario_PK pk){                
        Roles rol = rol_serv.getRol(pk.getId_rol());        
        Usuarios usuario = user_serv.getUsuario(pk.getId_usuario());
        Roles_Usuarios roles_u = new Roles_Usuarios(pk,rol,usuario);
        try{    
            
            roles_u_repo.save(roles_u);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Iterable<Roles_Usuarios> listar_roles_u(){
        return roles_u_repo.findAll();
    }

    public Roles_Usuarios_model getRolesByUser(int id_usuario){
        Roles_Usuarios aux_rol = roles_u_repo.findByIdUser(id_usuario);
        Roles_Usuarios_model rol = new Roles_Usuarios_model(                                    
                                    aux_rol.getId().getId_usuario(),
                                    aux_rol.getId().getId_rol()
        );
        return rol;
    }
}