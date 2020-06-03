package com.tapweb.apiresttapweb.service;

import java.util.ArrayList;
import java.util.List;

import com.tapweb.apiresttapweb.composite_keys.Esp_Consultas_PK;
import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Consultas;
import com.tapweb.apiresttapweb.entity.Paciente;
import com.tapweb.apiresttapweb.model.Consultas_model;
import com.tapweb.apiresttapweb.repository.Consultas_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("cons_serv")
public class Consultas_service {
    @Autowired
    @Qualifier("cons_repo")
    private Consultas_repo cons_repo;

    @Autowired
    @Qualifier("esp_cons_serv")
    private Esp_Consultas_service esp_cons_serv;

    @Autowired
    @Qualifier("pac_serv")
    private Paciente_service pac_serv;
    
    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar(Consultas_model aux){
        try {
            Paciente p = pac_serv.getPaciente(aux.getId_paciente());
            Consultas consulta = new Consultas(aux.getDescripcion(),p);
            cons_repo.save(consulta);
            int id_consulta = cons_repo.getIdTopDesc();
            System.out.println("id_consulta: "+id_consulta);
            ArrayList<Integer>ids = aux.getEsp();
            for (Integer id : ids){                
                System.out.println("id_esp: "+id);
                esp_cons_serv.registrar(new Esp_Consultas_PK(id,id_consulta));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Consultas>getAll(){
        return cons_repo.findAll();
    }

    public List<Consultas>getNoAtendidas(){
        return cons_repo.getNoAtendidas();
    }

    public List<Consultas>getMisConsultas(int id_persona){
        return cons_repo.getMisConsultas(id_persona);
    }

    public Consultas getConsultaById(int id_consulta){
        return cons_repo.getById(id_consulta);
    }

    public boolean updateMedicoCons(int id_medico, int id_consulta){
        try {
            cons_repo.updateMedico(id_medico, id_consulta);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}