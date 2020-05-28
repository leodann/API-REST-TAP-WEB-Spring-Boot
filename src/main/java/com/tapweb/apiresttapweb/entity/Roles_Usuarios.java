package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.tapweb.apiresttapweb.composite_keys.Roles_Usuario_PK;


@Entity
@Table(name = "roles_usuario")
public class Roles_Usuarios implements Serializable{
    @EmbeddedId
    private Roles_Usuario_PK id;

    @ManyToOne
    @MapsId("id_rol")    
    @JoinColumn(name = "id_rol", nullable = false) 
    private Roles rol;

    @ManyToOne    
    @MapsId("id_usuario")
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuarios usuario;


    public Roles_Usuarios() {
    }

    public Roles_Usuarios(Roles_Usuario_PK pk) {
        this.id = pk;

    }

    public Roles_Usuarios(Roles_Usuario_PK id,Roles rol,Usuarios usuario) {
        this.id = id;
        this.rol = rol;
        this.usuario = usuario;
    }

    public Roles_Usuario_PK getId() {
        return this.id;
    }

    public void setId(final Roles_Usuario_PK id) {
        this.id = id;
    }

    public Roles getRol() {
        return this.rol;
    }

    public void setRol(final Roles rol) {
        this.rol = rol;
    }

    public Usuarios getUsuario() {
        return this.usuario;
    }

    public void setUsuario(final Usuarios usuario) {
        this.usuario = usuario;
    }

    public Roles_Usuarios id(final Roles_Usuario_PK id) {
        this.id = id;
        return this;
    }

    public Roles_Usuarios rol(final Roles rol) {
        this.rol = rol;
        return this;
    }

    public Roles_Usuarios usuario(final Usuarios usuario) {
        this.usuario = usuario;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", rol='" + getRol() + "'" +
            ", usuario='" + getUsuario() + "'" +
            "}";
    }
}