package com.work.crm.CRM.domain.meetingStatus.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MeetingStatusRepository {
    
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void create(MeetingStatus source)
    {
        em.persist(source);
    }

    @Transactional
    public void update(MeetingStatus source) {
        em.merge(source);
    }

    public MeetingStatus findById(long id) {
        return em.find(MeetingStatus.class, id);
    }

    public List<MeetingStatus> getAll() {
        return em.createQuery("Select table from MeetingStatus table", MeetingStatus.class).getResultList();
    }

    @Transactional
    public void delete(MeetingStatus source){
        em.remove(source);
    }
}
