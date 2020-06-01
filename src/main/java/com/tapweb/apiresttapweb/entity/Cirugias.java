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
@Table(name = "cirugias")
public class Cirugias implements Serializable{
    @GeneratedValue
    @Id
    @Column(name = "id_cirugia")
    private int id_cirugia;
    @Column(name = "cirugia")
    private String cirugia;

    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @JsonIgnore
    private Paciente paciente_cirugia;

    public Cirugias() {
    }

    public Cirugias (String cirugia, Paciente paciente){
        this.cirugia = cirugia;
        this.paciente_cirugia = paciente;
    }

    public Cirugias(int id_cirugia, String cirugia, Paciente paciente) {
        this.id_cirugia = id_cirugia;
        this.cirugia = cirugia;
        this.paciente_cirugia = paciente;
    }    

    public int getId_cirugia() {
        return this.id_cirugia;
    }

    public void setId_cirugia(int id_cirugia) {
        this.id_cirugia = id_cirugia;
    }

    public String getCirugia() {
        return this.cirugia;
    }

    public void setCirugia(String cirugia) {
        this.cirugia = cirugia;
    }

    public Paciente getPaciente() {
        return this.paciente_cirugia;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente_cirugia = paciente;
    }

    @Override
    public String toString() {
        return "{" +
            " id_cirugia='" + getId_cirugia() + "'" +
            ", cirugia='" + getCirugia() + "'" +
            ", paciente='" + getPaciente() + "'" +
            "}";
    }
}