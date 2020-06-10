package com.tapweb.apiresttapweb.service;

import java.util.ArrayList;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Consultas;
import com.tapweb.apiresttapweb.entity.Medico;
import com.tapweb.apiresttapweb.entity.Paciente;
import com.tapweb.apiresttapweb.model.Consulta_vista_model;
import com.tapweb.apiresttapweb.model.Especialidades_model;
import com.tapweb.apiresttapweb.model.Sintomas_model;
import com.tapweb.apiresttapweb.repository.Consultas_repo;

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

    @Autowired
    @Qualifier("pac_serv")
    private Paciente_service pac_serv;

    @Autowired
    @Qualifier("med_serv")
    private Medico_service med_serv;

    @Autowired
    @Qualifier("cons_repo")
    private Consultas_repo cons_repo;

    public List<Consulta_vista_model>listar(){
        List<Consulta_vista_model> cv = new ArrayList<>();
        List<Consultas> cs = cons_repo.Todas();
        for(Consultas c : cs){
            /*int id_consulta = c.getId_consulta();            
            
            Paciente p = pac_serv.getPaciente(id_paciente);
            String desc = c.getDescripcion(); 
            List<Sintomas_model>pruebas = sint_serv.listarSintomas(id_consulta);
            List<Especialidades_model>especialidades = esp_serv.getEspByConsulta(id_consulta);
            String fecha = c.getFecha();
            int id_medico = c.getMedico().getId_persona();
            Medico m = med_serv.getMedicoById(id_medico);
            cv.add(new Consulta_vista_model(id_consulta,id_paciente,desc,id_medico,pruebas,especialidades,m,p,fecha));            */
            int id_paciente = c.getPaciente().getId_persona();
            System.out.println(c.toString());
            cv.add(getById(id_paciente,c.getId_consulta()));

        }
        return cv;
    }

    public List<Consulta_vista_model> listarTodo(int id_persona){
        List<Consulta_vista_model>cv = new ArrayList<>();
        List<Consultas> consultas = cons_serv.getMisConsultas(id_persona);
        for (Consultas c: consultas){
            /*int id_consulta = c.getId_consulta();            
            int id_paciente = c.getPaciente().getId_persona();
            Paciente p = pac_serv.getPaciente(id_paciente);
            String desc = c.getDescripcion(); 
            List<Sintomas_model>pruebas = sint_serv.listarSintomas(id_consulta);
            List<Especialidades_model>especialidades = esp_serv.getEspByConsulta(id_consulta);
            String fecha = c.getFecha();            
                int id_medico = c.getMedico().getId_persona();
                Medico m = med_serv.getMedicoById(id_medico);
                cv.add(new Consulta_vista_model(id_consulta,id_paciente,desc,id_medico,pruebas,especialidades,m,p,fecha));     */   
                System.out.println(c.toString());
            cv.add(getById(id_persona,c.getId_consulta()));
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
        Paciente p = pac_serv.getPaciente(id_paciente);
        Medico m = med_serv.getMedicoById(id_medico);
        String fecha = consulta.getFecha();

        cv.setId_consulta(id_consulta);
        cv.setId_paciente(id_paciente);
        cv.setDescripcion(desc);
        cv.setId_medico(id_medico);
        cv.setPruebas(pruebas);
        cv.setEspecialidades(especialidades);
        cv.setM(m);
        cv.setP(p);
        cv.setFecha(fecha);
        
        return cv;

    }
}