package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Enf_Cronicas;
import com.tapweb.apiresttapweb.entity.Paciente;

public class Enf_Cronicas_model {
    private int id_enf;
    private String enf_cronica;
    private int id_persona;

    private Paciente paciente_enfermedades;


    public Enf_Cronicas_model() {
    }

    public Enf_Cronicas_model(int id_enf, String enf_cronica, int id_persona, Paciente paciente_enfermedades) {
        this.id_enf = id_enf;
        this.enf_cronica = enf_cronica;
        this.id_persona = id_persona;
        this.paciente_enfermedades = paciente_enfermedades;
    }

    public Enf_Cronicas_model (String s, int id){
        this.enf_cronica = s;
        this.id_persona = id;
    }
    public Enf_Cronicas_model (Enf_Cronicas e){
        this.id_enf = e.getId_enf();
        this.enf_cronica = e.getEnf_cronica();
        this.id_persona = e.getPaciente_cronica().getId_persona();
        this.paciente_enfermedades = e.getPaciente_cronica();
    }

    public int getId_enf() {
        return this.id_enf;
    }

    public void setId_enf(int id_enf) {
        this.id_enf = id_enf;
    }

    public String getEnf_cronica() {
        return this.enf_cronica;
    }

    public void setEnf_cronica(String enf_cronica) {
        this.enf_cronica = enf_cronica;
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public Paciente getPaciente_enfermedades() {
        return this.paciente_enfermedades;
    }

    public void setPaciente_enfermedades(Paciente paciente_enfermedades) {
        this.paciente_enfermedades = paciente_enfermedades;
    }

    @Override
    public String toString() {
        return "{" +
            " id_enf='" + getId_enf() + "'" +
            ", enf_cronica='" + getEnf_cronica() + "'" +
            ", id_persona='" + getId_persona() + "'" +
            ", paciente_enfermedades='" + getPaciente_enfermedades() + "'" +
            "}";
    }    
}