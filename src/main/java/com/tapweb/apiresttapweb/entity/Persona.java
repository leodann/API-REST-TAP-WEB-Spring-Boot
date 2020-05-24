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


    public Persona (){}

    public Persona (int _id,String _nombre, String _estado, String _pais, String _municipio, String _telefono,String _apellidos, String _direccion, int _id_usuario){
        this.id_persona = _id;
        this.nombre = _nombre;
        this.estado = _estado;
        this.pais = _pais;
        this.municipio = _municipio;
        this.telefono = _telefono;
        this.apellidos = _apellidos;
        this.direccion = _direccion;
        this.id_usuario = _id_usuario;
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
    public int getId_usuario(){
        return this.id_usuario;
    }

    public void setId_usuario(int id){
        this.id_usuario = id;
    }

    /**
     * @return the id_persona
    **/
    public int getId_persona() {
        return id_persona;
    }
    /**
     * @param id_persona the id_persona to set
    **/ 
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }
    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }
    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }
    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}