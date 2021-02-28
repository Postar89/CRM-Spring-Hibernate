package com.work.crm.CRM.domain.meeting.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {
    @Autowired
    MeetingRepository repository;

    public void createNew(Meeting source)
    {
        repository.create(source);
    }

    public List<Meeting> getAll()
    {
        return repository.getAll();
    }

    public Meeting getWithId(long id)
    {
        return repository.findById(id);
    }

    public void update(long id, Meeting source) {
        Meeting existing = repository.findById(id);
        if (existing == null){
            repository.create(source);
        }else{
            source.setId(existing.getId());
            repository.update(source);
        }
    }

    public void delete(long id)
    {
        Meeting source = repository.findById(id);
        repository.delete(source);
    }
}
