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
@Table(name = "enf_cronicas")
public class Enf_Cronicas implements Serializable{
    @GeneratedValue
    @Id
    @Column(name = "id_enf")
    private int id_enf;
    @Column(name = "enf_cronica")
    private String enf_cronica;

    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @JsonIgnore
    private Paciente paciente_cronica;


    public Enf_Cronicas() {
    }

    public Enf_Cronicas(int id_enf, String enf_cronica, Paciente paciente_cronica) {
        this.id_enf = id_enf;
        this.enf_cronica = enf_cronica;
        this.paciente_cronica = paciente_cronica;
    }

    public Enf_Cronicas(String enf_cronica, Paciente paciente_cronica) {        
        this.enf_cronica = enf_cronica;
        this.paciente_cronica = paciente_cronica;
    }

    public int getId_enf() {
        return this.id_enf;
    }

    public void setId_enf(int id_enf) {
        this.id_enf = id_enf;
    }

    public String getEnf_cronica() {
        return this.enf_cronica;
    }

    public void setEnf_cronica(String enf_cronica) {
        this.enf_cronica = enf_cronica;
    }

    public Paciente getPaciente_cronica() {
        return this.paciente_cronica;
    }

    public void setPaciente_cronica(Paciente paciente_cronica) {
        this.paciente_cronica = paciente_cronica;
    }

    @Override
    public String toString() {
        return "{" +
            " id_enf='" + getId_enf() + "'" +
            ", enf_cronica='" + getEnf_cronica() + "'" +
            ", paciente_cronica='" + getPaciente_cronica() + "'" +
            "}";
    }
}