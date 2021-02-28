package com.work.crm.CRM.domain.meetingStatus.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingStatusService {
    @Autowired
    MeetingStatusRepository repository;

    public void createNew(MeetingStatus source)
    {
        repository.create(source);
    }

    public List<MeetingStatus> getAll()
    {
        return repository.getAll();
    }

    public MeetingStatus getWithId(long id)
    {
        return repository.findById(id);
    }

    public void update(long id, MeetingStatus source) {
        MeetingStatus existing = repository.findById(id);
        if (existing == null){
            repository.create(source);
        }else{
            source.setId(existing.getId());
            repository.update(source);
        }
    }

    public void delete(long id)
    {
        MeetingStatus source = repository.findById(id);
        repository.delete(source);
    }
}
