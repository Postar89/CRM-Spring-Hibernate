package com.work.crm.CRM.domain.advisor.controler;


import com.work.crm.CRM.domain.advisor.entity.Advisor;
import com.work.crm.CRM.domain.advisor.entity.AdvisorRepository;
import com.work.crm.CRM.domain.city.controler.CityControler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AdvisorControler {
    private static final Logger logger = LoggerFactory.getLogger(CityControler.class);
    private final AdvisorRepository advisorRepository;

    public AdvisorControler(AdvisorRepository advisorRepository){
        this.advisorRepository=advisorRepository;
    }

    @GetMapping(value = "/advisors", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Advisor>> readAllAdvisors() {
        logger.warn("Exposing all the advosors");
        return ResponseEntity.ok(advisorRepository.findAll());
    }

    @GetMapping("/advisors")
    ResponseEntity<List<Advisor>> readAllAdvisors(Pageable page){
        logger.info("Read Page");
        return ResponseEntity.ok(advisorRepository.findAll(page).getContent());
    }

    @PostMapping(path = "/advisors")
    ResponseEntity<?> saveAdvisors(@RequestBody Advisor advospr)
    {
        logger.warn("Saving advisor");
        return  ResponseEntity.ok(advisorRepository.save(advospr));
    }

    @PutMapping(path = "/advisors/{id}")
    ResponseEntity<?> updateAdvisors(@PathVariable long id, @RequestBody Advisor toUpdate)
    {
        if (advisorRepository.existsById(id)) {
            advisorRepository.save(toUpdate);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
