package com.work.crm.CRM.domain.meeting.controler;

import com.work.crm.CRM.domain.meeting.entity.Meeting;
import com.work.crm.CRM.domain.meeting.entity.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/meeting")
@CrossOrigin("http://localhost:3000")
public class MeetingControler {
    @Autowired
    MeetingService service;


    @GetMapping
    public List<Meeting> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Meeting getMeeting(@PathVariable long id)
    {
        return this.service.getWithId(id);
    }

    @PostMapping
    public void createMeeting(@RequestBody Meeting source)
    {
        this.service.createNew(source);
    }

    @PutMapping("/{id}")
    public void updateMeeting(@PathVariable long id, @RequestBody Meeting source)
    {
        this.service.update(id, source);
    }

    @DeleteMapping("/{id}")
    public void deleteMeeting(@PathVariable long id)
    {
        this.service.delete(id);
    }
}

