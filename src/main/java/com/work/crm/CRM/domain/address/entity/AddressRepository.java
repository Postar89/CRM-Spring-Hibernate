package com.work.crm.CRM.domain.address.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class AddressRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void create(Address source)
    {
        em.persist(source);
    }

    @Transactional
    public void update(Address source) {
        em.merge(source);
    }

    public Address findById(long addressId) {
        return em.find(Address.class, addressId);
    }

    public List<Address> getAll() {
        return em.createQuery("Select table from Address table", Address.class).getResultList();
    }

    @Transactional
    public void delete(Address source){
        em.remove(source);
    }
}
