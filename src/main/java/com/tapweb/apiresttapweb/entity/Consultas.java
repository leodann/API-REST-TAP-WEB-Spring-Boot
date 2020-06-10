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
import javax.persistence.OneToOne;
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

    @OneToOne(mappedBy = "id_consulta")
    private Receta receta;

    public Consultas() {
    }

    public Consultas(int id_consulta, String descripcion, String fecha, Paciente paciente, Medico atiende, List<Esp_Consultas> especialdades, List<Sintomas> sintomas, Receta receta) {
        this.id_consulta = id_consulta;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.paciente = paciente;
        this.atiende = atiende;
        this.especialdades = especialdades;
        this.sintomas = sintomas;
        this.receta = receta;
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

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getAtiende() {
        return this.atiende;
    }

    public void setAtiende(Medico atiende) {
        this.atiende = atiende;
    }

    public List<Esp_Consultas> getEspecialdades() {
        return this.especialdades;
    }

    public void setEspecialdades(List<Esp_Consultas> especialdades) {
        this.especialdades = especialdades;
    }

    public List<Sintomas> getSintomas() {
        return this.sintomas;
    }

    public void setSintomas(List<Sintomas> sintomas) {
        this.sintomas = sintomas;
    }

    public Receta getReceta() {
        return this.receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
        return "{" +
            " id_consulta='" + getId_consulta() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", paciente='" + getPaciente() + "'" +
            ", atiende='" + getAtiende() + "'" +
            ", especialdades='" + getEspecialdades() + "'" +
            ", sintomas='" + getSintomas() + "'" +
            ", receta='" + getReceta() + "'" +
            "}";
    }


}