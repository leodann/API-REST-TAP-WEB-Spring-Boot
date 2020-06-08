package com.tapweb.apiresttapweb.model;

import java.util.List;

import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.entity.Paciente;

public class Consulta_vista_model {
    private int id_consulta;
    private int id_paciente;
    private String descripcion;
    private int id_medico;
    private List<Sintomas_model>pruebas;
    private List<Especialidades_model>especialidades;
    private Medico m;
    private Paciente p;
    private String fecha;


    public Consulta_vista_model() {
    }

    public Consulta_vista_model(int id_consulta, int id_paciente, String descripcion, int id_medico, List<Sintomas_model> pruebas, List<Especialidades_model> especialidades, Medico m, Paciente p,String fecha) {
        this.id_consulta = id_consulta;
        this.id_paciente = id_paciente;
        this.descripcion = descripcion;
        this.id_medico = id_medico;
        this.pruebas = pruebas;
        this.especialidades = especialidades;
        this.m = m;
        this.p = p;
        this.fecha = fecha;
    }

    public String getFecha(){
        return this.fecha;
    }

    public void setFecha(String f){
        this.fecha = f;
    }

    public Medico getM (){
        return this.m;
    }

    public void setM(Medico m){
        this.m = m;
    }

    public Paciente getP(){
        return p;
    }

    public void setP(Paciente p){
        this.p = p;
    }

    public int getId_consulta() {
        return this.id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public int getId_paciente() {
        return this.id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_medico() {
        return this.id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public List<Sintomas_model> getPruebas() {
        return this.pruebas;
    }

    public void setPruebas(List<Sintomas_model> pruebas) {
        this.pruebas = pruebas;
    }

    public List<Especialidades_model> getEspecialidades() {
        return this.especialidades;
    }

    public void setEspecialidades(List<Especialidades_model> especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return "{" +
            " id_consulta='" + getId_consulta() + "'" +
            ", id_paciente='" + getId_paciente() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", id_medico='" + getId_medico() + "'" +
            ", pruebas='" + getPruebas() + "'" +
            ", especialidades='" + getEspecialidades() + "'" +
            "}";
    }
}