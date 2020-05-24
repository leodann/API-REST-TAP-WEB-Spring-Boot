package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name="medicos")
@Entity
public class Medico implements Serializable{
    @Id
    @Column (name ="id_persona")
    private int id_persona;
    @Column (name ="numero_cedula")
    private int numero_cedula;

    public Medico() {}

    public Medico(int _id, int _num){
        this.id_persona = _id;
        this.numero_cedula = _num;
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

    public Medico id_persona(int id_persona) {
        this.id_persona = id_persona;
        return this;
    }

    public Medico numero_cedula(int numero_cedula) {
        this.numero_cedula = numero_cedula;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Medico)) {
            return false;
        }
        Medico medico = (Medico) o;
        return id_persona == medico.id_persona && numero_cedula == medico.numero_cedula;
    }

    @Override
    public String toString() {
        return "{" +
            " id_persona='" + getId_persona() + "'" +
            ", numero_cedula='" + getNumero_cedula() + "'" +
            "}";
    }


}