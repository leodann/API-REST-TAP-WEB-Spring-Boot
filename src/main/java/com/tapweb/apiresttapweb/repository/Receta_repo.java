package com.tapweb.apiresttapweb.repository;

import java.io.Serializable;

import com.tapweb.apiresttapweb.entity.Receta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("rec_repo")
public interface Receta_repo extends JpaRepository<Receta, Serializable>{
    @Query(
        value = "select * from receta where id_consulta = :id_consulta",
        nativeQuery = true
    )
    Receta getByConsulta (@Param("id_consulta")int id_consulta);
    
    @Transactional
    @Query(
        value = "update receta set conclusion = :conclusion, descripcion = :descripcion, medicamentos = :medicamentos WHERE id_consulta = :id_consulta",
        nativeQuery = true
    )
    int updateConsulta (    @Param("conclusion")String conclusion, 
                            @Param("descripcion")String descripcion,
                            @Param("medicamentos")String medicamentos,
                            @Param("id_consulta")int id_consulta);
    
}