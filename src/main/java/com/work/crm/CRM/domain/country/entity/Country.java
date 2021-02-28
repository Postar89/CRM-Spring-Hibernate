package com.work.crm.CRM.domain.country.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "COUNTRY")
public class Country {
    @Id

    @GeneratedValue(generator = "idCountrySequence")
    @SequenceGenerator(schema = "CRM", name = "idCountrySequence", sequenceName = "CRM_COUNTRY_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private long id;
    @NotBlank
    @Column(name = "COUNTRY")
    private String country;

    public Country(String country)
    {
        this.country=country;
    }

    public Country() {

    }

    long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
