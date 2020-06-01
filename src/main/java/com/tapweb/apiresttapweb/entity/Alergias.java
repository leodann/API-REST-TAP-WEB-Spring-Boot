package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "alergias")
public class Alergias implements Serializable{
    @GeneratedValue
    @Id
    @Column (name = "id_alergia")
    private int id_alergia;
    @Column(name = "alergia")
    private String alergia;

    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @JsonIgnore
    private Paciente paciente_alergia;


    public Alergias() {
    }

    public Alergias(int id_alergia, String alergia, Paciente paciente_alergia) {
        this.id_alergia = id_alergia;
        this.alergia = alergia;
        this.paciente_alergia = paciente_alergia;
    }

    public Alergias (String alergia, Paciente paciente){
        this.alergia = alergia;
        this.paciente_alergia = paciente;
    }

    public int getId_alergia() {
        return this.id_alergia;
    }

    public void setId_alergia(int id_alergia) {
        this.id_alergia = id_alergia;
    }

    public String getAlergia() {
        return this.alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public Paciente getPaciente_alergia() {
        return this.paciente_alergia;
    }

    public void setPaciente_alergia(Paciente paciente_alergia) {
        this.paciente_alergia = paciente_alergia;
    }

    @Override
    public String toString() {
        return "{" +
            " id_alergia='" + getId_alergia() + "'" +
            ", alergia='" + getAlergia() + "'" +
            ", paciente_alergia='" + getPaciente_alergia() + "'" +
            "}";
    }
}