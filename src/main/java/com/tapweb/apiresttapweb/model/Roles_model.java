package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Roles;

public class Roles_model {
    private int id_rol;
    private String rol;
    
    public Roles_model() {
    }

    public Roles_model(int id_rol, String rol) {
        this.id_rol = id_rol;
        this.rol = rol;
    }

    public Roles_model(Roles rol){
        this.id_rol = rol.getId_rol();
        this.rol = rol.getRol();
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

    public Roles_model id_rol(int id_rol) {
        this.id_rol = id_rol;
        return this;
    }

    public Roles_model rol(String rol) {
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