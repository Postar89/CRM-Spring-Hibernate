package com.work.crm.CRM.domain.meeting.controler;

import com.work.crm.CRM.domain.country.controler.CountryControler;
import com.work.crm.CRM.domain.country.entity.Country;
import com.work.crm.CRM.domain.meeting.entity.Meeting;
import com.work.crm.CRM.domain.meeting.entity.MeetingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MeetingControler {
    private static final Logger logger = LoggerFactory.getLogger(CountryControler.class);
    private final MeetingRepository meetingRepository;

    public MeetingControler(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    @GetMapping(value = "/meetings", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Meeting>> readAllMeetings() {
        logger.warn("Exposing all the meetings");
        return ResponseEntity.ok(meetingRepository.findAll());
    }

    @GetMapping("/meetings")
    ResponseEntity<List<Meeting>> readAllMeetings(Pageable page){
        logger.info("Read Page");
        return ResponseEntity.ok(meetingRepository.findAll(page).getContent());
    }

    @PostMapping(path = "/meetings")
    ResponseEntity<?> saveCountry(@RequestBody Meeting meeting)
    {
        logger.warn("Saving meeting");
        return  ResponseEntity.ok(meetingRepository.save(meeting));
    }

    @PutMapping(path = "/meetings/{id}")
    ResponseEntity<?> updateMeeting(@PathVariable long id, @RequestBody Meeting toUpdate)
    {
        if (meetingRepository.existsById(id)) {
            meetingRepository.save(toUpdate);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
