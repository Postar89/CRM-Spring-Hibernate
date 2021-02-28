package com.work.crm.CRM.domain.rltAddressPerson.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RLTAddressPersonService {
    
    @Autowired
    RLTAddressPersonRepository repository;

    public void createNew(RLTAddressPerson source)
    {
        repository.create(source);
    }

    public List<RLTAddressPerson> getAll()
    {
        return repository.getAll();
    }

    public RLTAddressPerson getWithId(long id)
    {
        return repository.findById(id);
    }

    public void update(long id, RLTAddressPerson source) {
        RLTAddressPerson existing = repository.findById(id);
        if (existing == null){
            repository.create(source);
        }else{
            source.setId(existing.getId());
            repository.update(source);
        }
    }

    public void delete(long id)
    {
        RLTAddressPerson source = repository.findById(id);
        repository.delete(source);
    }
}
