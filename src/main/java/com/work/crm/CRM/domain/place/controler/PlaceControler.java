package com.work.crm.CRM.domain.place.controler;

import com.work.crm.CRM.domain.place.entity.Place;
import com.work.crm.CRM.domain.place.entity.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/place")
@CrossOrigin("http://localhost:3000")
public class PlaceControler {

    @Autowired
    PlaceService service;


    @GetMapping
    public List<Place> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Place getPlace(@PathVariable long id)
    {
        return this.service.getWithId(id);
    }

    @PostMapping
    public void createPlace(@RequestBody Place source)
    {
        this.service.createNew(source);
    }

    @PutMapping("/{id}")
    public void updatePlace(@PathVariable long id, @RequestBody Place source)
    {
        this.service.update(id, source);
    }

    @DeleteMapping("/{id}")
    public void deletePlace(@PathVariable long id)
    {
        this.service.delete(id);
    }
}
