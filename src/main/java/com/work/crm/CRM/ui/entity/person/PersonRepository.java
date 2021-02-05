package com.work.crm.CRM.ui.entity.person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    List<Person> findAll();
    Optional<Person> findById(Integer i);
    Person save(Person entity);
    List<Person> saveAll(List<Person> entities);
}
