package com.tapweb.apiresttapweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

import java.util.ArrayList;
import java.util.List;

import com.tapweb.apiresttapweb.service.Especialidad_Medico_service;
import com.tapweb.apiresttapweb.service.Especialidad_service;
import com.tapweb.apiresttapweb.service.Medico_service;
import com.tapweb.apiresttapweb.service.Paciente_service;
import com.tapweb.apiresttapweb.service.Persona_service;
import com.tapweb.apiresttapweb.service.Roles_Usuarios_service;
import com.tapweb.apiresttapweb.service.Usuarios_service;
import com.tapweb.apiresttapweb.entity.Persona;
import com.tapweb.apiresttapweb.entity.Usuarios;
import com.tapweb.apiresttapweb.model.Especialidad_model;
import com.tapweb.apiresttapweb.model.Persona_medico;
import com.tapweb.apiresttapweb.model.Persona_model;
import com.tapweb.apiresttapweb.model.Persona_paciente;
import com.tapweb.apiresttapweb.entity.Especialidad_Medico;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.entity.Paciente;
import com.tapweb.apiresttapweb.llaves_compuestas.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@RestController
@RequestMapping("/v1")
public class Persona_controller {
    @Autowired
    @Qualifier("per_serv")
    private Persona_service per_serv;
    
    @Autowired
    @Qualifier("pac_serv")
    private Paciente_service pac_serv;

    @Autowired
    @Qualifier("med_serv")
    private Medico_service med_serv;

    @Autowired
    @Qualifier("user_serv")
    private Usuarios_service user_serv;

    @Autowired
    @Qualifier ("roles_serv")
    private Roles_Usuarios_service roles_serv;

    @Autowired
    @Qualifier ("esp_med_serv")
    private Especialidad_Medico_service esp_med_serv;

    @Autowired
    @Qualifier("esp_serv")
    private Especialidad_service esp_serv;


    @PostMapping(value="/persona/medico")
    public Persona_medico new_medico(@RequestBody Persona_medico p){
        Persona_medico registro = null;

        Usuarios usuario = new Usuarios (   p.getEmail(),
                                            p.getPassword()
        );

        boolean usuario_creado = user_serv.registrar(usuario);        
        if (usuario_creado){
            int id_usuario = user_serv.getLastUserId();
            int id_rol = 1;
            Roles_Usuarios_Id roles_pk = new Roles_Usuarios_Id(id_rol,id_usuario);
            boolean rol_asignado = roles_serv.registrar(roles_pk);
            Persona persona = new Persona(  p.getNombre(),
                                            p.getEstado(),
                                            p.getPais(),
                                            p.getMunicipio(),
                                            p.getTelefono(),
                                            p.getApellidos(),
                                            p.getDireccion(),
                                            id_usuario
            );
            boolean persona_creada = per_serv.registrar(persona);
            if (persona_creada && rol_asignado){
                int id_persona = per_serv.getId();
                Medico medico = new Medico( id_persona,
                                            p.getNumero_cedula()
                );
                boolean medico_creado = med_serv.registrar(medico);
                if  (medico_creado){
                    List<Especialidad_model> especialidades = new ArrayList<>();
                    Especialidad_Medico_Id es_med_pk= new Especialidad_Medico_Id(
                                                            p.getId_especialidad(),
                                                            id_persona
                    );
                    Especialidad_Medico esp_med = esp_med_serv.registrar_esp_med(es_med_pk);
                    especialidades = esp_serv.getEspByMedico(id_persona);    
                    registro = new Persona_medico(  id_persona,
                                                    p.getNombre(),
                                                    p.getEstado(),
                                                    p.getPais(),
                                                    p.getMunicipio(),
                                                    p.getTelefono(),
                                                    p.getApellidos(),
                                                    p.getDireccion(),
                                                    p.getNumero_cedula(),
                                                    id_usuario,
                                                    p.getEmail(),
                                                    p.getPassword(),
                                                    id_rol, 
                                                    especialidades
                    );
                }else{
                    System.out.println("No se pudo registrar en la tabla de Medicos");
                    registro = null; 
                }
            }else{
                System.out.println("No se pudo registrar en la tabla de Personas");
                registro = null;
            }
        }else{ 
            System.out.println("No se pudo registrar en la tabla de Usuarios");
            registro = null;
        }                        
        return registro;
    }

    @PostMapping(value="/persona/paciente")
    public Persona_paciente new_paciente(@RequestBody Persona_paciente p){
        Persona_paciente registro;
        Usuarios usuario = new Usuarios(    p.getEmail(),
                                            p.getPassword()
        );
        boolean usuario_creado = user_serv.registrar(usuario);
        if (usuario_creado){
            int id_usuario = user_serv.getLastUserId();
            int id_rol = 2;
            Roles_Usuarios_Id roles_pk = new Roles_Usuarios_Id(id_rol,id_usuario);
            boolean rol_asignado = roles_serv.registrar(roles_pk);            
            Persona persona = new Persona(  p.getNombre(),
                                            p.getEstado(),
                                            p.getPais(),
                                            p.getMunicipio(),
                                            p.getTelefono(),
                                            p.getApellidos(),
                                            p.getDireccion(),
                                            id_usuario
            );
            boolean persona_creada = per_serv.registrar(persona);
            if(persona_creada && rol_asignado){
                int id_persona = per_serv.getId();
                Paciente paciente = new Paciente(   id_persona,
                                                    p.getFecha_nac()                                         
                );
                boolean paciente_creado = pac_serv.registrar_paciente(paciente);
                if(paciente_creado){
                    registro = new Persona_paciente(    id_persona,
                                                        p.getNombre(),
                                                        p.getEstado(),
                                                        p.getPais(),
                                                        p.getMunicipio(),
                                                        p.getTelefono(),
                                                        p.getApellidos(),
                                                        p.getDireccion(),
                                                        p.getFecha_nac(),
                                                        id_usuario,
                                                        p.getEmail(),
                                                        p.getPassword(),
                                                        id_rol

                    );
                }else{
                    System.out.println("No se pudo registrar en la tabla de paciente");
                    registro = null;
                }
            }else{
                System.out.println("No se pudo registrar en la tabal de Personas");
                registro = null;
            }
        }else{
            System.out.println("No se pudo registrar en la tabla de Usuarios");
            registro = null;
        }
        return registro;
    }    

    @PutMapping(value="/persona/registrar")
    public boolean registrarPersona(@RequestBody @Valid Persona persona ){
        return per_serv.registrar(persona);
    }
    
    @GetMapping(value="/persona/listar")
    public List<Persona_model> listarpersona(){
        return per_serv.listar();
    }    
}