package com.tapweb.apiresttapweb.service;

import java.util.List;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.model.Medico_model;
import com.tapweb.apiresttapweb.repository.Medico_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("med_serv")
public class Medico_service {
    @Autowired
    @Qualifier("med_repo")
    private Medico_repo med_repo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public List<Medico_model> listar_medicos(){
        return convertidor.convertir_medico(med_repo.findAll());
    }

    public boolean registrar(Medico medico){
        try {
            med_repo.save(medico);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Medico getMedicoById(int id){
        return med_repo.getById(id);
    }
    
}