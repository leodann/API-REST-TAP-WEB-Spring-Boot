package com.tapweb.apiresttapweb.service;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.repository.Persona_repo;
import com.tapweb.apiresttapweb.entity.Persona;
import com.tapweb.apiresttapweb.model.Persona_model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("per_serv")
public class Persona_service {
    @Autowired
    @Qualifier("per_repo")
    private Persona_repo per_repo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar (Persona persona){
        try {
            per_repo.save(persona);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int getId(){
        return per_repo.getIdByTopDesc();
    }

    public List<Persona_model> listar(){        
        return convertidor.convertir_lista_persona(per_repo.findAll());
    }

    public int getIdUser(int id_usuario){
        return per_repo.getId(id_usuario);
    }
}