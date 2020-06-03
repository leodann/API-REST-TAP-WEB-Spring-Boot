package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.tapweb.apiresttapweb.composite_keys.Esp_Consultas_PK;

@Entity
@Table(name = "esp_consulta")
public class Esp_Consultas implements Serializable{
    @EmbeddedId
    private Esp_Consultas_PK id;

    @ManyToOne
    @MapsId("id_especialidad")
    @JoinColumn(name = "id_especialidad",nullable = false)
    private Especialidades especialidad_cons;

    @ManyToOne
    @MapsId("id_consulta")
    @JoinColumn(name = "id_consulta", nullable = false)
    private Consultas consulta_esp;


    public Esp_Consultas() {
    }

    public Esp_Consultas(Esp_Consultas_PK pk){
        this.id = pk;
    }

    public Esp_Consultas(Esp_Consultas_PK id, Especialidades especialidad, Consultas consulta) {
        this.id = id;
        this.especialidad_cons = especialidad;
        this.consulta_esp = consulta;
    }

    public Esp_Consultas_PK getId() {
        return this.id;
    }

    public void setId(Esp_Consultas_PK id) {
        this.id = id;
    }

    public Especialidades getEspecialidad() {
        return this.especialidad_cons;
    }

    public void setEspecialidad(Especialidades especialidad) {
        this.especialidad_cons = especialidad;
    }

    public Consultas getConsulta() {
        return this.consulta_esp;
    }

    public void setConsulta(Consultas consulta) {
        this.consulta_esp = consulta;
    }    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", especialidad='" + getEspecialidad() + "'" +
            ", consulta='" + getConsulta() + "'" +
            "}";
    }
}