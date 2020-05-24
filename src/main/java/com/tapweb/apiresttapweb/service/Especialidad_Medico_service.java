package com.tapweb.apiresttapweb.service;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Especialidad_Medico;
import com.tapweb.apiresttapweb.llaves_compuestas.Especialidad_Medico_Id;
import com.tapweb.apiresttapweb.repository.Especialidad_Medico_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("esp_med_serv")
public class Especialidad_Medico_service {
    @Autowired
    @Qualifier("esp_med_repo")
    private Especialidad_Medico_repo esp_med_repo;

    /*@Autowired
    private DataSource datasource;*/

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public Iterable<Especialidad_Medico> getAll(){
        return esp_med_repo.findAll();
    }

    public Especialidad_Medico registrar_esp_med(Especialidad_Medico_Id pk){
        Especialidad_Medico esp_med = new Especialidad_Medico(pk);
        return esp_med_repo.save(esp_med);
    }
}