package com.work.crm.CRM.ui.domain.source.person.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "PERSON")
public class Person {
    @Id
    @GeneratedValue(generator = "idPersonSequence")
    @SequenceGenerator(schema = "CRM", name = "idPersonSequence", sequenceName = "CRM_PERSON_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private int id;
    @NotBlank
    @Column(name = "DOC_NUMBER")
    private int docNumber;
    @NotBlank
    @Column(name = "DOC_TYPE")
    private String docType;
    @NotBlank
    @Column(name = "ID_NUMBER")
    private int idNumber;
    @NotBlank
    @Column(name = "NAME")
    private String name;
    @NotBlank
    @Column(name = "SURNAME")
    private String surname;

    int getDocNumber() {
        return docNumber;
    }

    void setDocNumber(int docNumber) {
        this.docNumber = docNumber;
    }

    String getDocType() {
        return docType;
    }

    void setDocType(String docType) {
        this.docType = docType;
    }

    int getIdNumber() {
        return idNumber;
    }

    void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }
}
