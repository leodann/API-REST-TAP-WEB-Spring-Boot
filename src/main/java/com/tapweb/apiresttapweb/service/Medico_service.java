package com.tapweb.apiresttapweb.service;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.repository.Medico_repo;
import com.tapweb.apiresttapweb.repository.Paciente_repo;
import com.tapweb.apiresttapweb.model.Medico_model;
import com.tapweb.apiresttapweb.model.Paciente_model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("med_serv")
public class Medico_service {
    @Autowired
    @Qualifier("med_repo")
    private Medico_repo med_repo;

    @Autowired
    @Qualifier("pac_repo")
    private Paciente_repo pac_repo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar (Medico medico){
        try {
            med_repo.save(medico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Medico_model> listar_medicos(){
        return convertidor.convertir_lista_medico(med_repo.findAll());
    }

    public List<Paciente_model> listar_pacientes_desde_medicos(){
        return convertidor.convertir_lista_paciente(pac_repo.fidnAllByNativeQuery());
    }

}