package com.tapweb.apiresttapweb.model;

import java.util.*;

import com.tapweb.apiresttapweb.entity.Roles_Usuarios;
import com.tapweb.apiresttapweb.entity.Usuarios;

public class Usuarios_model {
    private int id_usuario;
    private String email;
    private String password;
    private List<Roles_Usuarios> roles;


    public Usuarios_model() {
    }

    public Usuarios_model(int id_usuario, String email, String password) {
        this.id_usuario = id_usuario;
        this.email = email;
        this.password = password;
    }

    public Usuarios_model(Usuarios usuario){
        this.id_usuario = usuario.getId_usuario();
        this.email = usuario.getEmail();
        this.password = usuario.getPassword();
        this.roles = usuario.getRoles();
    }

    public List<Roles_Usuarios> getRoles(){
        return this.roles;
    }

    public void setRoles(List<Roles_Usuarios> roles){
        this.roles = roles;
    }

    public int getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuarios_model id_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
        return this;
    }

    public Usuarios_model email(String email) {
        this.email = email;
        return this;
    }

    public Usuarios_model password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_usuario='" + getId_usuario() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }
    
}