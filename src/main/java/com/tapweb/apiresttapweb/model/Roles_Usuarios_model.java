package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Roles_Usuarios;

public class Roles_Usuarios_model {
    private int id_rol;
    private int id_usuario;


    public Roles_Usuarios_model() {
    }

    public Roles_Usuarios_model(int id_rol, int id_usuario) {
        this.id_rol = id_rol;
        this.id_usuario = id_usuario;
    }

    public Roles_Usuarios_model(Roles_Usuarios r_u){
        this.id_rol = r_u.getId_rol();
        this.id_usuario = r_u.getId_usuario();
    }

    public int getId_rol() {
        return this.id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public int getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Roles_Usuarios_model id_rol(int id_rol) {
        this.id_rol = id_rol;
        return this;
    }

    public Roles_Usuarios_model id_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_rol='" + getId_rol() + "'" +
            ", id_usuario='" + getId_usuario() + "'" +
            "}";
    }

    
}