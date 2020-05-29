package com.tapweb.apiresttapweb.entity;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Table (name = "personas")
@Entity
public class Persona implements Serializable{
    @GeneratedValue
    @Id
    @Column(name="id_persona")
    private int id_persona;
    @Column(name="nombre")
    private String nombre;
    @Column(name="estado")
    private String estado;
    @Column(name="pais")
    private String pais;
    @Column(name="municipio")
    private String municipio;
    @Column(name="telefono")
    private String telefono;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name="direccion")
    private String direccion;
    @Column(name="id_usuario")
    private int id_usuario;


    public Persona() {
    }

    public Persona(int id_persona, String nombre, String estado, String pais, String municipio, String telefono, String apellidos, String direccion, int id_usuario) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.estado = estado;
        this.pais = pais;
        this.municipio = municipio;
        this.telefono = telefono;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.id_usuario = id_usuario;
    }

    public Persona (String _nombre, String _estado, String _pais, String _municipio, String _telefono,String _apellidos, String _direccion, int _id_usuario){     
        this.nombre = _nombre;
        this.estado = _estado;
        this.pais = _pais;
        this.municipio = _municipio;
        this.telefono = _telefono;
        this.apellidos = _apellidos;
        this.direccion = _direccion;
        this.id_usuario = _id_usuario;        
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Persona id_persona(int id_persona) {
        this.id_persona = id_persona;
        return this;
    }

    public Persona nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Persona estado(String estado) {
        this.estado = estado;
        return this;
    }

    public Persona pais(String pais) {
        this.pais = pais;
        return this;
    }

    public Persona municipio(String municipio) {
        this.municipio = municipio;
        return this;
    }

    public Persona telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public Persona apellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Persona direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Persona id_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_persona='" + getId_persona() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", estado='" + getEstado() + "'" +
            ", pais='" + getPais() + "'" +
            ", municipio='" + getMunicipio() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", apellidos='" + getApellidos() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", id_usuario='" + getId_usuario() + "'" +
            "}";
    }

    
}