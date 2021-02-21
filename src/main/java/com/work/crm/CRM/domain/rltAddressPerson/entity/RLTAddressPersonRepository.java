package com.work.crm.CRM.domain.rltAddressPerson.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface RLTAddressPersonRepository {
    List<RLTAddressPerson> findAll();
    Page<RLTAddressPerson> findAll(Pageable page);
    Optional<RLTAddressPerson> findById(Integer i);
    boolean existsById(Integer id);
    RLTAddressPerson save(RLTAddressPerson entity);
//    List<RLTAddressPerson> saveAll(List<RLTAddressPerson> entities);

}
