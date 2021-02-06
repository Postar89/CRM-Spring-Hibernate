package com.work.crm.CRM.ui.domain.advisor.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLAdvisorRepository extends AdvisorRepository, JpaRepository<Advisor, Integer> {


}