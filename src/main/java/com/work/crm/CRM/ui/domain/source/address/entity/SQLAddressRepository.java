package com.work.crm.CRM.ui.domain.source.address.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLAddressRepository extends AddressRepository, JpaRepository<Address,Integer> {




}
