package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Especialidad;

public class Especialidad_model {
    private int id_especialidad;
    private String especialidad;


    public Especialidad_model() {
    }

    public Especialidad_model(int id_especialidad, String especialidad) {
        this.id_especialidad = id_especialidad;
        this.especialidad = especialidad;
    }

    public Especialidad_model(Especialidad especialidad){
        this.id_especialidad = especialidad.getId_especialidad();
        this.especialidad = especialidad.getEspecialidad();
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

    public Especialidad_model id_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
        return this;
    }

    public Especialidad_model especialidad(String especialidad) {
        this.especialidad = especialidad;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_especialidad='" + getId_especialidad() + "'" +
            ", especialidad='" + getEspecialidad() + "'" +
            "}";
    }

}