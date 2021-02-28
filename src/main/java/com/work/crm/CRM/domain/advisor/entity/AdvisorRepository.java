package com.work.crm.CRM.domain.advisor.entity;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class AdvisorRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void create(Advisor source)
    {
        em.persist(source);
    }

    @Transactional
    public void update(Advisor source) {
        em.merge(source);
    }

    public Advisor findById(long id) {
        return em.find(Advisor.class, id);
    }

    public List<Advisor> getAll() {
        return em.createQuery("Select table from Advisor table", Advisor.class).getResultList();
    }

    @Transactional
    public void delete(Advisor source){
        em.remove(source);
    }
}
