package com.tapweb.apiresttapweb.model;

import java.util.List;

import com.tapweb.apiresttapweb.entity.Esp_med;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.entity.Persona;

public class Medico_model {
    private int id_persona;
    private String numero_cedula;
    private Persona persona;
    private List<Esp_med>esp_meds;


    public Medico_model() {
    }

    public Medico_model(int id_persona, String numero_cedula, Persona persona) {
        this.id_persona = id_persona;
        this.numero_cedula = numero_cedula;
        this.persona = persona;
    }

    public Medico_model(int id_persona,String numero_cedula) {
        this.id_persona = id_persona;
        this.numero_cedula = numero_cedula;        
    }

    public Medico_model(Medico m){
        this.id_persona = m.getId_persona();
        this.numero_cedula = m.getNumero_cedula();
        this.persona = m.getPersona();
        this.esp_meds = m.gEsp_meds();
    }

    public List<Esp_med>gEsp_meds(){
        return this.esp_meds;
    }

    public void setEsp_mesd(List<Esp_med> e){
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