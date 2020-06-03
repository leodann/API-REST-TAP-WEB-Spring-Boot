package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Consultas;
import com.tapweb.apiresttapweb.entity.Esp_Consultas;
import com.tapweb.apiresttapweb.entity.Especialidades;

public class Esp_Consutlas_model {
    private int id_especialidad;
    private int id_consulta;
    
    private Consultas consulta;
    private Especialidades especialidad;


    public Esp_Consutlas_model() {
    }

    public Esp_Consutlas_model(int id_especialidad, int id_consulta, Consultas consulta, Especialidades especialidad) {
        this.id_especialidad = id_especialidad;
        this.id_consulta = id_consulta;
        this.consulta = consulta;
        this.especialidad = especialidad;
    }

    public Esp_Consutlas_model(Esp_Consultas e){
        this.id_especialidad = e.getId().getId_especialidad();
        this.id_consulta = e.getId().getId_consulta();
        this.consulta = e.getConsulta();
        this.especialidad = e.getEspecialidad();
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

    public Consultas getConsulta() {
        return this.consulta;
    }

    public void setConsulta(Consultas consulta) {
        this.consulta = consulta;
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
            " id_especialidad='" + getId_especialidad() + "'" +
            ", id_consulta='" + getId_consulta() + "'" +
            ", consulta='" + getConsulta() + "'" +
            ", especialidad='" + getEspecialidad() + "'" +
            "}";
    }
}