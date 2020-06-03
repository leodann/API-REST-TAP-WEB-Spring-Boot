package com.tapweb.apiresttapweb.service;

import java.util.List;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Enf_Cronicas;
import com.tapweb.apiresttapweb.entity.Paciente;
import com.tapweb.apiresttapweb.model.Enf_Cronicas_model;
import com.tapweb.apiresttapweb.repository.Enf_Cronicas_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("enf_serv")
public class Enf_Cronicas_service {
    @Autowired
    @Qualifier("enf_repo")
    private Enf_Cronicas_repo enf_repo;

    @Autowired
    @Qualifier("pac_serv")
    private Paciente_service pac_serv;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar (Enf_Cronicas_model cronicas){
        try {
            Paciente p = pac_serv.getPaciente(cronicas.getId_persona());
            Enf_Cronicas c = new Enf_Cronicas(cronicas.getEnf_cronica(),p);            
            enf_repo.save(c);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Enf_Cronicas_model> listar_cronicas(){
        return convertidor.convertir_enf(enf_repo.findAll());
    }

    public List<Enf_Cronicas> getCronicasByPaciente(int id){
        return enf_repo.getByPaciente(id);
    }

    
}