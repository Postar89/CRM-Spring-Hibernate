package com.work.crm.CRM.ui.domain.source.city.controler;

import com.work.crm.CRM.ui.domain.source.city.entity.City;
import com.work.crm.CRM.ui.domain.source.city.entity.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityControler {

    private static final Logger logger = LoggerFactory.getLogger(CityControler.class);
    private final CityRepository cityRepository;


    public CityControler(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping(value = "/cities", params = {"!sort","!page","!size"})
    ResponseEntity<List<City>> readAllCities()
    {
        logger.warn("Exposing all the cities");
        return ResponseEntity.ok(cityRepository.findAll());
    }

    @GetMapping("/cities")
    ResponseEntity<List<City>> readAllCities(Pageable page){
        logger.info("Read page of Cities");
        return ResponseEntity.ok(cityRepository.findAll(page).getContent());
    }

    @PostMapping(value = "/city")
    ResponseEntity<City> saveCity(@RequestBody City city)
    {
        logger.warn("Save City");
        return ResponseEntity.ok(cityRepository.save(city));
    }

//    @PostMapping(path = "/cities")
//    ResponseEntity<List<City>> saveCities(@RequestBody List<City> cities)
//    {
//        logger.warn("Remove Cities");
//        return ResponseEntity.ok(cityRepository.saveAll(cities));
//    }
}
