package com.work.crm.CRM.ui.entity.city;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "CITY")
public class City {
    @Id
    @GeneratedValue(generator = "idCitySequence")
    @SequenceGenerator(schema = "CRM", name = "idCitySequence", sequenceName = "CRM_CITY_INCREMENT", initialValue = 1, allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @NotBlank
    @Column(name = "CITY")
    private String city;

    String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }
}
