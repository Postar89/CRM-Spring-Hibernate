package com.work.crm.CRM.domain.city.controler;


import com.work.crm.CRM.domain.city.entity.City;
import com.work.crm.CRM.domain.city.entity.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
@CrossOrigin("http://localhost:3000")
public class CityControler {

    @Autowired
    CityService service;

    @GetMapping
    public List<City> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public City getCity(@PathVariable long id)
    {
        return this.service.getWithId(id);
    }

    @PostMapping
    public void createCity(@RequestBody City source)
    {
        this.service.createNew(source);
    }

    @PutMapping("/{id}")
    public void updateCity(@PathVariable long id, @RequestBody City source)
    {
        this.service.update(id, source);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable long id)
    {
        this.service.delete(id);
    }
}
