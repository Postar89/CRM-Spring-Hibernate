package com.work.crm.CRM.domain.address.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="ADDRESS")
public class Address {

    @Id
    @GeneratedValue(generator = "idAddressSequence")
    @SequenceGenerator(schema = "CRM", name = "idAddressSequence", sequenceName = "CRM_ADDRESS_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name="ID")
    private int id;
    @NotBlank
    @OneToMany
    @Column(name="CITY_ID")
    private int cityId;
    @NotBlank
    @OneToMany
    @Column(name="COUNTRY_ID")
    private int countryId;
    @NotBlank
    @Column(name="HOUSE_NB")
    private String houseNb;
    @NotBlank
    @Column(name="PASS_CODE")
    private String passCode;
    @NotBlank
    @Column(name="STREET")
    private String street;
    @Column(name="FLOAT_NB")
    private String floatNb;

    int getCityId() {
        return cityId;
    }

    void setCityId(int cityId) {
        this.cityId = cityId;
    }

    int getCountryId() {
        return countryId;
    }

    void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    String getFloatNb() {
        return floatNb;
    }

    void setFloatNb(String floatNb) {
        this.floatNb = floatNb;
    }

    String getHouseNb() {
        return houseNb;
    }

    void setHouseNb(String houseNb) {
        this.houseNb = houseNb;
    }

    String getPassCode() {
        return passCode;
    }

    void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    String getStreet() {
        return street;
    }

    void setStreet(String street) {
        this.street = street;
    }
}
