package com.tapweb.apiresttapweb.llaves_compuestas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Especialidad_Medico_Id implements Serializable{
    @Column(name = "id_especialidad")
    private int id_especialidad;
    @Column(name = "id_persona")
    private int id_persona;

    public Especialidad_Medico_Id(int id_especialidad, int id_persona){
        this.id_especialidad = id_especialidad;
        this.id_persona = id_persona;
    }

    public Especialidad_Medico_Id(){}

    public int getId_especialidad() {
        return this.id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public Especialidad_Medico_Id id_especilidad(int id_especilidad) {
        this.id_especialidad = id_especilidad;
        return this;
    }

    public Especialidad_Medico_Id id_persona(int id_persona) {
        this.id_persona = id_persona;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_especilidad='" + getId_especialidad() + "'" +
            ", id_persona='" + getId_persona() + "'" +
            "}";
    }
    
}