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
    @NotNull
    @JoinColumn(name = "ADDRESS_ID", foreignKey = @ForeignKey(name="FK_RAP_ADDRESS"))
    private long addressId;
    @NotNull
    @Column(name = "IS_MAIN")
    private char isMain;
    @NotNull
    @JoinColumn(name = "PERSON_ID", foreignKey = @ForeignKey(name="FK_RAP_PERSON"))
    private long personId;

    public RLTAddressPerson(long addressId, char isMain,long personId)
    {
        this.addressId = addressId;
        this.isMain = isMain;
        this.personId = personId;
    }

    public RLTAddressPerson() {

    }

    long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public void setIsMain(char isMain) {
        this.isMain = isMain;
    }

    public char isMain() {
        return isMain;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }
}
