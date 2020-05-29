package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pacientes")
public class Paciente implements Serializable{
    @Id
    @Column(name = "id_persona")
    private int id_persona;

    @Column(name = "fecha_nac")
    private String fecha_nac;

    @OneToOne
    @JoinColumn(name = "id_persona")
    @JsonIgnore
    private Persona persona;


    public Paciente() {
    }

    public Paciente(int id_persona, String fecha_nac, Persona persona) {
        this.id_persona = id_persona;
        this.fecha_nac = fecha_nac;
        this.persona = persona;
    }

    public Paciente(int id_persona, String fecha_nac) {
        this.id_persona = id_persona;
        this.fecha_nac = fecha_nac;        
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getFecha_nac() {
        return this.fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "{" +
            " id_persona='" + getId_persona() + "'" +
            ", fecha_nac='" + getFecha_nac() + "'" +
            ", persona='" + getPersona() + "'" +
            "}";
    }

}