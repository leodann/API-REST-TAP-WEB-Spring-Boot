package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.entity.Servicios;

public class Servicios_model {
    private int id_servicio;
    private String servicio;
    private int costo;
    private int id_persona;

    private Medico medico;


    public Servicios_model() {
    }

    public Servicios_model(int id_servicio, String servicio, int costo, int id_persona, Medico medico) {
        this.id_servicio = id_servicio;
        this.servicio = servicio;
        this.costo = costo;
        this.id_persona = id_persona;
        this.medico = medico;
    }

    public Servicios_model(String servicio, int costo, int id_persona, Medico medico) {     
        this.servicio = servicio;
        this.costo = costo;
        this.id_persona = id_persona;
        this.medico = medico;
    }

    public Servicios_model(String servicio, int costo, int id_persona) {     
        this.servicio = servicio;
        this.costo = costo;
        this.id_persona = id_persona;        
    }

    public Servicios_model(Servicios s){
        this.id_servicio = s.getId_servicio();
        this.servicio = s.getServicio();
        this.costo = s.getCosto();  
        this.id_persona = s.getMedico().getId_persona();   
        this.medico = s.getMedico();
    }

    public int getId_servicio() {
        return this.id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getServicio() {
        return this.servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getCosto() {
        return this.costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "{" +
            " id_servicio='" + getId_servicio() + "'" +
            ", servicio='" + getServicio() + "'" +
            ", costo='" + getCosto() + "'" +
            ", id_persona='" + getId_persona() + "'" +
            ", medico='" + getMedico() + "'" +
            "}";
    }
}