package com.tapweb.apiresttapweb.service;

import com.tapweb.apiresttapweb.repository.Servicios_repo;

import java.util.List;

import com.tapweb.apiresttapweb.converter.*;
import com.tapweb.apiresttapweb.entity.Servicios;
import com.tapweb.apiresttapweb.model.Servicios_model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serv_serv")
public class Servicios_service {
    @Autowired
    @Qualifier("serv_repo")
    private Servicios_repo serv_repo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar(Servicios servicio){
        try{
            serv_repo.save(servicio);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<Servicios_model> listar(){
        return convertidor.convertir_lista_servicios(serv_repo.findAll());
    }

}