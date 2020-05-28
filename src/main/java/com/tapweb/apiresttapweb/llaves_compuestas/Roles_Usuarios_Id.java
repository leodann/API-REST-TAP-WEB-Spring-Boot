package com.tapweb.apiresttapweb.llaves_compuestas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Roles_Usuarios_Id implements Serializable{
    @Column(name = "id_rol")
    private int id_rol;
    @Column(name = "id_usuario")
    private int id_usuario;

    public Roles_Usuarios_Id() {
    }

    public Roles_Usuarios_Id(int id_rol, int id_usuario) {
        this.id_rol = id_rol;
        this.id_usuario = id_usuario;
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

    public Roles_Usuarios_Id id_rol(int id_rol) {
        this.id_rol = id_rol;
        return this;
    }

    public Roles_Usuarios_Id id_usuario(int id_usuario) {
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