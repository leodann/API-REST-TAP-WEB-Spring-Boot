package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles implements Serializable{
    @GeneratedValue
    @Id
    @Column(name = "id_rol")
    private int id_rol;
    @Column(name = "rol")    
    private String rol;

    public Roles() {
    }

    public Roles(int id_rol, String rol) {
        this.id_rol = id_rol;
        this.rol = rol;
    }

    public int getId_rol() {
        return this.id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Roles id_rol(int id_rol) {
        this.id_rol = id_rol;
        return this;
    }

    public Roles rol(String rol) {
        this.rol = rol;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_rol='" + getId_rol() + "'" +
            ", rol='" + getRol() + "'" +
            "}";
    }    
}