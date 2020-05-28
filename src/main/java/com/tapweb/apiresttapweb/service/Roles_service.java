package com.tapweb.apiresttapweb.service;

import java.util.List;
import java.util.Optional;

import com.tapweb.apiresttapweb.converter.Convertidor;
import com.tapweb.apiresttapweb.entity.Roles;
import com.tapweb.apiresttapweb.model.Roles_model;
import com.tapweb.apiresttapweb.repository.Roles_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("rol_serv")
public class Roles_service {
    @Autowired
    @Qualifier("rol_repo")
    private Roles_repo rol_repo;
    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public List<Roles_model> listar_roles() {
        return convertidor.convertir_roles(rol_repo.findAll());
    }
    
    public Roles getRol(int id){
        return rol_repo.getById(id);
    }
}