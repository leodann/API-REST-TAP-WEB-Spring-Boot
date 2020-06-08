package com.tapweb.apiresttapweb.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "consultas")
public class Consultas implements Serializable{
    @GeneratedValue
    @Id
    @Column(name = "id_consulta")
    private int id_consulta;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha")
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "id_paciente",referencedColumnName = "id_persona")
    @JsonIgnore
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_medico", referencedColumnName = "id_persona")
    @JsonIgnore
    private Medico atiende;

    @OneToMany(mappedBy = "consulta_esp")
    @JsonIgnore
    private List<Esp_Consultas>especialdades;

    @OneToMany(mappedBy = "consulta")
    private List<Sintomas>sintomas;


    public Consultas() {
    }

    public Consultas(int id_consulta, String descripcion, Paciente paciente, Medico medico, String fecha) {
        this.id_consulta = id_consulta;
        this.descripcion = descripcion;
        this.paciente = paciente;        
        this.atiende = medico;
        this.fecha = fecha;
    }    

    public String getFecha(){
        return this.fecha;
    }

    public void setFecha(String f){
        this.fecha = f;
    }

    public Consultas (String desc, Paciente p,String fecha){
        this.descripcion = desc;
        this.paciente = p;
        this.fecha = fecha;
    }

    public int getId_consulta() {
        return this.id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
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
        return this.atiende;
    }

    public void setMedico(Medico medico) {
        this.atiende = medico;
    }  

    @Override
    public String toString() {
        return "{" +
            " id_consulta='" + getId_consulta() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", paciente='" + getPaciente() + "'" +
            ", medico='" + getMedico() + "'" +
            "}";
    }
}