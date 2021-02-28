package com.work.crm.CRM.domain.product.controler;

import com.work.crm.CRM.domain.product.entity.Product;
import com.work.crm.CRM.domain.product.entity.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/product")
@CrossOrigin("http://localhost:3000")
public class ProductControler {
    
    @Autowired
    ProductService service;


    @GetMapping
    public List<Product> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable long id)
    {
        return this.service.getWithId(id);
    }

    @PostMapping
    public void createProduct(@RequestBody Product source)
    {
        this.service.createNew(source);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable long id, @RequestBody Product source)
    {
        this.service.update(id, source);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id)
    {
        this.service.delete(id);
    }
    
}
