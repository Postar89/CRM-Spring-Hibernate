package com.work.crm.CRM.domain.person.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    List<Person> findAll();
    Page<Person> findAll(Pageable page);
    Optional<Person> findById(Integer i);
    boolean existsById(Integer id);
    Person save(Person entity);
//    List<Person> saveAll(List<Person> entities);
}
