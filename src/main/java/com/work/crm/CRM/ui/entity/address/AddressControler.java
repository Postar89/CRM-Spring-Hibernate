package com.work.crm.CRM.ui.entity.address;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RepositoryRestController
class AddressControler {

    private static final Logger logger = LoggerFactory.getLogger(AddressControler.class);
    private final AddressRepository addressRepository;

    AddressControler(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping(path = "/addresses")
    ResponseEntity<?> readAll()
    {
        logger.warn("Exposing all the address");
        return ResponseEntity.ok(addressRepository.findAll());
    }
//    @PostMapping(path = "/addresses")
//    ResponseEntity<?> saveAll()
//    {
//        logger.warn("Saving all addresses");
//        return  ResponseEntity.ok(addressRepository.saveAll());
//    }

    @PutMapping(path = "/addresses/{id}")
    ResponseEntity<?> updateAddress(@PathVariable int id, @RequestBody Address toUpdate)
    {
        if (addressRepository.existsById(id)) {
            addressRepository.save(toUpdate);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
