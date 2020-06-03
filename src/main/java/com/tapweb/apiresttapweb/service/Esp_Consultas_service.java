package com.tapweb.apiresttapweb.service;

import java.util.List;

import com.tapweb.apiresttapweb.composite_keys.Esp_Consultas_PK;
import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Consultas;
import com.tapweb.apiresttapweb.entity.Esp_Consultas;
import com.tapweb.apiresttapweb.entity.Especialidades;
import com.tapweb.apiresttapweb.model.Esp_Consutlas_model;
import com.tapweb.apiresttapweb.repository.Esp_Consultas_rerpo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("esp_cons_serv")
public class Esp_Consultas_service {
    @Autowired
    @Qualifier("esp_cons_repo")
    private Esp_Consultas_rerpo esp_cons_repo;

    @Autowired
    @Qualifier("cons_serv")
    private Consultas_service cons_serv;

    @Autowired
    @Qualifier("esp_serv")
    private Especialidades_service esp_serv;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar (Esp_Consultas_PK pk){
        try {
            Consultas c = cons_serv.getConsultaById(pk.getId_consulta());
            Especialidades e = esp_serv.getEspById(pk.getId_especialidad());
            Esp_Consultas e_c = new Esp_Consultas(pk,e,c);
            esp_cons_repo.save(e_c);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Esp_Consutlas_model>listAll(){
        return convertidor.conveEsp_Consutlas_models(esp_cons_repo.getAll());
    }
}