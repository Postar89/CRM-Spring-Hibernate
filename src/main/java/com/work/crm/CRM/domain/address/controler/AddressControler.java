package com.work.crm.CRM.domain.address.controler;

import com.work.crm.CRM.domain.address.entity.Address;
import com.work.crm.CRM.domain.address.entity.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressControler {

    @Autowired
    AddressService service;

    @GetMapping
    public List<Address> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Address getAddress(@PathVariable long id)
    {
        return this.service.getWithId(id);
    }

    @PostMapping
    public void createAddress(@RequestBody Address source)
    {
        this.service.createNew(source);
    }

    @PutMapping("/{id}")
    public void updateAddress(@PathVariable long id, @RequestBody Address source)
    {
        this.service.updateAddress(id, source);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable long id)
    {
        this.service.delete(id);
    }
}
