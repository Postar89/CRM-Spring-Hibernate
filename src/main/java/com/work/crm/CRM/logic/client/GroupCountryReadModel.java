package com.work.crm.CRM.logic.client;

import com.work.crm.CRM.domain.country.entity.Country;

public class GroupCountryReadModel {

    private String country;

    public GroupCountryReadModel(Country source)
    {
        country = source.getCity();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
