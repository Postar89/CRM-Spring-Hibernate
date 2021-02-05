package com.work.crm.CRM.ui.entity.person;

import com.work.crm.CRM.ui.entity.rltAddressPerson.RLTAddressPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
interface SQLPersonRepository extends PersonRepository, JpaRepository<Person, Integer> {

}
