package com.work.crm.CRM.logic.client.controler;

import com.work.crm.CRM.domain.person.entity.Person;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class ClientWriteModel {
    private String docNumber;
    private String docType;
    private int idNumber;
    private String name;
    private String surname;

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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
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

    public Person toPerson()
    {
        return new Person(name, surname, docNumber, docType, idNumber);
    }
}