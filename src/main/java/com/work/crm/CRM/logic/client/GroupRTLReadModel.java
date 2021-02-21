package com.work.crm.CRM.logic.client;


import com.work.crm.CRM.domain.rltAddressPerson.entity.RLTAddressPerson;

public class GroupRTLReadModel {

    private long addressId;
    private char isMain;
    private long personId;

    public GroupRTLReadModel(RLTAddressPerson source)
    {
        addressId = source.getAddressId();
        isMain = source.isMain();
        personId = source.getPersonId();
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public char getIsMain() {
        return isMain;
    }

    public void setIsMain(char isMain) {
        this.isMain = isMain;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }
}
