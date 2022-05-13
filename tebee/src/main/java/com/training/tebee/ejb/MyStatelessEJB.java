package com.training.tebee.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless
@LocalBean
public class MyStatelessEJB {

    private int counter = 0;

    public MyStatelessEJB() {
    }

    public int getCounter() {
        counter++;
        return counter;
    }

    public int getCounter2() {
        counter++;
        return counter;
    }

}
