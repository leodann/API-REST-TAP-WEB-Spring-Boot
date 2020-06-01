package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Cirugias;
import com.tapweb.apiresttapweb.entity.Paciente;

public class Cirugias_model {
    
    private int id_cirugia;
    private String cirugia;
    private int id_persona;

    private Paciente paciente;


    public Cirugias_model() {
    }

    public Cirugias_model(int id_cirugia, String cirugia, int id_persona, Paciente paciente) {
        this.id_cirugia = id_cirugia;
        this.cirugia = cirugia;
        this.id_persona = id_persona;
        this.paciente = paciente;
    }

    public Cirugias_model(String cirugia, int id_persona) {        
        this.cirugia = cirugia;
        this.id_persona = id_persona;        
    }

    public Cirugias_model (Cirugias cirugia){
        this.id_cirugia = cirugia.getId_cirugia();
        this.cirugia = cirugia.getCirugia();
        this.id_persona = cirugia.getPaciente().getId_persona();
        this.paciente = cirugia.getPaciente();
    }

    public int getId_cirugia() {
        return this.id_cirugia;
    }

    public void setId_cirugia(int id_cirugia) {
        this.id_cirugia = id_cirugia;
    }

    public String getCirugia() {
        return this.cirugia;
    }

    public void setCirugia(String cirugia) {
        this.cirugia = cirugia;
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "{" +
            " id_cirugia='" + getId_cirugia() + "'" +
            ", cirugia='" + getCirugia() + "'" +
            ", id_persona='" + getId_persona() + "'" +
            ", paciente='" + getPaciente() + "'" +
            "}";
    }

    
}