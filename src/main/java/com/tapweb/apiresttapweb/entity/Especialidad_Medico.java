package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tapweb.apiresttapweb.llaves_compuestas.Especialidad_Medico_Id;

@Entity
@Table(name = "medico_especialidad")
public class Especialidad_Medico implements Serializable {
    @EmbeddedId
    private Especialidad_Medico_Id id;

    public Especialidad_Medico(){

    }

    public Especialidad_Medico(Especialidad_Medico_Id id){
        this.id = id;
    }

    public Especialidad_Medico_Id getId() {
        return this.id;
    }

    public void setId(Especialidad_Medico_Id id) {
        this.id = id;
    }

    public Especialidad_Medico id(Especialidad_Medico_Id id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            "}";
    }
}