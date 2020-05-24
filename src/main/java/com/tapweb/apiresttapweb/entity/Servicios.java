package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name="servicios")
@Entity
public class Servicios implements Serializable{
    @GeneratedValue
    @Id
    @Column(name="id_servicio")
    private int id_servicio;
    @Column(name="servicio")
    private String servicio;

    public Servicios() {
    }

    public Servicios(int id, String servicio) {
        this.id_servicio = id;
        this.servicio = servicio;
    }

    public int getId_servicio(){
        return this.id_servicio;
    }

    public void setId_servicio(int id){
        this.id_servicio = id;
    }

    public String getServicio() {
        return this.servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Servicios servicio(String servicio) {
        this.servicio = servicio;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_servicio='"+getId_servicio()+"'"+
            " servicio='" + getServicio() + "'" +
            "}";
    }

}