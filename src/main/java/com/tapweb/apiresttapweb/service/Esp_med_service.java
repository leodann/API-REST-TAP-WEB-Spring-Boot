package com.tapweb.apiresttapweb.service;

import com.tapweb.apiresttapweb.composite_keys.Esp_med_PK;
import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Esp_med;
import com.tapweb.apiresttapweb.entity.Especialidades;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.repository.Esp_med_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("esp_med_serv")
public class Esp_med_service {
    @Autowired
    @Qualifier("esp_med_repo")
    private Esp_med_repo esp_med_repo;

    @Autowired
    @Qualifier("esp_serv")
    private Especialidades_service esp_serv;
    @Autowired
    @Qualifier("med_serv")
    private Medico_service med_serv;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public Iterable<Esp_med> getAll(){
        return esp_med_repo.findAll();
    }

    public Esp_med registrar_esp_med(Esp_med_PK pk){        
        Especialidades esp = esp_serv.getEspById(pk.getId_especialidad());
        Medico med = med_serv.getMedicoById(pk.getId_persona());        
        Esp_med esp_med = new Esp_med(pk,med,esp);
        return esp_med_repo.save(esp_med);
    }
}