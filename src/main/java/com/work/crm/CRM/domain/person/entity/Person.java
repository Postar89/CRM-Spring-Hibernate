package com.work.crm.CRM.domain.person.entity;

import org.json.JSONObject;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "PERSON")
public class Person {
    @Id
    @GeneratedValue(generator = "idPersonSequence")
    @SequenceGenerator(schema = "CRM", name = "idPersonSequence", sequenceName = "CRM_PERSON_INCREMENT", initialValue = 1, allocationSize = 1)
    @Column(name = "ID")
    private long id;
    @NotBlank
    @Column(name = "DOC_NUMBER")
    private String docNumber;
    @NotBlank
    @Column(name = "DOC_TYPE")
    private String docType;
    @NotBlank
    @Column(name = "ID_NUMBER")
    private String idNumber;
    @NotBlank
    @Column(name = "NAME")
    private String name;
    @NotBlank
    @Column(name = "SURNAME")
    private String surname;

    public Person()
    {

    }

    public Person(JSONObject object)
    {
        this.docNumber = object.getString("docNumber");
        this.docType = object.getString("docType");
        this.idNumber = object.getString("idNumber");
        this.name = object.getString("name");
        this.surname = object.getString("surname");
    }

    public Person(String name, String surname, String docNumber, String docType,String idNumber)
    {
        this.docNumber = docNumber;
        this.docType = docType;
        this.idNumber = idNumber;
        this.name = name;
        this.surname = surname;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
