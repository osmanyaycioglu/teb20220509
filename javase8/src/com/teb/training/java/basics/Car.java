package com.teb.training.java.basics;


public class Car implements IVehicle, IProcess {

    private String name;
    private int    hoursePower;


    @Override
    public void forward() {
        System.out.println("Going Forward");
    }

    @Override
    public void turn() {
        System.out.println("Turning");
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String execute(final String strParam) {
        return "Processed " + strParam;
    }


}
