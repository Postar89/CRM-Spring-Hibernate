package com.work.crm.CRM.domain.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    
    @Autowired
    ProductRepository repository;

    public void createNew(Product source)
    {
        repository.create(source);
    }

    public List<Product> getAll()
    {
        return repository.getAll();
    }

    public Product getWithId(long id)
    {
        return repository.findById(id);
    }

    public void update(long id, Product source) {
        Product existing = repository.findById(id);
        if (existing == null){
            repository.create(source);
        }else{
            source.setId(existing.getId());
            repository.update(source);
        }
    }

    public void delete(long id)
    {
        Product source = repository.findById(id);
        repository.delete(source);
    }
}
