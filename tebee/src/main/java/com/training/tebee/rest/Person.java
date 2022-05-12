package com.training.tebee.rest;

import javax.validation.constraints.NotEmpty;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class Person {

    @NotEmpty
    @PathParam("name")
    private String  name;
    @PathParam("surname")
    private String  surname;
    @QueryParam("height")
    private Integer height;
    @HeaderParam("weight")
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String nameParam) {
        name = nameParam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surnameParam) {
        surname = surnameParam;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer heightParam) {
        height = heightParam;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weightParam) {
        weight = weightParam;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", surname=" + surname + ", height=" + height + ", weight=" + weight + "]";
    }


}
