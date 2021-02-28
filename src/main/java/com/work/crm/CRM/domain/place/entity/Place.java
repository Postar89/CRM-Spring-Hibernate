package com.work.crm.CRM.domain.place.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "PLACE")
public class Place {
    @Id
    @GeneratedValue(generator = "idPlaceSequence")
    @SequenceGenerator(schema = "CRM", name = "idPlaceSequence", sequenceName = "CRM_PLACE_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private long id;
    @NotBlank
    @JoinColumn(name = "ADDRES_ID",foreignKey = @ForeignKey(name = "FK_PLACE_ADDRESS"))
    private long addresId;
    @NotBlank
    @Column(name = "NAME")
    private String name;

    public Place(long addresId, String name) {
        this.addresId = addresId;
        this.name = name;
    }

    public Place() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    long getAddresId() {
        return addresId;
    }

    void setAddresId(long addresId) {
        this.addresId = addresId;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
