package com.work.crm.CRM.domain.place.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PlaceRepository {
    List<Place> findAll();
    Page<Place> findAll(Pageable page);
    Optional<Place> findById(Integer i);
    boolean existsById(Integer id);
    Place save(Place entity);
//    List<Place> saveAll(List<Place> entities);
}
