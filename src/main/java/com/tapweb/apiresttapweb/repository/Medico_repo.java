package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;

import com.tapweb.apiresttapweb.entity.Medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("med_repo")
public interface Medico_repo extends JpaRepository<Medico, Serializable>{
    @Query(
        value = "SELECT * FROM medicos WHERE id_persona = :id_persona",
        nativeQuery = true
    )
    Medico getById(@Param("id_persona")int id);
    
}