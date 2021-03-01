package com.work.crm.CRM;

import com.work.crm.CRM.domain.address.entity.AddressService;
import com.work.crm.CRM.domain.advisor.entity.Advisor;
import com.work.crm.CRM.domain.advisor.entity.AdvisorService;
import com.work.crm.CRM.domain.city.entity.CityService;
import com.work.crm.CRM.domain.country.entity.CountryService;
import com.work.crm.CRM.domain.meeting.entity.MeetingService;
import com.work.crm.CRM.domain.person.entity.PersonService;
import com.work.crm.CRM.domain.place.entity.PlaceService;
import com.work.crm.CRM.domain.product.entity.ProductService;
import com.work.crm.CRM.domain.rltAddressPerson.entity.RLTAddressPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class InitDB implements CommandLineRunner {

    @Autowired
    AddressService addressService;
    @Autowired
    AdvisorService advisorService;
    @Autowired
    CityService cityService;
    @Autowired
    CountryService countryService;
    @Autowired
    MeetingService meetingService;
    @Autowired
    PersonService personService;
    @Autowired
    PlaceService placeService;
    @Autowired
    ProductService productService;
    @Autowired
    RLTAddressPersonService rltAddressPersonService;

    @Override
    public void run(String... args) throws Exception{



    }
}
