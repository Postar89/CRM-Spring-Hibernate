package com.work.crm.CRM.domain.person.controler;

import com.work.crm.CRM.domain.person.entity.Person;
import com.work.crm.CRM.domain.person.entity.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
@CrossOrigin("http://localhost:3000")
public class PersonControler {

    @Autowired
    PersonService personService;

    @GetMapping
    public List<Person> getAll()
    {
        return this.personService.getAll();
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable long id){
        return this.personService.getWithId(id);
    }

    @PostMapping
    public void createPerson(@RequestBody Person person){
        this.personService.createNewPerson(person);
    }

    @GetMapping("/{name}/{surname}")
    public List<Person> getAllWithNameAndSurname(@PathVariable String name, @PathVariable String surname){
        return this.personService.getPersonWithNameAndSurname(name,surname);
    }

    @GetMapping("/{name}/{surname}/{idNumber}/{docType}/{docNumber}")
    public Person getPerson(@PathVariable String name, @PathVariable String surname, @PathVariable String idNumber, @PathVariable String docType,
                                  @PathVariable String docNumber){
        return this.personService.getPerson(name,surname,idNumber,docType,docNumber);
    }

    @PutMapping("/{id}")
    public void updatePerson(@PathVariable long id, @RequestBody Person person)
    {
        this.personService.updatePerson(id, person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable long id)
    {
        this.personService.delete(id);
    }
}
