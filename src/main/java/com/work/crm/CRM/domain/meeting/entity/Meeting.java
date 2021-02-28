package com.work.crm.CRM.domain.meeting.entity;

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
    private long id;
    @NotBlank
    @Column (name = "ADVISOR_ID")
    private long advisorId;
    @NotBlank
    @Column (name = "CREATION_DATE")
    private Date creatrionDate;
    @Column (name = "MEETING_DATE")
    private Date meetingDate;
    @NotBlank

    @Column (name = "PLACE_ID")
    private long placeId;
    @NotBlank

    @Column (name = "PRODUCT_ID")
    private String productId;
    @NotBlank

    @Column (name = "STATUS_ID")
    private long statusId;

    public Meeting( long advisorId,  Date creatrionDate, Date meetingDate,  long placeId,  String productId,  long statusId) {
        this.advisorId = advisorId;
        this.creatrionDate = creatrionDate;
        this.meetingDate = meetingDate;
        this.placeId = placeId;
        this.productId = productId;
        this.statusId = statusId;
    }

    public Meeting() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    long getAdvisorId() {
        return advisorId;
    }

    void setAdvisorId(long advisorId) {
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

    long getPlaceId() {
        return placeId;
    }

    void setPlaceId(long placeId) {
        this.placeId = placeId;
    }

    String getProductId() {
        return productId;
    }

    void setProductId(String productId) {
        this.productId = productId;
    }

    long getStatusId() {
        return statusId;
    }

    void setStatusId(long statusId) {
        this.statusId = statusId;
    }
}
