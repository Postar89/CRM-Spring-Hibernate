package com.work.crm.CRM.ui.entity.meeting;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
    private String creatrionDate;
    @Column (name = "MEETING_DATE")
    private String meetingDate;
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

    String getCreatrionDate() {
        return creatrionDate;
    }

    void setCreatrionDate(String creatrionDate) {
        this.creatrionDate = creatrionDate;
    }

    String getMeetingDate() {
        return meetingDate;
    }

    void setMeetingDate(String meetingDate) {
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
