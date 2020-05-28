package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios implements Serializable{
    @GeneratedValue
    @Id
    @Column(name = "id_usuario")
    private int id_usuario;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;


    public Usuarios() {
    }

    public Usuarios(int id_usuario, String email, String password) {
        this.id_usuario = id_usuario;
        this.email = email;
        this.password = password;
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

    public Usuarios id_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
        return this;
    }

    public Usuarios email(String email) {
        this.email = email;
        return this;
    }

    public Usuarios password(String password) {
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