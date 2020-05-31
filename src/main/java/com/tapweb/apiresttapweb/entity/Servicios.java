package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "servicios")
public class Servicios implements Serializable{
    @GeneratedValue
    @Id
    @Column(name = "id_servicio")
    private int id_servicio;
    @Column(name = "servicio")
    private String servicio;
    @Column(name = "costo")
    private int costo;    

    @ManyToOne
    @JoinColumn(name = "id_persona",referencedColumnName = "id_persona")
    @JsonIgnore
    private Medico medico_servicios;

    public Servicios() {
    }

    public Servicios(int id_servicio, String servicio, int costo,Medico medico) {
        this.id_servicio = id_servicio;
        this.servicio = servicio;
        this.costo = costo;        
        this.medico_servicios = medico;
    }    

    public Servicios(String servicio, int costo,Medico medico) {        
        this.servicio = servicio;
        this.costo = costo;        
        this.medico_servicios = medico;
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
    
    public Medico getMedico() {
        return this.medico_servicios;
    }

    public void setMedico(Medico medico) {
        this.medico_servicios = medico;
    }

    @Override
    public String toString() {
        return "{" +
            " id_servicio='" + getId_servicio() + "'" +
            ", servicio='" + getServicio() + "'" +
            ", costo='" + getCosto() + "'" +            
            ", medico='" + getMedico() + "'" +
            "}";
    }
}