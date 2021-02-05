package com.work.crm.CRM.ui.entity.rltAddressPerson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
interface SQLRTLAddressPersonRepository extends RLTAddressPersonRepository, JpaRepository<RLTAddressPerson,Integer> {

}
