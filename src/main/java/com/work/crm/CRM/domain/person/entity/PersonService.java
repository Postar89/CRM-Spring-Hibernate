package com.work.crm.CRM.domain.person.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepositoryEntity;

    public void createNewPerson(Person person) {
        personRepositoryEntity.create(person);
    }

    public List<Person> getAll() {
        return personRepositoryEntity.getAll();
    }

    public Person getWithId(long id) {
        return personRepositoryEntity.findById(id);
    }

    public void updatePerson(long id, Person person) {
        Person existing = personRepositoryEntity.findById(id);
        if (existing == null) {
            personRepositoryEntity.create(person);
        } else {
            person.setId(existing.getId());
            personRepositoryEntity.update(person);
        }
    }

    public List<Person> getPersonWithNameAndSurname(String name, String surname)
    {
        return personRepositoryEntity.getAllWithNameAndSurname(name,surname);
    }

    public Person getPerson(String name, String surname,String idNumber, String docType, String docNumber)
    {
        return personRepositoryEntity.getPerson(name,surname,idNumber,docType,docNumber);
    }

    public void delete(long id)
    {
        Person person = personRepositoryEntity.findById(id);
        personRepositoryEntity.delete(person);
    }

}
