package com.work.crm.CRM.ui.domain.source.rltAddressPerson.entity;

import java.util.List;
import java.util.Optional;

public interface RLTAddressPersonRepository {
    List<RLTAddressPerson> findAll();
    Optional<RLTAddressPerson> findById(Integer i);
    boolean existsById(Integer id);
    RLTAddressPerson save(RLTAddressPerson entity);
//    List<RLTAddressPerson> saveAll(List<RLTAddressPerson> entities);

}
