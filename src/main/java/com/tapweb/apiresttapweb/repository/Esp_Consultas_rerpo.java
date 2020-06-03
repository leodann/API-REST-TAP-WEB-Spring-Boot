package com.tapweb.apiresttapweb.repository;

import java.util.List;

import com.tapweb.apiresttapweb.composite_keys.Esp_Consultas_PK;
import com.tapweb.apiresttapweb.entity.Esp_Consultas;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("esp_cons_repo")
public interface Esp_Consultas_rerpo extends CrudRepository<Esp_Consultas,Esp_Consultas_PK>{
    @Query(
        value = "SELECT * FROM esp_consulta",
        nativeQuery = true
    )
    List<Esp_Consultas>getAll();

    
}