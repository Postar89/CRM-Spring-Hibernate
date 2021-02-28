package com.work.crm.CRM.domain.country.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository repository;

    public void createNew(Country source)
    {
        repository.create(source);
    }

    public List<Country> getAll()
    {
        return repository.getAll();
    }

    public Country getWithId(long id)
    {
        return repository.findById(id);
    }

    public void update(long id, Country source) {
        Country existing = repository.findById(id);
        if (existing == null){
            repository.create(source);
        }else{
            source.setId(existing.getId());
            repository.update(source);
        }
    }

    public void delete(long id)
    {
        Country source = repository.findById(id);
        repository.delete(source);
    }
}
