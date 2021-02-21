package com.work.crm.CRM.domain.person.controler;

import com.work.crm.CRM.domain.meeting.entity.Meeting;
import com.work.crm.CRM.domain.person.entity.Person;
import com.work.crm.CRM.domain.person.entity.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PersonControler {
    private static final Logger logger = LoggerFactory.getLogger(PersonControler.class);
    private final PersonRepository personRepository;

    public PersonControler(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping(value = "/persons", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Person>> readAllMeetings() {
        logger.warn("Exposing all the persons");
        return ResponseEntity.ok(personRepository.findAll());
    }

    @GetMapping("/persons")
    ResponseEntity<List<Person>> readAllMeetings(Pageable page){
        logger.info("Read Page");
        return ResponseEntity.ok(personRepository.findAll(page).getContent());
    }

    @PostMapping(path = "/persons")
    ResponseEntity<?> saveCountry(@RequestBody Person person)
    {
        logger.warn("Saving person");
        return  ResponseEntity.ok(personRepository.save(person));
    }

    @PutMapping(path = "/persons/{id}")
    ResponseEntity<?> updateCountry(@PathVariable long id, @RequestBody Person toUpdate)
    {
        if (personRepository.existsById(id)) {
            personRepository.save(toUpdate);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
