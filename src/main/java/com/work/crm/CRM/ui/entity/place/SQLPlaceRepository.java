package com.work.crm.CRM.ui.entity.place;

import com.work.crm.CRM.ui.entity.rltAddressPerson.RLTAddressPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
interface SQLPlaceRepository extends PlaceRepository, JpaRepository<Place,Integer> {

}
