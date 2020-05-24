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

    public Persona_model(){}

    public Persona_model(int _id, String _nombre, String _estado, String _pais, String _municipio, String _telefono,String _apellidos, String _direccion, int _id_usuario){
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