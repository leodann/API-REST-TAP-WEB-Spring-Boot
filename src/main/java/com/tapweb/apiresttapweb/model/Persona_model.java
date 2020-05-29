package com.tapweb.apiresttapweb.model;

import com.tapweb.apiresttapweb.entity.Persona;

public class Persona_model {
    private int id_persona;
    private String nombre;
    private String estado;
    private String pais;
    private String municipio;
    private String telefono;
    private String apellidos;
    private String direccion;
    private int id_usuario;

    public Persona_model(){}
    
    public Persona_model(int id_persona, String nombre, String estado, String pais, String municipio, String telefono, String apellidos, String direccion, int id_usuario) {
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

    public Persona_model(Persona persona){
        this.id_persona = persona.getId_persona();
        this.nombre = persona.getNombre();
        this.estado = persona.getEstado();
        this.pais = persona.getPais();
        this.municipio = persona.getMunicipio();
        this.telefono = persona.getTelefono();
        this.apellidos = persona.getApellidos();
        this.direccion = persona.getDireccion();
        this.id_usuario = persona.getId_usuario();
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

    public Persona_model id_persona(int id_persona) {
        this.id_persona = id_persona;
        return this;
    }

    public Persona_model nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Persona_model estado(String estado) {
        this.estado = estado;
        return this;
    }

    public Persona_model pais(String pais) {
        this.pais = pais;
        return this;
    }

    public Persona_model municipio(String municipio) {
        this.municipio = municipio;
        return this;
    }

    public Persona_model telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public Persona_model apellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Persona_model direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Persona_model id_usuario(int id_usuario) {
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