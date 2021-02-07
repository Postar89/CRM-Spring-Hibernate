package com.work.crm.CRM.ui.domain.source.place.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLPlaceRepository extends PlaceRepository, JpaRepository<Place,Integer> {

}
