package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Sintomas;

public class Sintomas_model {
    private int id_sintoma;
    private int id_consulta;
    private String sintoma_prueba;



    public Sintomas_model() {
    }

    public Sintomas_model(int id_sintoma, int id_consulta, String sintoma_prueba) {
        this.id_sintoma = id_sintoma;
        this.id_consulta = id_consulta;
        this.sintoma_prueba = sintoma_prueba;
    }

    public Sintomas_model (Sintomas s){
        this.id_sintoma = s.getId_sintoma();
        this.id_consulta = s.getConsulta().getId_consulta();
        this.sintoma_prueba = s.getSintoma_prueba();
    }

    public int getId_sintoma() {
        return this.id_sintoma;
    }

    public void setId_sintoma(int id_sintoma) {
        this.id_sintoma = id_sintoma;
    }

    public int getId_consulta() {
        return this.id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public String getSintoma_prueba() {
        return this.sintoma_prueba;
    }

    public void setSintoma_prueba(String sintoma_prueba) {
        this.sintoma_prueba = sintoma_prueba;
    }

    @Override
    public String toString() {
        return "{" +
            " id_sintoma='" + getId_sintoma() + "'" +
            ", id_consulta='" + getId_consulta() + "'" +
            ", sintoma_prueba='" + getSintoma_prueba() + "'" +
            "}";
    }   
}