package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Cirugias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("cir_repo")
public interface Cirugias_repo extends JpaRepository<Cirugias, Serializable>{
    @Query(
        value = "select * from cirugias where id_persona = :id_persona",
        nativeQuery = true
    )
    List<Cirugias>getByPaciente(@Param("id_persona")int id);
}