package com.work.crm.CRM.domain.meetingStatus.controler;

import com.work.crm.CRM.domain.meetingStatus.entity.MeetingStatus;
import com.work.crm.CRM.domain.meetingStatus.entity.MeetingStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/status")
@CrossOrigin("http://localhost:3000")
public class MeetingStatusControler {
    @Autowired
    MeetingStatusService service;

    @GetMapping
    public List<MeetingStatus> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public MeetingStatus getMeetingStatus(@PathVariable long id)
    {
        return this.service.getWithId(id);
    }

    @PostMapping
    public void createMeetingStatus(@RequestBody MeetingStatus source)
    {
        this.service.createNew(source);
    }

    @PutMapping("/{id}")
    public void updateMeetingStatus(@PathVariable long id, @RequestBody MeetingStatus source)
    {
        this.service.update(id, source);
    }

    @DeleteMapping("/{id}")
    public void deleteMeetingStatus(@PathVariable long id)
    {
        this.service.delete(id);
    }
}
