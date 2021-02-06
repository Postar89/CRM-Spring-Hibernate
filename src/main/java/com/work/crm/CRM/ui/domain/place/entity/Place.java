package com.work.crm.CRM.ui.domain.place.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "PLACE")
public class Place {
    @Id
    @GeneratedValue(generator = "idPlaceSequence")
    @SequenceGenerator(schema = "CRM", name = "idPlaceSequence", sequenceName = "CRM_PLACE_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private int id;
    @NotBlank
    @Column(name = "ADDRES_ID")
    private int addressId;
    @NotBlank
    @Column(name = "NAME")
    private String name;

    int getAddressId() {
        return addressId;
    }

    void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
