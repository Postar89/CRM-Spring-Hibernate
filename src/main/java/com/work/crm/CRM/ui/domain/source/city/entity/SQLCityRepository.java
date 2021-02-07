package com.work.crm.CRM.ui.domain.source.city.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLCityRepository extends CityRepository, JpaRepository<City,Integer> {

//    @Query
//    List<City> saveAll(List<City> entities);

}
