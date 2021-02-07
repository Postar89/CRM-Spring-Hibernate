package com.work.crm.CRM.ui.domain.source.advisor.controler;

import com.work.crm.CRM.ui.domain.source.advisor.entity.Advisor;
import com.work.crm.CRM.ui.domain.source.advisor.entity.AdvisorRepository;
import com.work.crm.CRM.ui.domain.source.city.controler.CityControler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class AdvisorControler {
    private static final Logger logger = LoggerFactory.getLogger(CityControler.class);
    private final AdvisorRepository advisorRepository;

    public AdvisorControler(AdvisorRepository advisorRepository){
        this.advisorRepository=advisorRepository;
    }

    @GetMapping("/advisors")
    ResponseEntity<List<Advisor>> readAllAdvisors()
    {
        logger.warn("Exposing all the Advisors");
        return ResponseEntity.ok(advisorRepository.findAll());
    }

}
