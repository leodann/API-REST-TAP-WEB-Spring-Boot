package com.tapweb.apiresttapweb.model;

public class Persona_paciente {
    private int id_persona;
    private String nombre;
    private String estado;
    private String pais;
    private String municipio;
    private String telefono;
    private String apellidos;
    private String direccion;
    private String fecha_nac;
    private int id_usuario;
    private String email;
    private String password;
    private int id_rol;


    public Persona_paciente() {
    }

    public Persona_paciente(int id_persona, String nombre, String estado, String pais, String municipio, String telefono, String apellidos, String direccion, String fecha_nac, int id_usuario, String email, String password, int id_rol) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.estado = estado;
        this.pais = pais;
        this.municipio = municipio;
        this.telefono = telefono;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fecha_nac = fecha_nac;
        this.id_usuario = id_usuario;
        this.email = email;
        this.password = password;
        this.id_rol = id_rol;
    }

    public Persona_paciente(String nombre, String estado, String pais, String municipio, String telefono, String apellidos, String direccion, String fecha_nac, String email, String password) {        
        this.nombre = nombre;
        this.estado = estado;
        this.pais = pais;
        this.municipio = municipio;
        this.telefono = telefono;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fecha_nac = fecha_nac;        
        this.email = email;
        this.password = password;        
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

    public String getFecha_nac() {
        return this.fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public int getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_rol() {
        return this.id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public Persona_paciente id_persona(int id_persona) {
        this.id_persona = id_persona;
        return this;
    }

    public Persona_paciente nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Persona_paciente estado(String estado) {
        this.estado = estado;
        return this;
    }

    public Persona_paciente pais(String pais) {
        this.pais = pais;
        return this;
    }

    public Persona_paciente municipio(String municipio) {
        this.municipio = municipio;
        return this;
    }

    public Persona_paciente telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public Persona_paciente apellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Persona_paciente direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Persona_paciente fecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
        return this;
    }

    public Persona_paciente id_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
        return this;
    }

    public Persona_paciente email(String email) {
        this.email = email;
        return this;
    }

    public Persona_paciente password(String password) {
        this.password = password;
        return this;
    }

    public Persona_paciente id_rol(int id_rol) {
        this.id_rol = id_rol;
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
            ", fecha_nac='" + getFecha_nac() + "'" +
            ", id_usuario='" + getId_usuario() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", id_rol='" + getId_rol() + "'" +
            "}";
    }
    
}