package com.work.crm.CRM.ui.domain.source.country.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLCountryRepository extends CountryRepository, JpaRepository<Country,Integer> {


}
