package com.work.crm.CRM.ui.domain.source.rltAddressPerson.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLRTLAddressPersonRepository extends RLTAddressPersonRepository, JpaRepository<RLTAddressPerson,Integer> {

}
