package com.tapweb.apiresttapweb.service;

import java.util.List;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Especialidades;
import com.tapweb.apiresttapweb.model.Especialidades_model;
import com.tapweb.apiresttapweb.repository.Especialidades_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("esp_serv")
public class Especialidades_service {
    @Autowired
    @Qualifier("esp_repo")
    private Especialidades_repo esp_repo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar_especialidad(Especialidades especialidad){
        try {
            esp_repo.save(especialidad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Especialidades_model> listar_especialidades(){
        return convertidor.convertir_especialidades(esp_repo.findAll());
    }

    /*public List<Especialidades_model>getEspByMedico(int id_persona){
        return convertidor.convertir_especialidades(esp_repo.getByMedico(id_persona));
    }*/
}