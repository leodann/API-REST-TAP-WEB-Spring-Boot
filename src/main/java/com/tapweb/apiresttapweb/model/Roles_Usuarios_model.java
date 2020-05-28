package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Roles_Usuarios;

public class Roles_Usuarios_model{
    private int id_usuario;
    private int id_rol;

    public Roles_Usuarios_model() {
    }

    public Roles_Usuarios_model(int id_usuario, int id_rol) {
        this.id_usuario = id_usuario;
        this.id_rol = id_rol;
    }

    public Roles_Usuarios_model(Roles_Usuarios rol){
        this.id_rol = rol.getId().getId_rol();
        this.id_usuario = rol.getId().getId_usuario();
    }

    public int getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_rol() {
        return this.id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    @Override
    public String toString() {
        return "{" +
            " id_usuario='" + getId_usuario() + "'" +
            ", id_rol='" + getId_rol() + "'" +
            "}";
    }

}

