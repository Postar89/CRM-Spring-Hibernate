package com.work.crm.CRM.logic.client;

import com.work.crm.CRM.domain.address.entity.Address;
import com.work.crm.CRM.domain.city.entity.City;
import com.work.crm.CRM.domain.country.entity.Country;
import com.work.crm.CRM.domain.person.entity.Person;
import com.work.crm.CRM.domain.rltAddressPerson.entity.RLTAddressPerson;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.Set;

public class ClientReadModel {
    //Person
    private String name;
    private String surname;
    private String docNumber;
    private String docType;
    private long idNumber;
    //Addres
    private long cityId;
        //City
    private String city;
    private long countryId;
        //Country
    private String country;
    private String houseNb;
    private String passCode;
    private String street;
    private String floatNb;
    //RLTAddressPerson
    private long personId;
    private char isMain;
    private long addressId;


    private Set<GroupPersonReadModel> persons;
    private Set<GroupAddressReadModel> adresses;
    private Set<GroupCityReadModel> cities;
    private Set<GroupCountryReadModel> countres;
    private Set<GroupRTLReadModel> rlt;

    public ClientReadModel(Person person, Address address, City citySource, Country countrySource, RLTAddressPerson rltAddressPerson){
        name = person.getName();
        surname = person.getSurname();
        docNumber = person.getDocNumber();
        docType = person.getDocType();
        idNumber = person.getIdNumber();
        //Addres
        cityId = address.getCityId();
        //City
        city = citySource.getCity();
        countryId = address.getCountryId();
        //Country
        country = countrySource.getCity();
        houseNb = address.getHouseNb();
        passCode = address.getPassCode();
        street = address.getStreet();
        floatNb = address.getFloatNb();
        //RLTAddressPerson
        personId = rltAddressPerson.getPersonId();
        isMain = rltAddressPerson.isMain();
        addressId = rltAddressPerson.getAddressId();

    }

}
