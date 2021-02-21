package com.work.crm.CRM.domain.country.controler;

import com.work.crm.CRM.domain.city.entity.City;
import com.work.crm.CRM.domain.country.entity.Country;
import com.work.crm.CRM.domain.country.entity.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CountryControler {

    private static final Logger logger = LoggerFactory.getLogger(CountryControler.class);
    private final CountryRepository countryRepository;

    public CountryControler(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping(value = "/countries", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Country>> readAllCountries() {
        logger.warn("Exposing all the countries");
        return ResponseEntity.ok(countryRepository.findAll());
    }

    @GetMapping("/countries")
    ResponseEntity<List<Country>> readAllCountries(Pageable page){
        logger.info("Read Page");
        return ResponseEntity.ok(countryRepository.findAll(page).getContent());
    }

    @PostMapping(path = "/countries")
    ResponseEntity<?> saveCountry(@RequestBody Country country)
    {
        logger.warn("Saving country");
        return  ResponseEntity.ok(countryRepository.save(country));
    }

    @PutMapping(path = "/countries/{id}")
    ResponseEntity<?> updateCountry(@PathVariable int id, @RequestBody Country toUpdate)
    {
        if (countryRepository.existsById(id)) {
            countryRepository.save(toUpdate);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
