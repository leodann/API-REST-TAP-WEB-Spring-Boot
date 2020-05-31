package com.tapweb.apiresttapweb.composite_objects;

import java.util.List;

import com.tapweb.apiresttapweb.model.Especialidades_model;
import com.tapweb.apiresttapweb.model.Persona_model;

public class Persona_medico {
    private int id_persona;
    private String nombre;
    private String estado;
    private String pais;
    private String municipio;
    private String telefono;
    private String apellidos;
    private String direccion;
    private String numero_cedula;
    private int id_usuario;
    private String email;
    private String password;
    private int id_rol;        
    private List<Especialidades_model> especialidades;


    public Persona_medico() {
    }

    public Persona_medico(int id_persona, String nombre, String estado, String pais, String municipio, String telefono, String apellidos, String direccion, String numero_cedula, int id_usuario, String email, String password, int id_rol) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.estado = estado;
        this.pais = pais;
        this.municipio = municipio;
        this.telefono = telefono;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numero_cedula = numero_cedula;
        this.id_usuario = id_usuario;
        this.email = email;
        this.password = password;
        this.id_rol = id_rol;
    }

    public Persona_medico(String nombre, String estado, String pais, String municipio, String telefono, String apellidos, String direccion, String numero_cedula, String email, String password) {     
        this.nombre = nombre;
        this.estado = estado;
        this.pais = pais;
        this.municipio = municipio;
        this.telefono = telefono;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numero_cedula = numero_cedula;        
        this.email = email;
        this.password = password;        
    }

    public Persona_medico(Persona_model p, int id_rol, String numero_cedula,List<Especialidades_model>e){
        this.id_persona = p.getId_persona();
        this.nombre = p.getNombre();
        this.estado = p.getEstado();
        this.pais = p.getPais();
        this.municipio = p.getMunicipio();
        this.telefono = p.getTelefono();
        this.apellidos = p.getApellidos();
        this.direccion = p.getDireccion();        
        this.numero_cedula = numero_cedula;
        this.id_usuario = p.getusuario().getId_usuario();
        this.email = p.getusuario().getEmail();
        this.password = p.getusuario().getPassword();
        this.id_rol = id_rol;
        this.especialidades = e;
    }   

    public List<Especialidades_model>gEspecialidades(){
        return this.especialidades;
    }

    public void setEspecialidades(List<Especialidades_model>e){
        this.especialidades = e;
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

    public String getNumero_cedula() {
        return this.numero_cedula;
    }

    public void setNumero_cedula(String numero_cedula) {
        this.numero_cedula = numero_cedula;
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

    public Persona_medico id_persona(int id_persona) {
        this.id_persona = id_persona;
        return this;
    }

    public Persona_medico nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Persona_medico estado(String estado) {
        this.estado = estado;
        return this;
    }

    public Persona_medico pais(String pais) {
        this.pais = pais;
        return this;
    }

    public Persona_medico municipio(String municipio) {
        this.municipio = municipio;
        return this;
    }

    public Persona_medico telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public Persona_medico apellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Persona_medico direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Persona_medico id_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
        return this;
    }

    public Persona_medico email(String email) {
        this.email = email;
        return this;
    }

    public Persona_medico password(String password) {
        this.password = password;
        return this;
    }

    public Persona_medico id_rol(int id_rol) {
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
            ", numero_cedula='" + getNumero_cedula() + "'" +
            ", id_usuario='" + getId_usuario() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", id_rol='" + getId_rol() + "'" +
            "}";
    }

}