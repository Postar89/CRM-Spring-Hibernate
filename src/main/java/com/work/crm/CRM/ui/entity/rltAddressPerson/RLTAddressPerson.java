package com.work.crm.CRM.ui.entity.rltAddressPerson;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "RLT_ADDRES_PERSON")
public class RLTAddressPerson {
    @Id
    @GeneratedValue(generator = "idRAPSequence")
    @SequenceGenerator(schema = "CRM", name = "idRAPSequence", sequenceName = "CRM_RAP_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private int id;
    @NotBlank
    @Column(name = "ADDRESS_ID")
    private int addressId;
    @NotBlank
    @Column(name = "IS_MAIN")
    private boolean isMain;
    @NotBlank
    @Column(name = "PERSON_ID")
    private int personId;

    int getAddressId() {
        return addressId;
    }

    void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    boolean isMain() {
        return isMain;
    }

    void setMain(boolean main) {
        isMain = main;
    }

    int getPersonId() {
        return personId;
    }

    void setPersonId(int personId) {
        this.personId = personId;
    }
}
