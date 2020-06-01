package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Alergias;
import com.tapweb.apiresttapweb.entity.Paciente;

public class Alergias_model {
    private int id_alergia;
    private String alergia;
    private int id_persona;

    private Paciente paciente_alergias;


    public Alergias_model() {
    }

    public Alergias_model(int id_alergia, String alergia, int id_persona, Paciente paciente_alergias) {
        this.id_alergia = id_alergia;
        this.alergia = alergia;
        this.id_persona = id_persona;
        this.paciente_alergias = paciente_alergias;
    }

    public Alergias_model (Alergias a){
        this.id_alergia = a.getId_alergia();
        this.alergia = a.getAlergia();
        this.id_persona = a.getPaciente_alergia().getId_persona();
        this.paciente_alergias = a.getPaciente_alergia();
    }

    public int getId_alergia() {
        return this.id_alergia;
    }

    public void setId_alergia(int id_alergia) {
        this.id_alergia = id_alergia;
    }

    public String getAlergia() {
        return this.alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public Paciente getPaciente_alergias() {
        return this.paciente_alergias;
    }

    public void setPaciente_alergias(Paciente paciente_alergias) {
        this.paciente_alergias = paciente_alergias;
    }

    @Override
    public String toString() {
        return "{" +
            " id_alergia='" + getId_alergia() + "'" +
            ", alergia='" + getAlergia() + "'" +
            ", id_persona='" + getId_persona() + "'" +
            ", paciente_alergias='" + getPaciente_alergias() + "'" +
            "}";
    }
}