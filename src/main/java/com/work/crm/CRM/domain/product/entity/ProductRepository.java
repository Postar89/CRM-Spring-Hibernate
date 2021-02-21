package com.work.crm.CRM.domain.product.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
    Page<Product> findAll(Pageable page);
    Optional<Product> findById(Integer i);
    boolean existsById(Integer id);
    Product save(Product entity);
//    List<Product> saveAll(List<Product> entities);
}
