package com.work.crm.CRM.domain.product.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ProductRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void create(Product source)
    {
        em.persist(source);
    }

    @Transactional
    public void update(Product source) {
        em.merge(source);
    }

    public Product findById(long id) {
        return em.find(Product.class, id);
    }

    public List<Product> getAll() {
        return em.createQuery("Select table from Product table", Product.class).getResultList();
    }

    @Transactional
    public void delete(Product source){
        em.remove(source);
    }
}
