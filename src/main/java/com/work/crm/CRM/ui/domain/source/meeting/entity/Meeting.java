package com.work.crm.CRM.ui.domain.source.meeting.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "MEETING")
public class Meeting {
    @Id
    @GeneratedValue(generator = "idMeetingSequence")
    @SequenceGenerator(schema = "CRM", name = "idMeetingSequence", sequenceName = "CRM_MEETING_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column (name = "ID")
    private int id;
    @NotBlank
    @Column (name = "ADVISOR_ID")
    private int advisorId;
    @NotBlank
    @Column (name = "CREATION_DATE")
    private Date creatrionDate;
    @Column (name = "MEETING_DATE")
    private Date meetingDate;
    @NotBlank
    @Column (name = "PLACE_ID")
    private int placeId;
    @NotBlank
    @Column (name = "PRODUCT_ID")
    private String productId;
    @NotBlank
    @Column (name = "STATUS_ID")
    private int statusId;

    int getAdvisorId() {
        return advisorId;
    }

    void setAdvisorId(int advisorId) {
        this.advisorId = advisorId;
    }

    Date getCreatrionDate() {
        return creatrionDate;
    }

    void setCreatrionDate(Date creatrionDate) {
        this.creatrionDate = creatrionDate;
    }

    Date getMeetingDate() {
        return meetingDate;
    }

    void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    int getPlaceId() {
        return placeId;
    }

    void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    String getProductId() {
        return productId;
    }

    void setProductId(String productId) {
        this.productId = productId;
    }

    int getStatusId() {
        return statusId;
    }

    void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
