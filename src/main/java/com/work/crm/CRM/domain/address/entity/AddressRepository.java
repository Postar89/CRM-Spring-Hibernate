package com.work.crm.CRM.domain.address.entity;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AddressRepository {
    List<Address> findAll();
    Page<Address> findAll(Pageable page);
    Optional<Address> findById(Integer i);
    boolean existsById(Integer id);
    Address save(Address entity);

}
