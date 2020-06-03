package com.tapweb.apiresttapweb.model;

import java.util.ArrayList;

import com.tapweb.apiresttapweb.entity.Consultas;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.entity.Paciente;

public class Consultas_model {
    private int id_consulta;
    private int id_paciente;
    private int id_medico;
    private String descripcion;

    private Paciente paciente;
    private Medico medico;    

    private ArrayList<Integer>especialidades;

    public Consultas_model() {
    }

    public Consultas_model (int id_pacientes, int id_medico,String des){
        this.id_paciente = id_pacientes;
        this.id_medico = id_medico;
        this.descripcion = des;
    }

    public Consultas_model (int id_pacientes,String des, ArrayList<Integer>especialidades){
        this.id_paciente = id_pacientes;        
        this.descripcion = des;
        this.especialidades = especialidades;
    }

    public Consultas_model(int id_consulta, int id_paciente, int id_medico, String descripcion, Paciente paciente, Medico medico) {
        this.id_consulta = id_consulta;
        this.id_paciente = id_paciente;
        this.id_medico = id_medico;
        this.descripcion = descripcion;
        this.paciente = paciente;
        this.medico = medico;
    }

    public Consultas_model(Consultas c ){
        this.id_consulta = c.getId_consulta();
        this.id_paciente = c.getPaciente().getId_persona();
        this.id_medico = c.getMedico().getId_persona();
        this.descripcion = c.getDescripcion();
        this.paciente = c.getPaciente();
        this.medico = c.getMedico();
    }

    public ArrayList<Integer>getEsp(){
        return this.especialidades;
    }

    public void setEsp(ArrayList<Integer>esp){
        this.especialidades = esp;
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

    public int getId_medico() {
        return this.id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "{" +
            " id_consulta='" + getId_consulta() + "'" +
            ", id_paciente='" + getId_paciente() + "'" +
            ", id_medico='" + getId_medico() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", paciente='" + getPaciente() + "'" +
            ", medico='" + getMedico() + "'" +
            ", especialidades='" + getEsp() + "'" +
            "}";
    }

    
}