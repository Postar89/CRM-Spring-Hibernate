package com.work.crm.CRM.domain.city.controler;

import com.work.crm.CRM.domain.address.entity.Address;
import com.work.crm.CRM.domain.city.entity.City;
import com.work.crm.CRM.domain.city.entity.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityControler {

    private static final Logger logger = LoggerFactory.getLogger(CityControler.class);
    private final CityRepository cityRepository;


    public CityControler(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping(value = "/cities", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<City>> readAllCities() {
        logger.warn("Exposing all the cities");
        return ResponseEntity.ok(cityRepository.findAll());
    }

    @GetMapping("/cities")
    ResponseEntity<List<City>> readAllCities(Pageable page){
        logger.info("Read Page");
        return ResponseEntity.ok(cityRepository.findAll(page).getContent());
    }

    @PostMapping(path = "/cities")
    ResponseEntity<?> saveCity(@RequestBody City city)
    {
        logger.warn("Saving city");
        return  ResponseEntity.ok(cityRepository.save(city));
    }

    @PutMapping(path = "/cities/{id}")
    ResponseEntity<?> updateCity(@PathVariable long id, @RequestBody City toUpdate)
    {
        if (cityRepository.existsById(id)) {
            cityRepository.save(toUpdate);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

//    @PostMapping(path = "/cities")
//    ResponseEntity<List<City>> saveCities(@RequestBody List<City> cities)
//    {
//        logger.warn("Remove Cities");
//        return ResponseEntity.ok(cityRepository.saveAll(cities));
//    }
}
