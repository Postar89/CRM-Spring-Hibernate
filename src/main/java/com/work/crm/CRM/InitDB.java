package com.work.crm.CRM;

import com.work.crm.CRM.domain.person.entity.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class InitDB implements CommandLineRunner {

    @Autowired
    PersonService personService;
    @Override
    public void run(String... args) throws Exception{

    }
}
