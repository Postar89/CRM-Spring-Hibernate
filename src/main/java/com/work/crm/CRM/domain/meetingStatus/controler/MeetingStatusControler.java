package com.work.crm.CRM.domain.meetingStatus.controler;

import com.work.crm.CRM.domain.country.controler.CountryControler;
import com.work.crm.CRM.domain.meeting.entity.Meeting;
import com.work.crm.CRM.domain.meetingStatus.entity.MeetingStatus;
import com.work.crm.CRM.domain.meetingStatus.entity.MeetingStatusRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MeetingStatusControler {
    private static final Logger logger = LoggerFactory.getLogger(CountryControler.class);
    private final MeetingStatusRepository meetingStatusRepository;

    public MeetingStatusControler(MeetingStatusRepository meetingStatusRepository) {
        this.meetingStatusRepository = meetingStatusRepository;
    }

    @GetMapping(value = "/status", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<MeetingStatus>> readAllMeetings() {
        logger.warn("Exposing all the meetings statuts");
        return ResponseEntity.ok(meetingStatusRepository.findAll());
    }

    @GetMapping("/status")
    ResponseEntity<List<MeetingStatus>> readAllMeetings(Pageable page){
        logger.info("Read Page");
        return ResponseEntity.ok(meetingStatusRepository.findAll(page).getContent());
    }

    @PostMapping(path = "/status")
    ResponseEntity<?> saveCountry(@RequestBody MeetingStatus status)
    {
        logger.warn("Saving meeting status");
        return  ResponseEntity.ok(meetingStatusRepository.save(status));
    }

    @PutMapping(path = "/status/{id}")
    ResponseEntity<?> updateCountry(@PathVariable Long id, @RequestBody MeetingStatus toUpdate)
    {
        if (meetingStatusRepository.existsById(id)) {
            meetingStatusRepository.save(toUpdate);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
