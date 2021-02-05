package com.work.crm.CRM.ui.entity.city;

import java.util.List;
import java.util.Optional;

public interface CityRepository {
    List<City> findAll();
    Optional<City> findById(Integer i);
    boolean existsById(Integer id);
    City save(City entity);
    List<City> saveAll(List<City> entities);
}
