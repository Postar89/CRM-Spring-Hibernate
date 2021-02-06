package com.work.crm.CRM.ui.domain.city.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SQLCityRepository extends CityRepository, JpaRepository<City,Integer> {

//    @Query
//    List<City> saveAll(List<City> entities);

}
