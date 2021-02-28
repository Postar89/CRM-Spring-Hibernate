package com.work.crm.CRM.domain.place.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
    @Autowired
    PlaceRepository repository;

    public void createNew(Place source)
    {
        repository.create(source);
    }

    public List<Place> getAll()
    {
        return repository.getAll();
    }

    public Place getWithId(long id)
    {
        return repository.findById(id);
    }

    public void update(long id, Place source) {
        Place existing = repository.findById(id);
        if (existing == null){
            repository.create(source);
        }else{
            source.setId(existing.getId());
            repository.update(source);
        }
    }

    public void delete(long id)
    {
        Place source = repository.findById(id);
        repository.delete(source);
    }
}
