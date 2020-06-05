package com.tapweb.apiresttapweb.composite_objects;

public class Sintomas_wrapper {
    private int id_sintoma;
    private String sintoma_prueba;    
    private int id_consulta;


    public Sintomas_wrapper() {
    }

    public Sintomas_wrapper(String sintoma_prueba, int id_consulta){
        this.sintoma_prueba = sintoma_prueba;
        this.id_consulta = id_consulta;
    }

    public Sintomas_wrapper(int id_sintoma, String sintoma_prueba, int id_consulta) {
        this.id_sintoma = id_sintoma;
        this.sintoma_prueba = sintoma_prueba;
        this.id_consulta = id_consulta;
    }

    public int getId_sintoma() {
        return this.id_sintoma;
    }

    public void setId_sintoma(int id_sintoma) {
        this.id_sintoma = id_sintoma;
    }

    public String getSintoma_prueba() {
        return this.sintoma_prueba;
    }

    public void setSintoma_prueba(String sintoma_prueba) {
        this.sintoma_prueba = sintoma_prueba;
    }

    public int getId_consulta() {
        return this.id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }
    

    @Override
    public String toString() {
        return "{" +
            " id_sintoma='" + getId_sintoma() + "'" +
            ", sintoma_prueba='" + getSintoma_prueba() + "'" +
            ", id_consulta='" + getId_consulta() + "'" +
            "}";
    }   
}