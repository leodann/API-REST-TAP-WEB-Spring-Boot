package com.tapweb.apiresttapweb.service;

import java.util.List;

import com.tapweb.apiresttapweb.entity.Alergias;
import com.tapweb.apiresttapweb.entity.Cirugias;
import com.tapweb.apiresttapweb.entity.Enf_Cronicas;
import com.tapweb.apiresttapweb.model.Antecedentes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ant_serv")
public class Antecedentes_service {
    @Autowired
    @Qualifier("enf_serv")
    private Enf_Cronicas_service enf_serv;
    
    @Autowired
    @Qualifier("aler_serv")
    private Alergias_service aler_serv;

    @Autowired
    @Qualifier("cir_serv")
    private Cirugias_service cir_serv;

    public Antecedentes listar_antecedentes(int id_paciente){
        Antecedentes a = new Antecedentes();
        List<Cirugias>cirugias = cir_serv.getCirguiaByPaciente(id_paciente);
        List<Enf_Cronicas>cronicas = enf_serv.getCronicasByPaciente(id_paciente);
        List<Alergias>alergias = aler_serv.getAlergiasByPaciente(id_paciente);
        a = new Antecedentes(id_paciente,cronicas,alergias,cirugias);
        return a;
    }
}