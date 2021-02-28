package com.work.crm.CRM.domain.rltAddressPerson.controler;

import com.work.crm.CRM.domain.rltAddressPerson.entity.RLTAddressPerson;
import com.work.crm.CRM.domain.rltAddressPerson.entity.RLTAddressPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rlt")
@CrossOrigin("http://localhost:3000")
public class RLTAddressPersonControler {

    @Autowired
    RLTAddressPersonService service;

    @GetMapping
    public List<RLTAddressPerson> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public RLTAddressPerson getRLTAddressPerson(@PathVariable long id)
    {
        return this.service.getWithId(id);
    }

    @PostMapping
    public void createRLTAddressPerson(@RequestBody RLTAddressPerson source)
    {
        this.service.createNew(source);
    }

    @PutMapping("/{id}")
    public void updateRLTAddressPerson(@PathVariable long id, @RequestBody RLTAddressPerson source)
    {
        this.service.update(id, source);
    }

    @DeleteMapping("/{id}")
    public void deleteRLTAddressPerson(@PathVariable long id)
    {
        this.service.delete(id);
    }
}
