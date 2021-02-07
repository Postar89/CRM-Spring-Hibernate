package com.work.crm.CRM.ui.domain.source.person.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLPersonRepository extends PersonRepository, JpaRepository<Person, Integer> {

}