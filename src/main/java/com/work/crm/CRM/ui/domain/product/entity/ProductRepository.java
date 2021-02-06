package com.work.crm.CRM.ui.domain.product.entity;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
    Optional<Product> findById(Integer i);
    boolean existsById(Integer id);
    Product save(Product entity);
//    List<Product> saveAll(List<Product> entities);
}
