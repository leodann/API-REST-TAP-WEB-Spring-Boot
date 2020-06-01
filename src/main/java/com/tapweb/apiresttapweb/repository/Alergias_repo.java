package com.tapweb.apiresttapweb.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tapweb.apiresttapweb.entity.Alergias;

import java.io.Serializable;
import java.util.List;

@Repository("aler_repo")
public interface Alergias_repo extends JpaRepository<Alergias,Serializable>{

    @Query (
        value = "SELECT * FROM alergias WHERE id_persona = :id_persona",
        nativeQuery = true
    )
    List<Alergias>getByPaciente (@Param("id_persona")int id);
    
}