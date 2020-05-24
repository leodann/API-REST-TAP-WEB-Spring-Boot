package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name ="especialidades")
@Entity
public class Especialidad implements Serializable{
    @GeneratedValue
    @Id
    @Column(name="id_especialidad")
    private int id_especialidad;
    @Column(name="especialidad")
    private String especialidad;


    public Especialidad() {
    }

    public Especialidad(int id_especialidad, String especialidad) {
        this.id_especialidad = id_especialidad;
        this.especialidad = especialidad;
    }

    public int getId_especialidad() {
        return this.id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Especialidad id_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
        return this;
    }

    public Especialidad especialidad(String especialidad) {
        this.especialidad = especialidad;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_especialidad='" + getId_especialidad() + "'" +
            ", especialidad='" + getEspecialidad() + "'" +
            "}";
    }

}