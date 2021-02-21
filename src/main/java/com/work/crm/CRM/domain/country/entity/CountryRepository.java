package com.work.crm.CRM.domain.country.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CountryRepository {
    List<Country> findAll();
    Page<Country> findAll(Pageable page);
    Optional<Country> findById(Integer i);
    Country save(Country entity);
    boolean existsById(Integer id);
//    List<Country> saveAll(List<Country> entities);
}
