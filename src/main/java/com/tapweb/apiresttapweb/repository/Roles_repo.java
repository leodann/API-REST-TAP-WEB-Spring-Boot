package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;

import com.tapweb.apiresttapweb.entity.Roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("rol_repo")
public interface Roles_repo extends JpaRepository<Roles, Serializable>{
    @Query(
        value = "select * from roles where id_rol = :id_rol",
        nativeQuery = true
    )
    Roles getById(@Param("id_rol")int id);
}