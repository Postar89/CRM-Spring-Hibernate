package com.work.crm.CRM.ui.domain.country.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "COUNTRY")
public class Country {
    @Id
    @GeneratedValue(generator = "idCountrySequence")
    @SequenceGenerator(schema = "CRM", name = "idCountrySequence", sequenceName = "CRM_COUNTRY_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private int id;
    @NotBlank
    @Column(name = "COUNTRY")
    private String city;

    String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }
}
