package com.work.crm.CRM.domain.person.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void create(Person person) {
        em.persist(person);
    }

    @Transactional
    public void update(Person person) {
        em.merge(person);
    }

    public Person findById(long personId) {
        return em.find(Person.class, personId);
    }

    public List<Person> getAll() {
        return em.createQuery("Select person from Person person", Person.class).getResultList();
    }

    public List<Person> getAllWithNameAndSurname(String name, String surname) {
        String sql = "SELECT person from Person person WHERE person.name = '"+name+"' AND person.surname = '"+surname +"'";
        return em.createQuery(sql, Person.class).getResultList();
    }

    public Person getPerson(String name, String surname, String idNumber, String docType, String docNumber) {
        String sql = "SELECT person from Person person WHERE person.name = '"+name+
                "' AND person.surname = '"+surname +
                "' AND person.idNumber = '"+idNumber +
                "' AND person.docType = '"+docType +
                "' AND person.docNumber = '"+docNumber + "'";
        return em.createQuery(sql, Person.class).getSingleResult();
    }

    @Transactional
    public void delete(Person person){
        em.remove(person);
    }
}
