package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;
import java.util.List;

import com.tapweb.apiresttapweb.entity.Enf_Cronicas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("enf_repo")
public interface Enf_Cronicas_repo extends JpaRepository<Enf_Cronicas, Serializable>{
    @Query(
        value = "SELECT * FROM enf_cronicas WHERE id_persona = :id_persona",
        nativeQuery = true
    )
    List<Enf_Cronicas> getByPaciente(@Param("id_persona")int id);
}