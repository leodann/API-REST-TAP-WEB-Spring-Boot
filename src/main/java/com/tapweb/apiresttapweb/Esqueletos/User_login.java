package com.tapweb.apiresttapweb.Esqueletos;

public class User_login {
    private int id_user;
    private int id_rol;
    private int id_persona;
    private boolean status;
    

    public User_login() {
        this.status = false;
    }

    public User_login(int id_user, int id_rol, int id_prsona, boolean status) {
        this.id_user = id_user;
        this.id_rol = id_rol;
        this.id_persona = id_prsona;
        this.status = status;
    }    

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public int getId_user() {
        return this.id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_rol() {
        return this.id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public int getId_prsona() {
        return this.id_persona;
    }

    public void setId_prsona(int id_prsona) {
        this.id_persona = id_prsona;
    }

    public User_login id_user(int id_user) {
        this.id_user = id_user;
        return this;
    }

    public User_login id_rol(int id_rol) {
        this.id_rol = id_rol;
        return this;
    }

    public User_login id_prsona(int id_prsona) {
        this.id_persona = id_prsona;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id_user='" + getId_user() + "'" +
            ", id_rol='" + getId_rol() + "'" +
            ", id_prsona='" + getId_prsona() + "'" +
            "}";
    }
    
    
}