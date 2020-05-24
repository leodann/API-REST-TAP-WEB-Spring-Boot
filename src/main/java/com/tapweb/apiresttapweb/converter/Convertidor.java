package com.tapweb.apiresttapweb.converter;

import org.springframework.stereotype.Component;
import com.tapweb.apiresttapweb.entity.*;
import com.tapweb.apiresttapweb.model.*;

import java.util.ArrayList;
import java.util.List;

@Component("convertidor")
public class Convertidor {
    public List<Persona_model>convertir_lista_persona (List<Persona> personas){
        List<Persona_model> mpersonas = new ArrayList<>();
        for(Persona persona : personas ){
            mpersonas.add(new Persona_model(persona));
        }
        return mpersonas;
    }
    
    public List<Medico_model>convertir_lista_medico(List<Medico> medicos){
        List<Medico_model> mmedicos = new ArrayList<>();
        for(Medico medico : medicos){
            mmedicos.add(new Medico_model(medico));
        }
        return mmedicos;
    }

    public List<Paciente_model>convertir_lista_paciente(List<Paciente> pacientes){
        List<Paciente_model> mpaciente = new ArrayList<>();
        for(Paciente paciente : pacientes){
            mpaciente.add(new Paciente_model(paciente));
        }
        return mpaciente;
    }

    public List<Especialidad_model>convertir_lista_especialida(List<Especialidad> especialidades){
        List<Especialidad_model> mespecialidad = new ArrayList<>();
        for(Especialidad especialidad : especialidades){
            mespecialidad.add(new Especialidad_model(especialidad));
        }
        return mespecialidad;
    }

    public List<Servicios_model>convertir_lista_servicios(List<Servicios> servicios){
        List<Servicios_model>mservicio = new ArrayList<>();
        for(Servicios servicio : servicios){
            mservicio.add(new Servicios_model(servicio));
        }
        return mservicio;
    }

    public List<Usuarios_model>convertir_lista_usuarios(List<Usuarios> usuarios){
        List<Usuarios_model>musuario = new ArrayList<>();
        for(Usuarios usuario : usuarios){
            musuario.add(new Usuarios_model(usuario));
        }
        return musuario;
    }

    public List<Roles_Usuarios_model>convertir_lista_roles_usuarios(List<Roles_Usuarios> roles){
        List<Roles_Usuarios_model> mroles_usuarios = new ArrayList<>();
        for(Roles_Usuarios rol : roles ){
            mroles_usuarios.add(new Roles_Usuarios_model(rol));
        }
        return mroles_usuarios;
    }

    public List<Especialidad_Medico_model>convertirl_especialidad_medico(List<Especialidad_Medico> esp_m){
        List<Especialidad_Medico_model> mesp_med = new ArrayList<>();
        for (Especialidad_Medico esp_med : esp_m){
            mesp_med.add(new Especialidad_Medico_model(esp_med));
        }        
        return mesp_med;
    }
}