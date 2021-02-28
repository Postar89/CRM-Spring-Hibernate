package com.work.crm.CRM.domain.city.entity;

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
    private long id;
    @NotBlank
    @Column(name = "CITY")
    private String city;


    public City(String city)
    {
        this.city = city;
    }

    public City() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
