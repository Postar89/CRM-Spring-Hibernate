package com.work.crm.CRM.ui.domain.source.product.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "DESCRPITION")
    private String description;
    @NotBlank
    @Column(name = "NAME")
    private String name;

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
