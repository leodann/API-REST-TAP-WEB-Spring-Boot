package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles_usuario")
public class Roles_Usuarios implements Serializable{
    @Id
    @Column(name = "id_rol")
    private int id_rol;    
    @Column(name="id_usuario")
    private int id_usuario;

    public Roles_Usuarios() {
    }

    public Roles_Usuarios(int id_rol, int id_usuario) {
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

    public Roles_Usuarios id_rol(int id_rol) {
        this.id_rol = id_rol;
        return this;
    }

    public Roles_Usuarios id_usuario(int id_usuario) {
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