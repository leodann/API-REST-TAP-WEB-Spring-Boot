package com.tapweb.apiresttapweb.service;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.repository.Paciente_repo;
import com.tapweb.apiresttapweb.model.Paciente_model;
import com.tapweb.apiresttapweb.entity.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pac_serv")
public class Paciente_service {
    @Autowired
    @Qualifier("pac_repo")
    private Paciente_repo pac_repo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar_paciente (Paciente paciente){
        try {
            pac_repo.save(paciente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Paciente_model>listar_pacientes(){
        return convertidor.convertir_lista_paciente(pac_repo.findAll());
    }

    public List<Paciente_model>listar_pacientes_native(){
        return convertidor.convertir_lista_paciente(pac_repo.fidnAllByNativeQuery());
    }

}