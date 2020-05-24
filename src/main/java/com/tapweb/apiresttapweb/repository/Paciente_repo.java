package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Paciente;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("pac_repo")
public interface Paciente_repo extends JpaRepository<Paciente, Serializable>{
    @Query(
        value = "SELECT * FROM pacientes",
        nativeQuery = true
    )
    List<Paciente> fidnAllByNativeQuery();
    /*@Query(
        value = "SELECT * FROM medicos",
        nativeQuery = true
    )
    List<Medico_model> finAllMedicos();*/
}