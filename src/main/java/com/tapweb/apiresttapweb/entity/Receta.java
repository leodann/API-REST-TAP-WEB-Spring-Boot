package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "receta")
@Entity
public class Receta implements Serializable{
    @GeneratedValue
    @Id
    @Column(name = "id_receta")
    private int id_receta;
    @Column (name = "conclusion")
    private String conclusion;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "medicamentos")
    private String medicamentos;

    @OneToOne
    @JoinColumn(name = "id_consulta")
    private Consultas id_consulta;


    public Receta() {
    }

    public Receta(int id_receta, String conclusion, String descripcion, String medicamentos, Consultas id_consulta) {
        this.id_receta = id_receta;
        this.conclusion = conclusion;
        this.descripcion = descripcion;
        this.medicamentos = medicamentos;
        this.id_consulta = id_consulta;
    }
    public Receta(String conclusion, String descripcion, String medicamentos, Consultas id_consulta) {     
        this.conclusion = conclusion;
        this.descripcion = descripcion;
        this.medicamentos = medicamentos;
        this.id_consulta = id_consulta;
    }

    public int getId_receta() {
        return this.id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public String getConclusion() {
        return this.conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedicamentos() {
        return this.medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Consultas getId_consulta() {
        return this.id_consulta;
    }

    public void setId_consulta(Consultas id_consulta) {
        this.id_consulta = id_consulta;
    }

    @Override
    public String toString() {
        return "{" +
            " id_receta='" + getId_receta() + "'" +
            ", conclusion='" + getConclusion() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", medicamentos='" + getMedicamentos() + "'" +
            ", id_consulta='" + getId_consulta() + "'" +
            "}";
    }    
}