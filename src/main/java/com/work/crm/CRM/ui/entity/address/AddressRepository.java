package com.work.crm.CRM.ui.entity.address;

import java.util.List;
import java.util.Optional;

public interface AddressRepository {
    List<Address> findAll();
    Optional<Address> findById(Integer i);
    boolean existsById(Integer id);
    Address save(Address entity);
    List<Address> saveAll(List<Address> entities);
}
