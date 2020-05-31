package com.tapweb.apiresttapweb.service;

import org.springframework.stereotype.Service;

import java.util.List;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.entity.Servicios;
import com.tapweb.apiresttapweb.model.Servicios_model;
import com.tapweb.apiresttapweb.repository.Servicios_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Service("serv_serv")
public class Servicios_service {
    @Autowired
    @Qualifier("serv_repo")
    private Servicios_repo serv_repo;
    @Autowired
    @Qualifier("med_serv")
    private Medico_service med_serv;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar(Servicios_model servicio){
        try {
            String nombre_servicio = servicio.getServicio();
            int id_persona = servicio.getId_persona();
            int costo = servicio.getCosto();
            Medico medico = med_serv.getMedicoById(id_persona);
            Servicios nuevo_servicio = new Servicios(
                                    nombre_servicio,
                                    costo,
                                    medico
            );
            serv_repo.save(nuevo_servicio);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Servicios_model> listar(){
        return convertidor.convertir_servicios(serv_repo.findAll());
    }

    public List<Servicios_model> listarByMedico(int id_persona){
        return convertidor.convertir_servicios(serv_repo.getServiciosByMedico(id_persona));
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

    public boolean delete(Servicios_model servicio_eliminado){
        try{
            Servicios s = serv_repo.findById(servicio_eliminado.getId_servicio());
            serv_repo.delete(s);
            return true;
        }catch(Exception e){
            e.printStackTrace();            
            return false;
        }
    }    
}