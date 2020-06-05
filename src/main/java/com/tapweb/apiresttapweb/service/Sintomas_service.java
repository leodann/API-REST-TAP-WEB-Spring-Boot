package com.tapweb.apiresttapweb.service;

import java.util.List;

import com.tapweb.apiresttapweb.composite_objects.Sintomas_wrapper;
import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Consultas;
import com.tapweb.apiresttapweb.entity.Sintomas;
import com.tapweb.apiresttapweb.model.Sintomas_model;
import com.tapweb.apiresttapweb.repository.Sintomas_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("sint_serv")
public class Sintomas_service {
    @Autowired
    @Qualifier("sint_repo")
    private Sintomas_repo sint_repo;

    @Autowired
    @Qualifier("cons_serv")
    private Consultas_service cons_serv;

    @Autowired
    @Qualifier("convertidor")    
    private Convertidor convertidor;

    public boolean registrar(Sintomas_wrapper sw){
        try {
            Consultas consultas = cons_serv.getConsultaById(sw.getId_consulta());
            Sintomas sintomas = new Sintomas(sw.getSintoma_prueba(),consultas);
            sint_repo.save(sintomas);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Sintomas_model>listarSintomas(int id_consulta){
        return convertidor.convertir_sintomas(sint_repo.getByConsulta(id_consulta));
    }
}