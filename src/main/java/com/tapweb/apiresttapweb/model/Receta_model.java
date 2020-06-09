package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Receta;

public class Receta_model {
    private int id_receta;
    private String conclusion;
    private String descripcion;
    private int id_consulta;
    private String medicamentos;



    public Receta_model() {
    }

    public Receta_model(int id_receta, String conclusion, String descripcion, int id_consulta, String medicamentos) {
        this.id_receta = id_receta;
        this.conclusion = conclusion;
        this.descripcion = descripcion;
        this.id_consulta = id_consulta;
        this.medicamentos = medicamentos;
    }

    public Receta_model(String conclusion, String descripcion, int id_consulta, String medicamentos) {     
        this.conclusion = conclusion;
        this.descripcion = descripcion;
        this.id_consulta = id_consulta;
        this.medicamentos = medicamentos;
    }

    public Receta_model (Receta r ){
        this.id_receta = r.getId_receta();
        this.conclusion = r.getConclusion();
        this.descripcion = r.getDescripcion();
        this.id_consulta = r.getId_consulta().getId_consulta();
        this.medicamentos = r.getMedicamentos();
    }

    public int getId_receta() {
        return this.id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public String getConclusion() {
        return this.conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_consulta() {
        return this.id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public String getMedicamentos() {
        return this.medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "{" +
            " id_receta='" + getId_receta() + "'" +
            ", conclusion='" + getConclusion() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", id_consulta='" + getId_consulta() + "'" +
            ", medicamentos='" + getMedicamentos() + "'" +
            "}";
    }
    
}