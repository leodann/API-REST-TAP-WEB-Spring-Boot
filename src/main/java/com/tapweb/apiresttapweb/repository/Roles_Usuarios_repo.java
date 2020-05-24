package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;

import com.tapweb.apiresttapweb.entity.Roles_Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("roles_repo")
public interface Roles_Usuarios_repo extends JpaRepository<Roles_Usuarios, Serializable>{
    @Query(
        value = "SELECT * FROM roles_usuario WHERE id_usuario = :id_usuario",
        nativeQuery = true
    )
    Roles_Usuarios findByIdUser(@Param("id_usuario")int id_usuario);
}