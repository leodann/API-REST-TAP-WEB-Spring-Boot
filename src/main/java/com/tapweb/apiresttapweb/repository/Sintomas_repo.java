package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Sintomas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("sint_repo")
public interface Sintomas_repo extends JpaRepository<Sintomas, Serializable>{
    @Query(
        value = "select * from sintomas where id_consutla = :id_consulta",
        nativeQuery = true

    )
    List<Sintomas> getByConsulta(@Param("id_consulta")int id_consulta);
}