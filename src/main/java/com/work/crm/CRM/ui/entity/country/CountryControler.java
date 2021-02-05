package com.work.crm.CRM.ui.entity.country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class CountryControler {

    private static final Logger logger = LoggerFactory.getLogger(CountryControler.class);
    private final CountryRepository countryRepository;

    public CountryControler(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping(path = "/countries")
    ResponseEntity<?> readAll()
    {
        logger.warn("Exposing all the address");
        return ResponseEntity.ok(countryRepository.findAll());
    }
}
