package com.tapweb.apiresttapweb.converter;

import java.util.ArrayList;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Roles;
import com.tapweb.apiresttapweb.entity.Usuarios;
import com.tapweb.apiresttapweb.model.Roles_model;
import com.tapweb.apiresttapweb.model.Usuarios_model;

import org.springframework.stereotype.Component;

@Component("convertidor")
public class Convertidor {
    
    public List<Usuarios_model>convertir_usuarios(List<Usuarios>usuarios){
        List<Usuarios_model>mUsuarios = new ArrayList<>();
        for (Usuarios usuario : usuarios){
            mUsuarios.add(new Usuarios_model(usuario));
        }
        return mUsuarios;
    }

    public List<Roles_model>convertir_roles (List<Roles>roles){
        List<Roles_model>mroles = new ArrayList<>();
        for(Roles rol : roles){
            mroles.add(new Roles_model(rol));
        }
        return mroles;
    }
}