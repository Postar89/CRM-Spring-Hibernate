package com.work.crm.CRM.domain.advisor.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface AdvisorRepository {
    List<Advisor> findAll();
    Page<Advisor> findAll(Pageable page);
    Optional<Advisor> findById(Integer i);
    boolean existsById(Integer id);
    Advisor save(Advisor entity);
}
