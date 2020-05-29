package com.tapweb.apiresttapweb.repository;

import com.tapweb.apiresttapweb.composite_keys.Esp_med_PK;
import com.tapweb.apiresttapweb.entity.Esp_med;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("esp_med_repo")
public interface Esp_med_repo extends CrudRepository<Esp_med,Esp_med_PK>{
    
}