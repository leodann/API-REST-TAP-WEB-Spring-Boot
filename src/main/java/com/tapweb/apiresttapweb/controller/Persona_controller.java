package com.tapweb.apiresttapweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.tapweb.apiresttapweb.composite_objects.Persona_medico;
import com.tapweb.apiresttapweb.composite_objects.Persona_paciente;
import com.tapweb.apiresttapweb.model.Especialidades_model;
import com.tapweb.apiresttapweb.model.Persona_model;
import com.tapweb.apiresttapweb.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Persona_controller {
    @Autowired
    @Qualifier("per_serv")
    private Persona_service per_serv;

    @Autowired
    @Qualifier("esp_serv")
    private Especialidades_service esp_serv;

    @GetMapping(value = "/personas/listar")
    public List<Persona_model> listar_personas(){
        return per_serv.listar();
    }

    @PostMapping(value = "/personas/registrar/paciente")
    public Persona_paciente registrar_persona_paciente(@RequestBody @Valid Persona_paciente nuevo_paciente){
        Persona_model mp = per_serv.persona_paciente(nuevo_paciente);
        Persona_paciente p = new Persona_paciente(mp,2,nuevo_paciente.getFecha_nac());
        return p;
    }

    @PostMapping(value = "/personas/registrar/medico")
    public Persona_medico registrar_persona_medico(@RequestBody @Valid Persona_medico nuevo_medico){
        Persona_model mp = per_serv.persona_medico(nuevo_medico);
        List<Especialidades_model> especialidades = esp_serv.getEspByMedico(mp.getId_persona());
        Persona_medico p = new Persona_medico(mp,1,nuevo_medico.getNumero_cedula(),especialidades);
        return p;
    }
   
    
}