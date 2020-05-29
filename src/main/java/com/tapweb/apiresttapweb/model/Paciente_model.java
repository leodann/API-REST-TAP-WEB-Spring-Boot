package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Paciente;
import com.tapweb.apiresttapweb.entity.Persona;

public class Paciente_model {

    private int id_persona;
    private String fecha_nac;
    private Persona persona;


    public Paciente_model() {
    }

    public Paciente_model(int id_persona, String fecha_nac, Persona persona) {
        this.id_persona = id_persona;
        this.fecha_nac = fecha_nac;
        this.persona = persona;
    }

    public Paciente_model(int id_persona, String fecha_nac) {
        this.id_persona = id_persona;
        this.fecha_nac = fecha_nac;        
    }

    public Paciente_model(Paciente p){
        this.id_persona = p.getId_persona();
        this.fecha_nac = p.getFecha_nac();
        this.persona = p.getPersona();
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getFecha_nac() {
        return this.fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    @Override
    public String toString() {
        return "{" +
            " id_persona='" + getId_persona() + "'" +
            ", fecha_nac='" + getFecha_nac() + "'" +
            ", persona='" + getPersona() + "'" +
            "}";
    }


    
}