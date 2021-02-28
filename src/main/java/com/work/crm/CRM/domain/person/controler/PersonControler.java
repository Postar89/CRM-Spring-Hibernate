package com.work.crm.CRM.domain.person.controler;

import com.work.crm.CRM.domain.person.entity.Person;
import com.work.crm.CRM.domain.person.entity.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class PersonControler {

    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public List<Person> getAll()
    {
        return this.personService.getAll();
    }

    @GetMapping("/persons/{id}")
    public Person getPerson(@PathVariable long id){
        return this.personService.getWithId(id);
    }

    @PostMapping("/persons")
    public void createPerson(@RequestBody Person person){
        this.personService.createNewPerson(person);
    }

    @PutMapping("/persons/{id}")
    public void updatePerson(@PathVariable long id, @RequestBody Person person)
    {
        this.personService.updatePerson(id, person);
    }

    @DeleteMapping("/persons/{id}")
    public void deletePerson(@PathVariable long id)
    {
        this.personService.delete(id);
    }
}
