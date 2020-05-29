package com.tapweb.apiresttapweb.service;

import java.util.List;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Paciente;
import com.tapweb.apiresttapweb.model.Paciente_model;
import com.tapweb.apiresttapweb.repository.Paciente_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pac_serv")
public class Paciente_service {
    @Autowired
    @Qualifier("pac_repo")
    private Paciente_repo pac_repo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar(Paciente paciente){
        try {
            pac_repo.save(paciente);
            return true;    
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Paciente_model> listar_pacientes(){
        return convertidor.convertir_paciente(pac_repo.findAll());
    }
}