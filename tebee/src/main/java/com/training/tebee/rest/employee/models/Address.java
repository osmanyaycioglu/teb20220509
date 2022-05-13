package com.training.tebee.rest.employee.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long   addId;

    private String city;
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String cityParam) {
        city = cityParam;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String streetParam) {
        street = streetParam;
    }

    public Long getAddId() {
        return addId;
    }

    public void setAddId(Long addIdParam) {
        addId = addIdParam;
    }


}
