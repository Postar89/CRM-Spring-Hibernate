package com.work.crm.CRM.ui.domain.source.advisor.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="ADVISOR")
public class Advisor {
    @Id
    @GeneratedValue(generator = "idAdvisorSequence")
    @SequenceGenerator(schema = "CRM", name = "idAdvisorSequence", sequenceName = "CRM_ADVISOR_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private int id;
    @NotBlank
    @Column(name = "LOGIN")
    private String login;
    @NotBlank
    @Column(name = "NAME")
    private String name;
    @NotBlank
    @Column(name = "PASS")
    private String pass;
    @NotBlank
    @Column(name = "PLACE_ID")
    private int placeId ;
    @NotBlank
    @Column(name = "ROLE")
    private int role ;
    @NotBlank
    @Column(name = "SURNAME")
    private String surname;

    String getLogin() {
        return login;
    }

    void setLogin(String login) {
        this.login = login;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getPass() {
        return pass;
    }

    void setPass(String pass) {
        this.pass = pass;
    }

    int getPlaceId() {
        return placeId;
    }

    void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    int getRole() {
        return role;
    }

    void setRole(int role) {
        this.role = role;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }
}
