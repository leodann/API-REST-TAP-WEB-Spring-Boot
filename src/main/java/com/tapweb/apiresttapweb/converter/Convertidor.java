package com.tapweb.apiresttapweb.converter;

import java.util.ArrayList;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Alergias;
import com.tapweb.apiresttapweb.entity.Cirugias;
import com.tapweb.apiresttapweb.entity.Especialidades;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.entity.Paciente;
import com.tapweb.apiresttapweb.entity.Persona;
import com.tapweb.apiresttapweb.entity.Roles;
import com.tapweb.apiresttapweb.entity.Roles_Usuarios;
import com.tapweb.apiresttapweb.entity.Servicios;
import com.tapweb.apiresttapweb.entity.Usuarios;
import com.tapweb.apiresttapweb.model.Alergias_model;
import com.tapweb.apiresttapweb.model.Cirugias_model;
import com.tapweb.apiresttapweb.model.Especialidades_model;
import com.tapweb.apiresttapweb.model.Medico_model;
import com.tapweb.apiresttapweb.model.Paciente_model;
import com.tapweb.apiresttapweb.model.Persona_model;
import com.tapweb.apiresttapweb.model.Roles_Usuarios_model;
import com.tapweb.apiresttapweb.model.Roles_model;
import com.tapweb.apiresttapweb.model.Servicios_model;
import com.tapweb.apiresttapweb.model.Usuarios_model;

import org.springframework.stereotype.Component;

@Component("convertidor")
public class Convertidor {
    
    public List<Usuarios_model>convertir_usuarios(List<Usuarios>usuarios){
        List<Usuarios_model>mUsuarios = new ArrayList<>();
        for (Usuarios usuario : usuarios){
            mUsuarios.add(new Usuarios_model(usuario));
        }
        return mUsuarios;
    }

    public List<Roles_model>convertir_roles (List<Roles>roles){
        List<Roles_model>mroles = new ArrayList<>();
        for(Roles rol : roles){
            mroles.add(new Roles_model(rol));
        }
        return mroles;
    }

    public List<Roles_Usuarios_model>convertir_roles_usuarios(List<Roles_Usuarios>roles){
        List<Roles_Usuarios_model>mroles_u = new ArrayList<>();
        for(Roles_Usuarios rol : roles){
            mroles_u.add(new Roles_Usuarios_model(rol));
        }
        return mroles_u;
    }

    public List<Persona_model>convertir_persona(List<Persona> personas){
        List<Persona_model>mpersona = new ArrayList<>();
        for(Persona persona : personas){
            mpersona.add(new Persona_model(persona));
        }
        return mpersona;
    }

    public List<Paciente_model> convertir_paciente(List<Paciente> pacientes){
        List<Paciente_model>mpaciente = new ArrayList<>();
        for(Paciente paciente : pacientes){
            mpaciente.add(new Paciente_model(paciente));
        }
        return mpaciente;
    }

    public List<Medico_model> convertir_medico(List<Medico> medicos){
        List<Medico_model>mmedico = new ArrayList<>();
        for (Medico medico : medicos){
            mmedico.add(new Medico_model(medico));
        }
        return mmedico;
    }

    public List<Especialidades_model> convertir_especialidades(List<Especialidades> especialidades){
        List<Especialidades_model>mespecialidades = new ArrayList<>();
        for(Especialidades especialidad : especialidades){
            mespecialidades.add(new Especialidades_model(especialidad));
        }    
        return mespecialidades;
    }

    public List<Servicios_model>convertir_servicios(List<Servicios>servicios){
        List<Servicios_model>mservicios = new ArrayList<>();
        for(Servicios servicio : servicios){
            mservicios.add(new Servicios_model(servicio));
        }
        return mservicios;
    }

    public List<Cirugias_model>convertir_cirugias(List<Cirugias> cirugias){
        List<Cirugias_model>mcirugias = new ArrayList<>();
        for (Cirugias cirugia : cirugias){
            mcirugias.add(new Cirugias_model(cirugia));
        }
        return mcirugias;
    }

    public List<Alergias_model>convertir_alergias (List<Alergias>alergias){
        List<Alergias_model>malergias = new ArrayList<>();
        for (Alergias alergia : alergias){
            malergias.add(new Alergias_model(alergia));
        }
        return malergias;
    }
}