package com.work.crm.CRM.ui.domain.source.product.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLProductRepository extends ProductRepository, JpaRepository<Product,String> {

}
