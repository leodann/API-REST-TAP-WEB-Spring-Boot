package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tapweb.apiresttapweb.entity.Servicios;

@Repository("serv_repo")
public interface Servicios_repo extends JpaRepository<Servicios, Serializable>{
    
}