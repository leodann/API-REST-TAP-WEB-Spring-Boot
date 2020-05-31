package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "medicos")
public class Medico implements Serializable{
    @Id
    @Column(name = "id_persona")
    private int id_persona;
    @Column(name = "numero_cedula")
    private String numero_cedula;

    @OneToOne
    @JoinColumn(name = "id_persona")
    //@JsonIgnore
    private Persona persona;

    @OneToMany(mappedBy = "medico")
    //@JsonIgnore
    private List<Esp_med> esp_meds;

    @OneToMany(mappedBy = "medico_servicios")
    private List<Servicios> servicios_medicos;


    public Medico() {
    }

    public Medico (int id_persona, String numero_cedula){
        this.id_persona = id_persona;
        this.numero_cedula = numero_cedula;
    }

    public Medico(int id_persona, String numero_cedula, Persona persona) {
        this.id_persona = id_persona;
        this.numero_cedula = numero_cedula;
        this.persona = persona;
    }

    public Medico(int id_persona, String numero_cedula,List<Esp_med>e) {
        this.id_persona = id_persona;
        this.numero_cedula = numero_cedula;        
        this.esp_meds = e;
    }

    public Medico(int id_persona, String numero_cedula, Persona persona, List<Esp_med>e) {
        this.id_persona = id_persona;
        this.numero_cedula = numero_cedula;
        this.persona = persona;
        this.esp_meds = e;
    }

    public Medico(int id_persona, String numero_cedula, Persona persona, List<Esp_med>e,List<Servicios>s) {
        this.id_persona = id_persona;
        this.numero_cedula = numero_cedula;
        this.persona = persona;
        this.esp_meds = e;
        this.servicios_medicos = s;
    }    

    public List<Servicios>gServicios(){
        return this.servicios_medicos;
    }

    public void setServicios(List<Servicios> s){
        this.servicios_medicos = s;
    }

    public List<Esp_med> gEsp_meds(){
        return this.esp_meds;
    }

    public void setEsp_meds(List<Esp_med>e){
        this.esp_meds = e;
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNumero_cedula() {
        return this.numero_cedula;
    }

    public void setNumero_cedula(String numero_cedula) {
        this.numero_cedula = numero_cedula;
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
            ", numero_cedula='" + getNumero_cedula() + "'" +
            ", persona='" + getPersona() + "'" +
            "}";
    }

}