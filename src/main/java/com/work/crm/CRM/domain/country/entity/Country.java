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
    private String city;

    long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
