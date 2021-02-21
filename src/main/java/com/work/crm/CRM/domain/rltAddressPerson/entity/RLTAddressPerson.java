package com.work.crm.CRM.domain.rltAddressPerson.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "RLT_ADDRES_PERSON")
public class RLTAddressPerson {
    @Id
    @GeneratedValue(generator = "idRAPSequence")
    @SequenceGenerator(schema = "CRM", name = "idRAPSequence", sequenceName = "CRM_RAP_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private long id;
    @NotBlank

    @Column(name = "ADDRESS_ID")
    private long addressId;
    @NotBlank
    @Column(name = "IS_MAIN")
    private char isMain;
    @NotBlank

    @Column(name = "PERSON_ID")
    private long personId;

    long getId() {
        return id;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public char isMain() {
        return isMain;
    }

    public void setMain(char main) {
        isMain = main;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }
}
