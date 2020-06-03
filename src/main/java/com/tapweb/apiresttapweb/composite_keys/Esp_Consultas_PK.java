package com.tapweb.apiresttapweb.composite_keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Esp_Consultas_PK implements Serializable{
    @Column(name = "id_especialidad")
    private int id_especialidad;
    @Column(name = "id_consulta")
    private int id_consulta;


    public Esp_Consultas_PK() {
    }

    public Esp_Consultas_PK(int id_especialidad, int id_consulta) {
        this.id_especialidad = id_especialidad;
        this.id_consulta = id_consulta;
    }

    public int getId_especialidad() {
        return this.id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public int getId_consulta() {
        return this.id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    @Override
    public String toString() {
        return "{" +
            " id_especialidad='" + getId_especialidad() + "'" +
            ", id_consulta='" + getId_consulta() + "'" +
            "}";
    }
}