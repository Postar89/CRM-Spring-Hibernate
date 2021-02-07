package com.work.crm.CRM.ui.domain.source.country.entity;

import java.util.List;
import java.util.Optional;

public interface CountryRepository {
    List<Country> findAll();
    Optional<Country> findById(Integer i);
    Country save(Country entity);
    boolean existsById(Integer id);
//    List<Country> saveAll(List<Country> entities);
}
