package com.work.crm.CRM.domain.place.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PlaceRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void create(Place source)
    {
        em.persist(source);
    }

    @Transactional
    public void update(Place source) {
        em.merge(source);
    }

    public Place findById(long id) {
        return em.find(Place.class, id);
    }

    public List<Place> getAll() {
        return em.createQuery("Select table from Place table", Place.class).getResultList();
    }

    @Transactional
    public void delete(Place source){
        em.remove(source);
    }
}

