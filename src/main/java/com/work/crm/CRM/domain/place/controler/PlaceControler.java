package com.work.crm.CRM.domain.place.controler;

import com.work.crm.CRM.domain.place.entity.Place;
import com.work.crm.CRM.domain.place.entity.PlaceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PlaceControler {

    private static final Logger logger = LoggerFactory.getLogger(PlaceControler.class);
    private final PlaceRepository placeRepository;

    public PlaceControler(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @GetMapping(value = "/places", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Place>> readAllPlaces() {
        logger.warn("Exposing all the places");
        return ResponseEntity.ok(placeRepository.findAll());
    }

    @GetMapping("/places")
    ResponseEntity<List<Place>> readAllPlaces(Pageable page){
        logger.info("Read Page");
        return ResponseEntity.ok(placeRepository.findAll(page).getContent());
    }

    @PostMapping(path = "/places")
    ResponseEntity<?> savePlace(@RequestBody Place place)
    {
        logger.warn("Saving place");
        return  ResponseEntity.ok(placeRepository.save(place));
    }

    @PutMapping(path = "/places/{id}")
    ResponseEntity<?> updatePlace(@PathVariable long id, @RequestBody Place toUpdate)
    {
        if (placeRepository.existsById(id)) {
            placeRepository.save(toUpdate);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
