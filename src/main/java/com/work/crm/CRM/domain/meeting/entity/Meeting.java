package com.work.crm.CRM.domain.meeting.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "MEETING")
public class Meeting {
    @Id
    @GeneratedValue(generator = "idMeetingSequence")
    @SequenceGenerator(schema = "CRM", name = "idMeetingSequence", sequenceName = "CRM_MEETING_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column (name = "ID")
    private long id;
    @NotNull
    @JoinColumn (name = "ADVISOR_ID", foreignKey = @ForeignKey(name = "FK_MEETING_ADVISOR"))
    private long advisorId;
    @NotBlank
    @Column (name = "CREATION_DATE")
    private Date creatrionDate;
    @Column (name = "MEETING_DATE")
    private Date meetingDate;
    @NotNull
    @JoinColumn (name = "PLACE_ID", foreignKey = @ForeignKey(name = "FK_MEETING_PLACE"))
    private long placeId;
    @NotBlank
    @JoinColumn (name = "PRODUCT_ID", foreignKey = @ForeignKey(name = "FK_MEETING_PRODUCT"))
    private String productId;
    @NotNull
    @JoinColumn (name = "STATUS_ID", foreignKey = @ForeignKey(name = "FK_MEETING_STATUS"))
    private long statusId;
    @JoinColumn (name = "PERSON_ID", foreignKey = @ForeignKey(name = "FK_MEETING_PERSON"))
    private long personId;


    public Meeting( long advisorId,  Date creatrionDate, Date meetingDate,  long placeId,  String productId,  long statusId, long personId) {
        this.advisorId = advisorId;
        this.creatrionDate = creatrionDate;
        this.meetingDate = meetingDate;
        this.placeId = placeId;
        this.productId = productId;
        this.statusId = statusId;
        this.personId = personId;
    }

    public Meeting(long advisorId, Date creatrionDate, long placeId, String productId, long statusId) {
        this.advisorId = advisorId;
        this.creatrionDate = creatrionDate;
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

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }
}
