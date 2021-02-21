package com.work.crm.CRM.logic.client;

import com.work.crm.CRM.domain.address.entity.Address;

public class GroupAddressReadModel {
    private long cityId;
    private long countryId;
    private String houseNb;
    private String passCode;
    private String street;
    private String floatNb;

    public GroupAddressReadModel(Address source)
    {
        cityId = source.getCityId();
        countryId = source.getCountryId();
        houseNb = source.getHouseNb();
        passCode = source.getPassCode();
        street = source.getStreet();
        floatNb = source.getFloatNb();
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getHouseNb() {
        return houseNb;
    }

    public void setHouseNb(String houseNb) {
        this.houseNb = houseNb;
    }

    public String getPassCode() {
        return passCode;
    }

    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFloatNb() {
        return floatNb;
    }

    public void setFloatNb(String floatNb) {
        this.floatNb = floatNb;
    }
}
