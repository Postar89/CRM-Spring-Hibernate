package com.work.crm.CRM.ui.entity.place;

import java.util.List;
import java.util.Optional;

public interface PlaceRepository {
    List<Place> findAll();
    Optional<Place> findById(Integer i);
    boolean existsById(Integer id);
    Place save(Place entity);
    List<Place> saveAll(List<Place> entities);
}
