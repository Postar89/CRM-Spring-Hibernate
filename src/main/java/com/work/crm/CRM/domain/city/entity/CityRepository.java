package com.work.crm.CRM.domain.city.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CityRepository {
    List<City> findAll();
    Page<City> findAll(Pageable page);
    Optional<City> findById(Integer page);
    boolean existsById(Integer id);
    City save(City entity);
}
