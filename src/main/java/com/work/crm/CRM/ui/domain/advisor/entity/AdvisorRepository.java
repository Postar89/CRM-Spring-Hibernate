package com.work.crm.CRM.ui.domain.advisor.entity;

import java.util.List;
import java.util.Optional;

public interface AdvisorRepository {
    List<Advisor> findAll();
    Optional<Advisor> findById(Integer i);
    boolean existsById(Integer id);
    Advisor save(Advisor entity);
//    List<Advisor> saveAll(List<Advisor> entities);
}
