package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;

import com.tapweb.apiresttapweb.entity.Usuarios;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository("user_repo")
public interface Usuarios_repo extends JpaRepository<Usuarios,Serializable>{
    @Query(
        value = "SELECT id_usuario from usuarios order by id_usuario DESC LIMIT 1",
        nativeQuery = true
    )
    int getIdUserTopDesc();
    @Query(
        value = "SELECT * FROM usuarios WHERE email = :email and password = :password",
        nativeQuery = true
    )
    Usuarios findByEmailandPass(@Param("email") String email,@Param("password")String password);

    @Query(
        value = "select * from usuarios where id_usuario = :id_usuario",
        nativeQuery = true        
    )
    Usuarios getById(@Param("id_usuario")int id);
}