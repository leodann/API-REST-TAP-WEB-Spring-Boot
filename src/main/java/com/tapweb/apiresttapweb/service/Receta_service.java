package com.tapweb.apiresttapweb.service;

import java.util.List;

import com.tapweb.apiresttapweb.entity.Consultas;
import com.tapweb.apiresttapweb.entity.Receta;
import com.tapweb.apiresttapweb.model.Receta_model;
import com.tapweb.apiresttapweb.repository.Receta_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("rec_serv")
public class Receta_service {
    @Autowired
    @Qualifier("rec_repo")
    private Receta_repo rec_repo;

    @Autowired
    @Qualifier("cons_serv")
    private Consultas_service cons_serv;

    public boolean registrarReceta(Receta_model r){
        try {
            Consultas c = cons_serv.getConsultaById(r.getId_consulta());
            Receta receta = new Receta( r.getConclusion(),r.getDescripcion(),r.getMedicamentos(),c);
            rec_repo.save(receta);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Receta> listar_receta (){
        return rec_repo.findAll();
    }

    public Receta getReceta (int id_consulta){
        return rec_repo.getByConsulta(id_consulta);
    }
}