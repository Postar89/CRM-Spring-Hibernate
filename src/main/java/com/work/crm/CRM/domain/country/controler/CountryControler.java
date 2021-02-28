package com.work.crm.CRM.domain.country.controler;


import com.work.crm.CRM.domain.country.entity.Country;
import com.work.crm.CRM.domain.country.entity.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/country")
@CrossOrigin("http://localhost:3000")
public class CountryControler {

    @Autowired
    CountryService service;

    @GetMapping
    public List<Country> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Country getCountry(@PathVariable long id)
    {
        return this.service.getWithId(id);
    }

    @PostMapping
    public void createCountry(@RequestBody Country source)
    {
        this.service.createNew(source);
    }

    @PutMapping("/{id}")
    public void updateCountry(@PathVariable long id, @RequestBody Country source)
    {
        this.service.update(id, source);
    }

    @DeleteMapping("/{id}")
    public void deleteCountry(@PathVariable long id)
    {
        this.service.delete(id);
    }
}
