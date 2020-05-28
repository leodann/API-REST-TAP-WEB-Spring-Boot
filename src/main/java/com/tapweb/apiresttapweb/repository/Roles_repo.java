package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;

import com.tapweb.apiresttapweb.entity.Roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("rol_repo")
public interface Roles_repo extends JpaRepository<Roles, Serializable>{
    
}