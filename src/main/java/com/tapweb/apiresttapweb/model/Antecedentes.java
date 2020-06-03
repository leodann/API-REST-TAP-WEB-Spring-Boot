package com.tapweb.apiresttapweb.model;

import java.util.List;

import com.tapweb.apiresttapweb.entity.Alergias;
import com.tapweb.apiresttapweb.entity.Cirugias;
import com.tapweb.apiresttapweb.entity.Enf_Cronicas;

public class Antecedentes {
    private int id_paciente;
    private List<Enf_Cronicas> cronicas;
    private List<Alergias>alergias;
    private List<Cirugias>cirugias;


    public Antecedentes() {
    }

    public Antecedentes(int id_paciente, List<Enf_Cronicas> cronicas, List<Alergias> alergias, List<Cirugias> cirugias) {
        this.id_paciente = id_paciente;
        this.cronicas = cronicas;
        this.alergias = alergias;
        this.cirugias = cirugias;
    }

    public int getId_paciente() {
        return this.id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public List<Enf_Cronicas> getCronicas() {
        return this.cronicas;
    }

    public void setCronicas(List<Enf_Cronicas> cronicas) {
        this.cronicas = cronicas;
    }

    public List<Alergias> getAlergias() {
        return this.alergias;
    }

    public void setAlergias(List<Alergias> alergias) {
        this.alergias = alergias;
    }

    public List<Cirugias> getCirugias() {
        return this.cirugias;
    }

    public void setCirugias(List<Cirugias> cirugias) {
        this.cirugias = cirugias;
    } 

    @Override
    public String toString() {
        return "{" +
            " id_paciente='" + getId_paciente() + "'" +
            ", cronicas='" + getCronicas() + "'" +
            ", alergias='" + getAlergias() + "'" +
            ", cirugias='" + getCirugias() + "'" +
            "}";
    }

    
}