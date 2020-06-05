package com.tapweb.apiresttapweb.service;

import java.util.ArrayList;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Consultas;
import com.tapweb.apiresttapweb.model.Consulta_vista_model;
import com.tapweb.apiresttapweb.model.Especialidades_model;
import com.tapweb.apiresttapweb.model.Sintomas_model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("cons_view_serv")
public class Consulta_vista_service {
    @Autowired
    @Qualifier("cons_serv")
    private Consultas_service cons_serv;

    @Autowired
    @Qualifier("esp_serv")
    private Especialidades_service esp_serv;

    @Autowired
    @Qualifier("sint_serv")
    private Sintomas_service sint_serv;

    public List<Consulta_vista_model> listarTodo(int id_persona){
        List<Consulta_vista_model>cv = new ArrayList<>();
        List<Consultas> consultas = cons_serv.getMisConsultas(id_persona);
        for (Consultas c: consultas){
            int id_consulta = c.getId_consulta();            
            int id_paciente = c.getPaciente().getId_persona();
            String desc = c.getDescripcion(); 
            int id_medico = c.getMedico().getId_persona();
            List<Sintomas_model>pruebas = sint_serv.listarSintomas(id_consulta);
            List<Especialidades_model>especialidades = esp_serv.getEspByConsulta(id_consulta);
            cv.add(new Consulta_vista_model(id_consulta,id_paciente,desc,id_medico,pruebas,especialidades));            
        }
        return cv;
    }

    public Consulta_vista_model getById(int id_persona,int id_consulta){
        Consulta_vista_model cv = new Consulta_vista_model();
        Consultas consulta = cons_serv.getMiConsultas(id_consulta, id_persona);
        
        int id_paciente = consulta.getPaciente().getId_persona();
        String desc = consulta.getDescripcion();
        int id_medico = consulta.getMedico().getId_persona();
        List<Sintomas_model> pruebas = sint_serv.listarSintomas(id_consulta);
        List<Especialidades_model> especialidades = esp_serv.getEspByConsulta(id_consulta);
        cv.setId_consulta(id_consulta);
        cv.setId_paciente(id_paciente);
        cv.setDescripcion(desc);
        cv.setId_medico(id_medico);
        cv.setPruebas(pruebas);
        cv.setEspecialidades(especialidades);
        
        return cv;

    }
    


}