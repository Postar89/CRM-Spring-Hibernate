package com.work.crm.CRM.ui.entity.address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
interface SQLAddressRepository extends AddressRepository, JpaRepository<Address,Integer> {




}
