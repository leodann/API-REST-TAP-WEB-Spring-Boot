package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Medico;

public class Medico_model {
    private int id_persona;
    private int numero_cedula;


    public Medico_model() {
    }

    public Medico_model(int id_persona, int numero_cedula) {
        this.id_persona = id_persona;
        this.numero_cedula = numero_cedula;
    }

    public Medico_model(Medico medico){
        this.id_persona = medico.getId_persona();
        this.numero_cedula = medico.getNumero_cedula();
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getNumero_cedula() {
        return this.numero_cedula;
    }

    public void setNumero_cedula(int numero_cedula) {
        this.numero_cedula = numero_cedula;
    }

    public Medico_model id_persona(int id_persona) {
        this.id_persona = id_persona;
        return this;
    }

    public Medico_model numero_cedula(int numero_cedula) {
        this.numero_cedula = numero_cedula;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Medico_model)) {
            return false;
        }
        Medico_model medico_model = (Medico_model) o;
        return id_persona == medico_model.id_persona && numero_cedula == medico_model.numero_cedula;
    }

    @Override
    public String toString() {
        return "{" +
            " id_persona='" + getId_persona() + "'" +
            ", numero_cedula='" + getNumero_cedula() + "'" +
            "}";
    }

}