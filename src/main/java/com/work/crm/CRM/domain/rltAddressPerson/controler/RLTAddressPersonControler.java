package com.work.crm.CRM.domain.rltAddressPerson.controler;

import com.work.crm.CRM.domain.meeting.entity.Meeting;
import com.work.crm.CRM.domain.rltAddressPerson.entity.RLTAddressPerson;
import com.work.crm.CRM.domain.rltAddressPerson.entity.RLTAddressPersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RLTAddressPersonControler {
    public static final Logger logger = LoggerFactory.getLogger(RLTAddressPersonControler.class);
    public final RLTAddressPersonRepository rltAddressPersonRepository;

    public RLTAddressPersonControler(RLTAddressPersonRepository rltAddressPersonRepository) {
        this.rltAddressPersonRepository = rltAddressPersonRepository;
    }

    @GetMapping(value = "/relation", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<RLTAddressPerson>> readAllRLTAddressPerson() {
        logger.warn("Exposing all the RLTAddressPerson");
        return ResponseEntity.ok(rltAddressPersonRepository.findAll());
    }

    @GetMapping("/relation")
    ResponseEntity<List<RLTAddressPerson>> readAllRLTAddressPerson(Pageable page){
        logger.info("Read Page");
        return ResponseEntity.ok(rltAddressPersonRepository.findAll(page).getContent());
    }

    @PostMapping(path = "/relation")
    ResponseEntity<?> saveCountry(@RequestBody RLTAddressPerson rltAddressPerson)
    {
        logger.warn("Saving meeting");
        return  ResponseEntity.ok(rltAddressPersonRepository.save(rltAddressPerson));
    }

    @PutMapping(path = "/relation/{id}")
    ResponseEntity<?> updateMeeting(@PathVariable long id, @RequestBody RLTAddressPerson toUpdate)
    {
        if (rltAddressPersonRepository.existsById(id)) {
            rltAddressPersonRepository.save(toUpdate);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
