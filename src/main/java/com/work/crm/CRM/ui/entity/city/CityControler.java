package com.work.crm.CRM.ui.entity.city;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RepositoryRestController
public class CityControler {

    private static final Logger logger = LoggerFactory.getLogger(CityControler.class);
    private final CityRepository cityRepository;


    public CityControler(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping(path = "/cities")
    ResponseEntity<?> readAll()
    {
        logger.warn("Exposing all the address");
        return ResponseEntity.ok(cityRepository.findAll());
    }
}
