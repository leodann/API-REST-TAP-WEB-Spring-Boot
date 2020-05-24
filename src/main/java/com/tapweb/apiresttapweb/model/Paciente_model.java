package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Paciente;

public class Paciente_model {

    private int id_persona;
    private String fecha_nac;
    
    public Paciente_model() {
    }

    public Paciente_model(int id_persona, String fecha_nac) {
        this.id_persona = id_persona;
        this.fecha_nac = fecha_nac;
    }
    
    public Paciente_model(Paciente paciente) {
        this.id_persona = paciente.getId_persona();
        this.fecha_nac = paciente.getFecha_nac();
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

    public Paciente_model id_persona(int id_persona) {
        this.id_persona = id_persona;
        return this;
    }

    public Paciente_model fecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " id_persona='" + getId_persona() + "'" +
            ", fecha_nac='" + getFecha_nac() + "'" +
            "}";
    }


}
