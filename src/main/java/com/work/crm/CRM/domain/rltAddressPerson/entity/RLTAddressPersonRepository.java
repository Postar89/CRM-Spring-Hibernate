package com.work.crm.CRM.domain.rltAddressPerson.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class RLTAddressPersonRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void create(RLTAddressPerson source)
    {
        em.persist(source);
    }

    @Transactional
    public void update(RLTAddressPerson source) {
        em.merge(source);
    }

    public RLTAddressPerson findById(long id) {
        return em.find(RLTAddressPerson.class, id);
    }

    public List<RLTAddressPerson> getAll() {
        return em.createQuery("Select table from RLTAddressPerson table", RLTAddressPerson.class).getResultList();
    }

    @Transactional
    public void delete(RLTAddressPerson source){
        em.remove(source);
    }
}
