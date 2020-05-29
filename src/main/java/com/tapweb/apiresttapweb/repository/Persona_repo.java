package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tapweb.apiresttapweb.entity.Persona;

@Repository("per_repo")
public interface Persona_repo extends JpaRepository<Persona, Serializable>{

    @Query(
        value = "select id_persona from personas order by id_persona DESC LIMIT 1",
        nativeQuery = true
    )
    int getIdByTopDesc();  
    
    @Query(
        value = "SELECT id_persona FROM personas WHERE id_usuario = :id_usuario",
        nativeQuery = true
    )
    int getId(@Param("id_usuario")int id_usuario);
    
}