package com.tapweb.apiresttapweb.repository;

import com.tapweb.apiresttapweb.composite_keys.Roles_Usuario_PK;
import com.tapweb.apiresttapweb.entity.Roles_Usuarios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("roles_u_repo")
public interface Roles_Usuarios_repo extends CrudRepository<Roles_Usuarios,Roles_Usuario_PK>{
    @Query(
        value = "SELECT * FROM roles_usuario WHERE id_usuario = :id_usuario",
        nativeQuery = true
    )
    Roles_Usuarios findByIdUser(@Param("id_usuario")int id_usuario);
}