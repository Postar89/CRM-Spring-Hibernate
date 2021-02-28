package com.work.crm.CRM.domain.address.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {

    @Autowired
    AddressRepository repository;

    public void createNewAddress(Address source)
    {
        repository.create(source);
    }

    public List<Address> getAll()
    {
        return repository.getAll();
    }

    public Address getWithId(long id)
    {
        return repository.findById(id);
    }

    public void updateAddress(long id, Address source) {
        Address existing = repository.findById(id);
        if (existing == null){
            repository.create(source);
        }else{
            source.setId(existing.getId());
            repository.update(source);
        }
    }

    public void delete(long id)
    {
        Address source = repository.findById(id);
        repository.delete(source);
    }
}
