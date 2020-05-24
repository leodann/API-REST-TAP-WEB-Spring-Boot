package com.tapweb.apiresttapweb.service;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Especialidad;
import com.tapweb.apiresttapweb.repository.Especialidad_repo;
import com.tapweb.apiresttapweb.model.Especialidad_model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("esp_serv")
public class Especialidad_service {
    @Autowired
    @Qualifier("esp_repo")
    private Especialidad_repo esp_repo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar_especialidad(Especialidad especialidad){
        try {
            esp_repo.save(especialidad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Especialidad_model> listar_especialidades(){
        return convertidor.convertir_lista_especialida(esp_repo.findAll());
    }

    public List<Especialidad_model>getEspByMedico(int id_persona){
        return convertidor.convertir_lista_especialida(esp_repo.getByMedico(id_persona));
    }

}