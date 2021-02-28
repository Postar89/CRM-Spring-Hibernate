package com.work.crm.CRM.domain.country.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CountryRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void create(Country source)
    {
        em.persist(source);
    }

    @Transactional
    public void update(Country source) {
        em.merge(source);
    }

    public Country findById(long id) {
        return em.find(Country.class, id);
    }

    public List<Country> getAll() {
        return em.createQuery("Select table from Country table", Country.class).getResultList();
    }

    @Transactional
    public void delete(Country source){
        em.remove(source);
    }
    
}
