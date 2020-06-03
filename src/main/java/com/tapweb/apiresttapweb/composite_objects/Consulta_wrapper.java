package com.tapweb.apiresttapweb.composite_objects;

import java.util.ArrayList;

public class Consulta_wrapper {
    private int id_paciente;
    private String desc;    
    private ArrayList<Integer>especialidades;


    public Consulta_wrapper() {
    }

    public Consulta_wrapper(int id_paciente, String desc, ArrayList<Integer> especialidades) {
        this.id_paciente = id_paciente;
        this.desc = desc;
        this.especialidades = especialidades;
    }

    public int getId_paciente() {
        return this.id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<Integer> getEspecialidades() {
        return this.especialidades;
    }

    public void setEspecialidades(ArrayList<Integer> especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return "{" +
            " id_paciente='" + getId_paciente() + "'" +
            ", desc='" + getDesc() + "'" +
            ", especialidades='" + getEspecialidades() + "'" +
            "}";
    }
}