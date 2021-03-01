package com.work.crm.CRM.domain.address.entity;

import com.work.crm.CRM.domain.city.entity.City;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="ADDRESS")
public class Address {

    @Id
    @GeneratedValue(generator = "idAddressSequence")
    @SequenceGenerator(schema = "CRM", name = "idAddressSequence", sequenceName = "CRM_ADDRESS_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name="ID")
    private long id;
    @NotNull
    @JoinColumn(name="CITY_ID",foreignKey = @ForeignKey(name = "FK_ADDRESS_CITY"))
    private long cityId;
    @NotNull
    @JoinColumn(name="COUNTRY_ID",foreignKey = @ForeignKey(name = "FK_ADDRESS_COUNTRY"))
    private long countryId;
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

    public Address(){}

    public Address(long cityId, long countryId, String houseNb, String passCode, String street, String floatNb){
        this.cityId = cityId;
        this.countryId = countryId;
        this.houseNb = houseNb;
        this.passCode = passCode;
        this.street = street;
        this.floatNb = floatNb;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getFloatNb() {
        return floatNb;
    }

    public void setFloatNb(String floatNb) {
        this.floatNb = floatNb;
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
}
