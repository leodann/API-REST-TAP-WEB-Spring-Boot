package com.tapweb.apiresttapweb.repository;

import com.tapweb.apiresttapweb.entity.Especialidad_Medico;
import com.tapweb.apiresttapweb.llaves_compuestas.Especialidad_Medico_Id;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("esp_med_repo")
public interface Especialidad_Medico_repo extends CrudRepository<Especialidad_Medico,Especialidad_Medico_Id>{
}