package com.tapweb.apiresttapweb.service;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Cirugias;
import com.tapweb.apiresttapweb.entity.Paciente;
import com.tapweb.apiresttapweb.model.Cirugias_model;
import com.tapweb.apiresttapweb.repository.Cirugias_repo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service ("cir_serv")
public class Cirugias_service {
    @Autowired
    @Qualifier ("cir_repo")
    private Cirugias_repo cir_repo;
    
    @Autowired
    @Qualifier("pac_serv")
    private Paciente_service pac_serv;

    @Autowired
    @Qualifier ("convertidor")
    private Convertidor convertidor;
    
    public boolean registrar (Cirugias_model cirugias){
        try {
            Paciente p = pac_serv.getPaciente(cirugias.getId_persona());
            Cirugias c = new Cirugias(cirugias.getCirugia(),p);            
            cir_repo.save(c);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Cirugias_model> listar_cirugias (){
        return convertidor.convertir_cirugias(cir_repo.findAll());
    }

    public List<Cirugias> getCirguiaByPaciente(int id){
        return cir_repo.getByPaciente(id);
    }
}