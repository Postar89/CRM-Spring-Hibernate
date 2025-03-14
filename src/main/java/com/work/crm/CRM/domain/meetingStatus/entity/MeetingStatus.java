package com.work.crm.CRM.domain.meetingStatus.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "MEETING_STATUS")
public class MeetingStatus {
    @Id
    @GeneratedValue(generator = "idMeetingStatusSequence")
    @SequenceGenerator(schema = "CRM", name = "idMeetingStatusSequence", sequenceName = "CRM_MEETING_STATUS_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private long id;
    @NotBlank
    @Column(name = "STATUS")
    private String status;

    public MeetingStatus() {
    }

    public MeetingStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    String getStatus() {
        return status;
    }

    void setStatus(String status) {
        this.status = status;
    }
}
