package com.training.tebee.ejb;

import javax.ejb.LocalBean;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;


@Stateful
@LocalBean
public class MyStatefulEJB {

    private int counter = 0;

    public MyStatefulEJB() {
    }

    public int getCounter() {
        counter++;
        return counter;
    }

    @PrePassivate
    public void adf() {

    }

    @PostActivate
    public void gth() {

    }

    @Remove
    public void asd() {

    }

}
