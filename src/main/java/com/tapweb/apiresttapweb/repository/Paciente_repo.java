package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("pac_repo")
public interface Paciente_repo extends JpaRepository<Paciente, Serializable>{

    @Query(
        value = "SELECT * FROM pacientes",
        nativeQuery = true
    )
    List<Paciente> getAllPacients();

    @Query(
        value = "SELECT * FROM pacientes WHERE id_persona = :id_persona",
        nativeQuery = true
    )
    Paciente getPacienteById (@Param("id_persona")int id);
    
}