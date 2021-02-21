package com.work.crm.CRM.domain.product.controler;

import com.work.crm.CRM.domain.product.entity.Product;
import com.work.crm.CRM.domain.product.entity.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductControler {
    public static final Logger logger = LoggerFactory.getLogger(ProductControler.class);
    public final ProductRepository productRepository;

    public ProductControler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(value = "/Products", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Product>> readAllProducts() {
        logger.warn("Exposing all the Products");
        return ResponseEntity.ok(productRepository.findAll());
    }

    @GetMapping("/Products")
    ResponseEntity<List<Product>> readAllProducts(Pageable page){
        logger.info("Read Page");
        return ResponseEntity.ok(productRepository.findAll(page).getContent());
    }

    @PostMapping(path = "/Products")
    ResponseEntity<?> saveProduct(@RequestBody Product product)
    {
        logger.warn("Saving Product");
        return  ResponseEntity.ok(productRepository.save(product));
    }

    @PutMapping(path = "/Products/{id}")
    ResponseEntity<?> updateProduct(@PathVariable long id, @RequestBody Product toUpdate)
    {
        if (productRepository.existsById(id)) {
            productRepository.save(toUpdate);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
