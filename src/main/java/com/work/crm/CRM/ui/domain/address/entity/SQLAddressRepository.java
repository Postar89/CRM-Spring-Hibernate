package com.work.crm.CRM.ui.domain.address.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SQLAddressRepository extends AddressRepository, JpaRepository<Address,Integer> {




}
