package com.work.crm.CRM.ui.domain.city.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(generator = "idCitySequence")
    @SequenceGenerator(schema = "CRM", name = "idCitySequence", sequenceName = "CRM_CITY_INCREMENT_2", initialValue = 1, allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @NotBlank
    @Column(name = "CITY")
    private String city;

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }
}
