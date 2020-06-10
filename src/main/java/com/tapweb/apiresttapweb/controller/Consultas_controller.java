package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.composite_objects.Consulta_wrapper;
import com.tapweb.apiresttapweb.entity.Consultas;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.model.Consulta_vista_model;
import com.tapweb.apiresttapweb.model.Consultas_model;
import com.tapweb.apiresttapweb.service.Consulta_vista_service;
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

    @Autowired
    @Qualifier("cons_view_serv")
    private Consulta_vista_service cons_view_serv;

    @GetMapping(value = "/consultas/MisConsultas")
    public List<Consulta_vista_model>MisConsultas(int id_persona){
        return cons_view_serv.listarTodo(id_persona);
    }

    //PUREBA2
    @GetMapping(value = "/consultas/todas2")
    public List<Consulta_vista_model>todas2(){
        return cons_view_serv.listar();
    }


    //DEPRECATED
    @GetMapping(value = "/consultas/listar")
    @ResponseBody
    public List<Consultas_model>listar(){
        return cons_serv.getAll();
    }

    //PRUEBA1
    @GetMapping(value = "/consultas/todas1")
    public List<Consultas>todas(){
        return cons_serv.all();
    }



    //DEPRECATED
    @GetMapping(value = "/consultas")
    public Consulta_vista_model miConsulta(int id_consulta, int id_persona){
        return cons_view_serv.getById(id_persona, id_consulta);
    }

    @GetMapping(value = "/consultas/ById")
    public Consultas getConsulta(int id_consulta){
        return cons_serv.getConsultaById(id_consulta);
    }

    @GetMapping(value = "/consultas/noAtendidas")
    public List<Consultas>noAtendidas(int id_persona){
        return cons_serv.getNoAtendidas(id_persona);
    }

    @PostMapping(value = "/consultas/registrar")
    public boolean registrarConsulta (@RequestBody @Valid Consulta_wrapper aux){
        Consultas_model model_aux = new Consultas_model(aux.getId_paciente(),aux.getDesc(),aux.getEspecialidades(),aux.getFecha());
        return cons_serv.registrar(model_aux);
    }    
    
    @PutMapping(value = "/consultas/atender/{id_consulta}")
    public Consultas atender (@PathVariable int id_consulta, @RequestBody @Valid Medico medico){
        int id_medico = medico.getId_persona();        
        boolean atendida = cons_serv.updateMedicoCons(id_medico, id_consulta); 
        Consultas c = new Consultas();
        if(atendida){
            c = cons_serv.getConsultaById(id_consulta);
        }
        return c;
    }
}