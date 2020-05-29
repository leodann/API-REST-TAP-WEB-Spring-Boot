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
@Table(name = "medicos")
public class Medico implements Serializable{
    @Id
    @Column(name = "id_persona")
    private int id_persona;
    @Column(name = "numero_cedula")
    private String numero_cedula;

    @OneToOne
    @JoinColumn(name = "id_persona")
    @JsonIgnore
    private Persona persona;


    public Medico() {
    }

    public Medico(int id_persona, String numero_cedula, Persona persona) {
        this.id_persona = id_persona;
        this.numero_cedula = numero_cedula;
        this.persona = persona;
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNumero_cedula() {
        return this.numero_cedula;
    }

    public void setNumero_cedula(String numero_cedula) {
        this.numero_cedula = numero_cedula;
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
            ", numero_cedula='" + getNumero_cedula() + "'" +
            ", persona='" + getPersona() + "'" +
            "}";
    }

}