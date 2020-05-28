package com.tapweb.apiresttapweb.repository;

import com.tapweb.apiresttapweb.entity.Roles_Usuarios;
import com.tapweb.apiresttapweb.llaves_compuestas.Roles_Usuarios_Id;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("roles_repo")
public interface Roles_Usuarios_repo extends CrudRepository<Roles_Usuarios, Roles_Usuarios_Id>{
    @Query(
        value = "SELECT * FROM roles_usuario WHERE id_usuario = :id_usuario",
        nativeQuery = true
    )
    Roles_Usuarios findByIdUser(@Param("id_usuario")int id_usuario);
}