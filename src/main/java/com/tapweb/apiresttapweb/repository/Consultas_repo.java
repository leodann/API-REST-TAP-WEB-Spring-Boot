package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Consultas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cons_repo")
public interface Consultas_repo extends JpaRepository<Consultas, Serializable>{
    @Query(
        value = " SELECT * FROM consultas c"+
                " WHERE c.id_medico IS NULL "+
                " AND exists("+
                " SELECT  DISTINCT e.id_consulta"+
                " FROM esp_consulta e INNER JOIN medico_especialidad me on e.id_especialidad = me.id_especialidad"+
                " WHERE me.id_persona = :id_persona"+
                " AND e.id_consulta = c.id_consulta )",        
        nativeQuery = true
    )
    List<Consultas> getNoAtendidas(@Param("id_persona")int id_persona);    

    @Query(
        value = "SELECT * FROM consultas WHERE id_paciente = :id_persona OR id_medico = :id_persona",
                nativeQuery = true
    )
    List<Consultas>getMisConsultas(@Param("id_persona")int id_persona);

    @Query(
        value = "SELECT id_consulta FROM consultas ORDER BY id_consulta DESC LIMIT 1",
        nativeQuery = true
    )
    int getIdTopDesc();

    @Query(
        value = "SELECT * FROM consultas WHERE id_consulta = :id_consulta",
        nativeQuery = true
    )
    Consultas getById(@Param("id_consulta")int id_consulta);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(
        value = "UPDATE consultas SET id_medico = :id_medico WHERE id_consulta = :id_consulta",
        nativeQuery = true
    )
    Integer updateMedico(@Param("id_medico")int id_medico, @Param("id_consulta")int id_consulta);

    @Query(
        value = "SELECT * FROM consultas WHERE id_consulta = :id_consulta AND (id_paciente = :id_persona OR id_medico = :id_persona)",
        nativeQuery = true
    )
    Consultas getMiconsulta(@Param("id_consulta")int id_consulta,@Param("id_persona")int id_persona);
}