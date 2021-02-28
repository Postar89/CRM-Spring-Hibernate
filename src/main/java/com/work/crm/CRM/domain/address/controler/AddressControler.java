package com.work.crm.CRM.domain.address.controler;

import com.work.crm.CRM.domain.address.entity.Address;
import com.work.crm.CRM.domain.address.entity.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class AddressControler {

    @Autowired
    AddressService service;

    @GetMapping("/address")
    public List<Address> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping("/address/{id}")
    public Address getAddress(@PathVariable long id)
    {
        return this.service.getWithId(id);
    }

    @PostMapping("/address")
    public void createAddress(@RequestBody Address source)
    {
        this.service.createNewAddress(source);
    }

    @PutMapping("/address/{id}")
    public void updateAddress(@PathVariable long id, @RequestBody Address source)
    {
        this.service.updateAddress(id, source);
    }

    @DeleteMapping("/address/{id}")
    public void deleteAddress(@PathVariable long id)
    {
        this.service.delete(id);
    }
}
