package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tapweb.apiresttapweb.entity.Servicios;

@Repository("serv_repo")
public interface Servicios_repo extends JpaRepository<Servicios, Serializable>{
    @Query(
        value = "SELECT * FROM servicios WHERE id_persona = :id_persona",
        nativeQuery = true        
    )
    List<Servicios> getServiciosByMedico(@Param("id_persona")int id_persona);
    
    @Query(
        value = "SELECT * FROM servicios WHERE id_servicio = :id_servicio",
        nativeQuery = true
    )
    Servicios findById(@Param("id_servicio")int id_servicio);
    
    @Transactional    
    @Query(
        value = "UPDATE servicios SET servicio = :servicio, "+
                "costo = :costo "+
                "WHERE id_servicio = :id_servicio",
        nativeQuery = true
    )
    int UpdateServicioById( @Param("servicio") String servicio,
                            @Param("costo") int costo,
                            @Param("id_servicio") int id_servicio);                             
}