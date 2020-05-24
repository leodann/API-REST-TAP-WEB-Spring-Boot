package com.tapweb.apiresttapweb.Esqueletos;

public class Eespecialidades_esq {
    private int id_especialidad;
    private String especialidad;


    public Eespecialidades_esq() {
    }

    public Eespecialidades_esq(int id_especialidad, String especialidad) {
        this.id_especialidad = id_especialidad;
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

    public Eespecialidades_esq id_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
        return this;
    }

    public Eespecialidades_esq especialidad(String especialidad) {
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