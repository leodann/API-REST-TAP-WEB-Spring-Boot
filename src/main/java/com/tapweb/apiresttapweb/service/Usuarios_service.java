package com.tapweb.apiresttapweb.service;

import java.util.List;
import java.util.Optional;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Usuarios;
import com.tapweb.apiresttapweb.model.Usuarios_model;
import com.tapweb.apiresttapweb.repository.Usuarios_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("user_serv")
public class Usuarios_service {
    @Autowired
    @Qualifier("user_repo")
    private Usuarios_repo user_repo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar(Usuarios usuario){
        try{
            user_repo.save(usuario);
            return true;
        }catch(Exception e){ 
            e.printStackTrace();
            return false;
        }
    }

    public List<Usuarios_model>listar_usuarios(){
        return convertidor.convertir_usuarios(user_repo.findAll());
    }

    public int getLastUserId(){
        return user_repo.getIdUserTopDesc();
    }    

    public Usuarios_model getUserBypassword(String email, String password){
        Usuarios aux_user = user_repo.findByEmailandPass(email, password);
        Usuarios_model usuario = new Usuarios_model(aux_user.getId_usuario(),
                                                    aux_user.getEmail(),
                                                    aux_user.getPassword());
        return usuario;
    }

    public Usuarios getUsuario(int id){
        return user_repo.getById(id);
    }
}