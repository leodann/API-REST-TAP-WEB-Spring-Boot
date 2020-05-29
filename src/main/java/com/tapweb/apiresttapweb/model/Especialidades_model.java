package com.tapweb.apiresttapweb.model;

import java.util.List;

import com.tapweb.apiresttapweb.entity.Esp_med;
import com.tapweb.apiresttapweb.entity.Especialidades;

public class Especialidades_model {
    private int id_especialidad;
    private String especialidad;    
    private List<Esp_med> esp_meds;

    public Especialidades_model() {
    }

    public Especialidades_model(int id_especialidad, String especialidad) {
        this.id_especialidad = id_especialidad;
        this.especialidad = especialidad;
    }

    public Especialidades_model(Especialidades es){
        this.id_especialidad = es.getId_especialidad();
        this.especialidad = es.getEspecialidad();
        this.esp_meds = es.gEsp_meds();
    }
    
    public List<Esp_med>gEsp_meds(){
        return this.esp_meds;
    }

    public void setEsp_meds(List<Esp_med>e){
        this.esp_meds = e;
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

