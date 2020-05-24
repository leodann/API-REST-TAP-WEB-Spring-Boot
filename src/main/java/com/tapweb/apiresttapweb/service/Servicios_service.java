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

    public List<Servicios_model> listarByMedico(int id_persona){
        return convertidor.convertir_lista_servicios(serv_repo.getServiciosByMedico(id_persona));
    }

    public Servicios_model getServicioById(int id_servicio){
        Servicios aux_servicio = serv_repo.findById(id_servicio);
        Servicios_model servicio = new Servicios_model(aux_servicio);
        return servicio;
    }

    public int updateServicio(Servicios actualizado){
        String servicio = actualizado.getServicio();
        int costo = actualizado.getCosto();
        int id_servicio = actualizado.getCosto();
        System.out.println(actualizado.toString());
        return serv_repo.UpdateServicioById(servicio, costo, id_servicio);
    }

    public boolean delete(Servicios servicio_eliminado){
        try{
            serv_repo.delete(servicio_eliminado);
            return true;
        }catch(Exception e){
            e.printStackTrace();            
            return false;
        }
    }

}