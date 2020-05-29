package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;

import com.tapweb.apiresttapweb.entity.Medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("med_repo")
public interface Medico_repo extends JpaRepository<Medico, Serializable>{
    
    
}