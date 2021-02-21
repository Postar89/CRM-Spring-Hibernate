package com.work.crm.CRM.logic.client;

import com.work.crm.CRM.domain.city.entity.City;

public class GroupCityReadModel {
    private String city;

    public GroupCityReadModel(City source)
    {
        city = source.getCity();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
