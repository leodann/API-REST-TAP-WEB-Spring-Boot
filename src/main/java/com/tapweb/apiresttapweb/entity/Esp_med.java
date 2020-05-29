package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tapweb.apiresttapweb.composite_keys.Esp_med_PK;

@Entity
@Table(name = "medico_especialidad")
public class Esp_med implements Serializable{
    @EmbeddedId
    private Esp_med_PK id;

    @ManyToOne
    @MapsId("id_persona")
    @JoinColumn(name = "id_persona", nullable = false)
    @JsonIgnore
    private Medico medico;

    @ManyToOne
    @MapsId("id_especialidad")
    @JoinColumn(name = "id_especialidad", nullable = false)
    @JsonIgnore
    private Especialidades especialidad;


    public Esp_med() {
    }

    public Esp_med(Esp_med_PK id) {
        this.id = id;        
    }

    public Esp_med(Esp_med_PK id, Medico medico, Especialidades especialidad) {
        this.id = id;
        this.medico = medico;
        this.especialidad = especialidad;
    }

    public Esp_med_PK getId() {
        return this.id;
    }

    public void setId(Esp_med_PK id) {
        this.id = id;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Especialidades getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(Especialidades especialidad) {
        this.especialidad = especialidad;
    }    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", medico='" + getMedico() + "'" +
            ", especialidad='" + getEspecialidad() + "'" +
            "}";
    }
}