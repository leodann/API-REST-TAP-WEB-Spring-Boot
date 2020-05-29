package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "especialidades")
public class Especialidades implements Serializable{
    @GeneratedValue
    @Id
    @Column(name = "id_especialidad")
    private int id_especialidad;

    @Column(name = "especialidad")
    private String especialidad;

    @OneToMany(mappedBy = "especialidad")
    @JsonIgnore
    private List<Esp_med>espe_med;

    public Especialidades() {
    }

    public Especialidades(int id_especialidad, String especialidad) {
        this.id_especialidad = id_especialidad;
        this.especialidad = especialidad;
    }

    public Especialidades(int id_especialidad, String especialidad, List<Esp_med> e_m) {
        this.id_especialidad = id_especialidad;
        this.especialidad = especialidad;
        this.espe_med = e_m;
    }

    public List<Esp_med> gEsp_meds(){
        return this.espe_med;
    }

    public void setEsp_meds(List<Esp_med>e){
        this.espe_med = e;
    }

    public Especialidades (String especialidad){
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

    @Override
    public String toString() {
        return "{" +
            " id_especialidad='" + getId_especialidad() + "'" +
            ", especialidad='" + getEspecialidad() + "'" +
            "}";
    }


    
}