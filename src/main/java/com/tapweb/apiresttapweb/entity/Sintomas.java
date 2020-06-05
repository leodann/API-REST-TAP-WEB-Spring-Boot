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
@Table(name = "sintomas")
public class Sintomas implements Serializable{
    @GeneratedValue 
    @Id
    @Column(name = "id_sintoma")
    private int id_sintoma;
    @Column(name = "sintoma_prueba")
    private String sintoma_prueba;

    @ManyToOne
    @JoinColumn(name = "id_consutla", referencedColumnName = "id_consulta")
    @JsonIgnore
    private Consultas consulta;


    public Sintomas() {
    }

    public Sintomas(int id_sintoma, String sintoma_prueba, Consultas consulta) {
        this.id_sintoma = id_sintoma;
        this.sintoma_prueba = sintoma_prueba;
        this.consulta = consulta;
    }

    public Sintomas (String sintoma_prueba, Consultas c){
        this.consulta = c;
        this.sintoma_prueba = sintoma_prueba;
    }

    public int getId_sintoma() {
        return this.id_sintoma;
    }

    public void setId_sintoma(int id_sintoma) {
        this.id_sintoma = id_sintoma;
    }

    public String getSintoma_prueba() {
        return this.sintoma_prueba;
    }

    public void setSintoma_prueba(String sintoma_prueba) {
        this.sintoma_prueba = sintoma_prueba;
    }

    public Consultas getConsulta() {
        return this.consulta;
    }

    public void setConsulta(Consultas consulta) {
        this.consulta = consulta;
    }

    @Override
    public String toString() {
        return "{" +
            " id_sintoma='" + getId_sintoma() + "'" +
            ", sintoma_prueba='" + getSintoma_prueba() + "'" +
            ", consulta='" + getConsulta() + "'" +
            "}";
    }
}