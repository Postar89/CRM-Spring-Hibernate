package com.work.crm.CRM.domain.city.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityRepository repository;

    public void createNew(City source)
    {
        repository.create(source);
    }

    public List<City> getAll()
    {
        return repository.getAll();
    }

    public City getWithId(long id)
    {
        return repository.findById(id);
    }

    public void update(long id, City source) {
        City existing = repository.findById(id);
        if (existing == null){
            repository.create(source);
        }else{
            source.setId(existing.getId());
            repository.update(source);
        }
    }

    public void delete(long id)
    {
        City source = repository.findById(id);
        repository.delete(source);
    }
}
