package com.work.crm.CRM.domain.place.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "PLACE")
public class Place {
    @Id
    @GeneratedValue(generator = "idPlaceSequence")
    @SequenceGenerator(schema = "CRM", name = "idPlaceSequence", sequenceName = "CRM_PLACE_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private long id;
    @NotBlank

    @Column(name = "ADDRES_ID")
    private long addressId;
    @NotBlank
    @Column(name = "NAME")
    private String name;

    long getAddressId() {
        return addressId;
    }

    void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
