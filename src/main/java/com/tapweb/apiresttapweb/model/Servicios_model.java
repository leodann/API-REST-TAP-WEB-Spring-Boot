package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Servicios;

public class Servicios_model {

    private int id_servicio;
    private String servicio;
    private int costo;
    private int id_persona;

    public Servicios_model() {
    }

    public Servicios_model(int id_servicio, String servicio, int costo, int id_persona){
        this.id_servicio = id_servicio;
        this.servicio = servicio;
        this.costo = costo;
        this.id_persona = id_persona;
    }
    
    public Servicios_model(Servicios servicio) {
        this.id_servicio = servicio.getId_servicio();
        this.servicio = servicio.getServicio();      
        this.costo = servicio.getCosto();
        this.id_persona = servicio.getId_Persona();
    }

    public int getCosto(){
        return this.costo;
    }

    public void setCosto(int costo){
        this.costo = costo;
    }

    public int getId_Persona(){
        return this.id_persona;
    }

    public void setId_Persona(int id){
        this.id_persona = id;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }
    
    public String getservicio() {
        return this.servicio;
    }

    public void setservicio(final String servicio) {
        this.servicio = servicio;
    }

    public Servicios_model servicio(final String servicio) {
        this.servicio = servicio;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_servicio='"+getId_servicio()+"'"+
            " servicio='" + getservicio() + "'" +
            "}";
    }

}