package com.tapweb.apiresttapweb.composite_objects;

public class Receta_wrapper {

    private int id_consulta;
    private String con;
    private String desc;
    private String med;

    public Receta_wrapper() {
    }

    public Receta_wrapper(int id_consulta, String con, String desc, String med) {
        this.id_consulta = id_consulta;
        this.con = con;
        this.desc = desc;
        this.med = med;
    }

    public int getid_consulta() {
        return this.id_consulta;
    }

    public void setid_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public String getCon() {
        return this.con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMed() {
        return this.med;
    }

    public void setMed(String med) {
        this.med = med;
    }
    @Override
    public String toString() {
        return "{" +
            " id_consulta='" + getid_consulta() + "'" +
            ", con='" + getCon() + "'" +
            ", desc='" + getDesc() + "'" +
            ", med='" + getMed() + "'" +
            "}";
    }

    
}