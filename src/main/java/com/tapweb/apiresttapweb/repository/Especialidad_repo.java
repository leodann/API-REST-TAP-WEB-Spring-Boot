package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Especialidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("esp_repo")
public interface Especialidad_repo extends JpaRepository<Especialidad, Serializable>{
    @Query(
        value = "SELECT e.id_especialidad, e.especialidad "+
                "FROM medico_especialidad me "+
                "INNER JOIN especialidades e on me.id_especialidad = e.id_especialidad "+
                "WHERE me.id_persona = :id_persona ",
        nativeQuery = true
    )
    List<Especialidad> getByMedico(@Param("id_persona") int id_persona);
    
}