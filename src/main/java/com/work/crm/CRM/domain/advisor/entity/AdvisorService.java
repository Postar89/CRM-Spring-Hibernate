package com.work.crm.CRM.domain.advisor.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvisorService {
    @Autowired
    AdvisorRepository repository;

    public void createNew(Advisor source)
    {
        repository.create(source);
    }

    public List<Advisor> getAll()
    {
        return repository.getAll();
    }

    public Advisor getWithId(long id)
    {
        return repository.findById(id);
    }

    public void update(long id, Advisor source) {
        Advisor existing = repository.findById(id);
        if (existing == null){
            repository.create(source);
        }else{
            source.setId(existing.getId());
            repository.update(source);
        }
    }

    public void delete(long id)
    {
        Advisor source = repository.findById(id);
        repository.delete(source);
    }
}
