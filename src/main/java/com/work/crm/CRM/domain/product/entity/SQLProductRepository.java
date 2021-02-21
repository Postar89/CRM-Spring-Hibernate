package com.work.crm.CRM.domain.product.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLProductRepository extends ProductRepository, JpaRepository<Product,String> {

}
