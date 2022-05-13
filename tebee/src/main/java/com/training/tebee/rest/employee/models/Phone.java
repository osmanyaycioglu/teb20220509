package com.training.tebee.rest.employee.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private Long   phoneId;
    private String name;
    private String number;

    public Long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Long phoneIdParam) {
        phoneId = phoneIdParam;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameParam) {
        name = nameParam;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String numberParam) {
        number = numberParam;
    }

}
