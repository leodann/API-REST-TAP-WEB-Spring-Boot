package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tapweb.apiresttapweb.llaves_compuestas.Roles_Usuarios_Id;

@Entity
@Table(name = "roles_usuario")
public class Roles_Usuarios implements Serializable{
    @EmbeddedId
    private Roles_Usuarios_Id id;

    public Roles_Usuarios (){}

    public Roles_Usuarios (Roles_Usuarios_Id id){
        this.id = id;
    }

    public Roles_Usuarios_Id getId(){
        return this.id;
    }

    public void setId(Roles_Usuarios_Id id){
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "{"+
                " id_rol: '"+ id.getId_rol()+"'"+
                " id_usuario :'"+id.getId_usuario()+"'"+
                "}";

    }
}