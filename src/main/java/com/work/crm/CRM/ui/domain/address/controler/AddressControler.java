package com.work.crm.CRM.ui.domain.address.controler;

import com.work.crm.CRM.ui.domain.address.entity.Address;
import com.work.crm.CRM.ui.domain.address.entity.AddressRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressControler {

    private static final Logger logger = LoggerFactory.getLogger(AddressControler.class);
    private final AddressRepository addressRepository;

    AddressControler(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping(value = "/addresses", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Address>> readAllAddress() {
        logger.warn("Exposing all the address");
        return ResponseEntity.ok(addressRepository.findAll());
    }

    @GetMapping("/addresses")
    ResponseEntity<List<Address>> readAllAddress(Pageable page){
        logger.info("Read Page");
        return ResponseEntity.ok(addressRepository.findAll(page).getContent());
    }

    @PostMapping(path = "/addresses")
    ResponseEntity<?> saveAddress(@RequestBody Address address)
    {
        logger.warn("Saving address");
        return  ResponseEntity.ok(addressRepository.save(address));
    }

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
