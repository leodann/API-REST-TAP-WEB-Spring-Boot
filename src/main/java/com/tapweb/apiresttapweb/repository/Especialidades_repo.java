package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;

import com.tapweb.apiresttapweb.entity.Especialidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("esp_repo")
public interface Especialidades_repo extends JpaRepository<Especialidades,Serializable>{
    /*@Query(
        value = "SELECT e.id_especialidad, e.especialidad "+
                "FROM medico_especialidad me "+
                "INNER JOIN especialidades e on me.id_especialidad = e.id_especialidad "+
                "WHERE me.id_persona = :id_persona ",
        nativeQuery = true
    )
    List<Especialidades> getByMedico(@Param("id_persona") int id_persona);*/
    
}