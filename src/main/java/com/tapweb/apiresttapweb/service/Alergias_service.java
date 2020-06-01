package com.tapweb.apiresttapweb.service;

import java.util.List;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Alergias;
import com.tapweb.apiresttapweb.repository.Alergias_repo;
import com.tapweb.apiresttapweb.entity.Paciente;
import com.tapweb.apiresttapweb.model.Alergias_model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("aler_serv")
public class Alergias_service {
    @Autowired
    @Qualifier ("aler_repo")
    private Alergias_repo aler_repo;

    @Autowired
    @Qualifier("pac_serv")
    private Paciente_service pac_serv;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar (Alergias_model alergias){
        try {
            Paciente p = pac_serv.getPaciente(alergias.getId_persona());
            Alergias c = new Alergias(alergias.getAlergia(),p);            
            aler_repo.save(c);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Alergias_model> listar_alergias(){
        return convertidor.convertir_alergias(aler_repo.findAll());
    }

    public List<Alergias> getAlergiasByPaciente(int id){
        return aler_repo.getByPaciente(id);
    }
}