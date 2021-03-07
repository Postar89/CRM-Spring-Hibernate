package com.work.crm.CRM.domain.meeting.entity;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MeetingRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void create(Meeting source){em.persist(source);}

    @Transactional
    public void update(Meeting source){em.merge(source);}

    public Meeting findById(long id){return em.find(Meeting.class, id);}

    public List<Meeting> getAll(){return em.createQuery("Select table from Meeting table", Meeting.class).getResultList();}

    @Transactional
    public void delete(Meeting source){em.remove(source);}
}
