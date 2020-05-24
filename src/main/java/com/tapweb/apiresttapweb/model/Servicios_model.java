package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Servicios;

public class Servicios_model {

    private int id_servicio;
    private String servicio;

    public Servicios_model() {
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public Servicios_model(int id, String servicio) {
        this.setId_servicio(id);
        this.servicio = servicio;
    }

    public Servicios_model(Servicios servicio) {
        this.setId_servicio(servicio.getId_servicio());
        this.servicio = servicio.getServicio();        
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