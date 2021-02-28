package com.work.crm.CRM.domain.city.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CityRepository {
    @PersistenceContext
    EntityManager em;

    @Transactional
    public void create(City source)
    {
        em.persist(source);
    }

    @Transactional
    public void update(City source) {
        em.merge(source);
    }

    public City findById(long id) {
        return em.find(City.class, id);
    }

    public List<City> getAll() {
        return em.createQuery("Select table from City table", City.class).getResultList();
    }

    @Transactional
    public void delete(City source){
        em.remove(source);
    }
}
