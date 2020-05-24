package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Especialidad_Medico;

public class Especialidad_Medico_model {
    private int id_persona;
    private int id_especialidad;


    public Especialidad_Medico_model() {
    }

    public Especialidad_Medico_model(int id_persona, int id_especialidad) {
        this.id_persona = id_persona;
        this.id_especialidad = id_especialidad;
    }

    public Especialidad_Medico_model(Especialidad_Medico esp){
        this.id_especialidad = esp.getId().getId_especialidad();
        this.id_persona = esp.getId().getId_persona();
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

    public Especialidad_Medico_model id_persona(int id_persona) {
        this.id_persona = id_persona;
        return this;
    }

    public Especialidad_Medico_model id_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_persona='" + getId_persona() + "'" +
            ", id_especialidad='" + getId_especialidad() + "'" +
            "}";
    }

    
}