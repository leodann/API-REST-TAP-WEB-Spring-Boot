package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.composite_objects.Consulta_wrapper;
import com.tapweb.apiresttapweb.entity.Consultas;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.model.Consultas_model;
import com.tapweb.apiresttapweb.service.Consultas_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Consultas_controller {
    @Autowired
    @Qualifier("cons_serv")
    private Consultas_service cons_serv;

    @GetMapping(value = "/consultas/listar")
    @ResponseBody
    public List<Consultas>listar(){
        return cons_serv.getAll();
    }

    @GetMapping(value = "/consultas/MisConsultas")
    public List<Consultas>MisConsultas(int id_persona){
        return cons_serv.getMisConsultas(id_persona);
    }

    @GetMapping(value = "/consultas/ById")
    public Consultas getConsulta(int id_consulta){
        return cons_serv.getConsultaById(id_consulta);
    }

    @PostMapping(value = "/consultas/registrar")
    public boolean registrarConsulta (@RequestBody @Valid Consulta_wrapper aux){
        Consultas_model model_aux = new Consultas_model(aux.getId_paciente(),aux.getDesc(),aux.getEspecialidades());
        return cons_serv.registrar(model_aux);
    }    
    
    @PutMapping(value = "/consultas/atender/{id_consulta}")
    public Consultas atender (@PathVariable int id_consulta, @RequestBody @Valid Medico medico){
        int id_medico = medico.getId_persona();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("id_medico: "+id_medico);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        boolean atendida = cons_serv.updateMedicoCons(id_medico, id_consulta); 
        Consultas c = new Consultas();
        if(atendida){
            c = cons_serv.getConsultaById(id_consulta);
        }
        return c;
    }
}