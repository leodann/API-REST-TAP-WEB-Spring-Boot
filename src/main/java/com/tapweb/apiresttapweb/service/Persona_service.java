package com.tapweb.apiresttapweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

import com.tapweb.apiresttapweb.composite_objects.Persona_medico;
import com.tapweb.apiresttapweb.composite_objects.Persona_paciente;
import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Persona;
import com.tapweb.apiresttapweb.entity.Usuarios;
import com.tapweb.apiresttapweb.model.Persona_model;
import com.tapweb.apiresttapweb.repository.Persona_repo;
import com.tapweb.apiresttapweb.repository.Usuarios_repo;

@Service("per_serv")
public class Persona_service {
    @Autowired
    @Qualifier("per_repo")
    private Persona_repo per_repo;
    @Autowired
    @Qualifier("user_serv")
    private Usuarios_service user_serv;
    @Autowired
    @Qualifier("user_repo")
    private Usuarios_repo user_repo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean registrar(Persona persona) {
        try {
            per_repo.save(persona);
            return true;
        } catch (Exception e) {
            return false;
        }
    }    

    public int getLastId(){
        return per_repo.getIdByTopDesc();
    }

    public List<Persona_model> listar() {
        return convertidor.convertir_persona(per_repo.findAll());
    }

    public int getIdUser(int id_usuario) {
        return per_repo.getId(id_usuario);
    }

    public Persona getPersona(int id){
        return per_repo.getById(id);
    }

    public Persona_model persona_paciente(Persona_paciente nuevo_paciente) {
        Persona_model paciente = new Persona_model();
        try {            
            Usuarios aux_usuario = new Usuarios(
                                    nuevo_paciente.getEmail(), 
                                    nuevo_paciente.getPassword());            
            boolean user_registrado = user_serv.registrar_paciente(aux_usuario);
            if (user_registrado) {
                int id_user = user_serv.getLastUserId();
                Usuarios user = user_serv.getUsuario(id_user);
                Persona p = new Persona(
                                        nuevo_paciente.getNombre(),
                                        nuevo_paciente.getEstado(),
                                        nuevo_paciente.getPais(),
                                        nuevo_paciente.getMunicipio(),
                                        nuevo_paciente.getTelefono(),
                                        nuevo_paciente.getApellidos(),
                                        nuevo_paciente.getDireccion(),
                                        user
                );
                boolean persona_registrada = registrar(p);
                if  (persona_registrada){
                    int id_persona = getLastId();
                    Persona persona_paciente = getPersona(id_persona);
                    paciente = new Persona_model(persona_paciente);
                }else{
                    System.out.println("No se pudo registrar persona");
                }
            }else{
                System.out.println("No se pudo registrar usuario");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paciente;
    }    

    
    public Persona_model persona_medico(Persona_medico nuevo_medico) {
        Persona_model paciente = new Persona_model();
        try {            
            Usuarios aux_usuario = new Usuarios(
                                    nuevo_medico.getEmail(), 
                                    nuevo_medico.getPassword());            
            boolean user_registrado = user_serv.registrar_medico(aux_usuario);
            if (user_registrado) {
                int id_user = user_serv.getLastUserId();
                Usuarios user = user_serv.getUsuario(id_user);
                Persona p = new Persona(
                                        nuevo_medico.getNombre(),
                                        nuevo_medico.getEstado(),
                                        nuevo_medico.getPais(),
                                        nuevo_medico.getMunicipio(),
                                        nuevo_medico.getTelefono(),
                                        nuevo_medico.getApellidos(),
                                        nuevo_medico.getDireccion(),
                                        user
                );
                boolean persona_registrada = registrar(p);
                if  (persona_registrada){
                    int id_persona = getLastId();
                    Persona persona_paciente = getPersona(id_persona);
                    paciente = new Persona_model(persona_paciente);
                }else{
                    System.out.println("No se pudo registrar persona");
                }
            }else{
                System.out.println("No se pudo registrar usuario");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paciente;
    }    
}