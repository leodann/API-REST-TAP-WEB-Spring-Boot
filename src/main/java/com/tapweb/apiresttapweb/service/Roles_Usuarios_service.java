package com.tapweb.apiresttapweb.service;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Roles_Usuarios;
import com.tapweb.apiresttapweb.llaves_compuestas.Roles_Usuarios_Id;
import com.tapweb.apiresttapweb.model.Roles_Usuarios_model;
import com.tapweb.apiresttapweb.repository.Roles_Usuarios_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("roles_serv")
public class Roles_Usuarios_service {   
    @Autowired
    @Qualifier("roles_repo")
    private Roles_Usuarios_repo roles_repo;

    @Autowired 
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar(Roles_Usuarios_Id pk){
        try{    
            Roles_Usuarios roles_u = new Roles_Usuarios(pk);
            roles_repo.save(roles_u);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Iterable<Roles_Usuarios> listar_roles_u(){
        return roles_repo.findAll();
    }

    public Roles_Usuarios_model getRolesByUser(int id_usuario){
        Roles_Usuarios aux_rol = roles_repo.findByIdUser(id_usuario);
        Roles_Usuarios_model rol = new Roles_Usuarios_model(
                                    aux_rol.getId().getId_rol(),
                                    aux_rol.getId().getId_usuario()
        );
        return rol;
    }

    /*public List<Roles_Usuarios_model> listar_roles_u(){
        return convertidor.convertir_lista_roles_usuarios(roles_repo.findAll());
    }*/

    /*public Roles_Usuarios_model getByUser(int id_usuario){
        Roles_Usuarios aux_rol = roles_repo.findByIdUser(id_usuario);
        Roles_Usuarios_model rol = new Roles_Usuarios_model(
                                aux_rol.getId_rol(),
                                aux_rol.getId_usuario()
        );
         return rol;
    }*/
    
}