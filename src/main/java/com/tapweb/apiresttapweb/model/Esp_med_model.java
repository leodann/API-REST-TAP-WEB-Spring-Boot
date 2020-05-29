package com.tapweb.apiresttapweb.model;

public class Esp_med_model {
    private int id_persona;
    private  int id_especialidad;
    
    

    public Esp_med_model() {
    }

    public Esp_med_model(int id_persona, int id_especialidad) {
        this.id_persona = id_persona;
        this.id_especialidad = id_especialidad;
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_especialidad() {
        return this.id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    @Override
    public String toString() {
        return "{" +
            " id_persona='" + getId_persona() + "'" +
            ", id_especialidad='" + getId_especialidad() + "'" +
            "}";
    }
    
}