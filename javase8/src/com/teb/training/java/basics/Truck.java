package com.teb.training.java.basics;


public class Truck implements IVehicle {

    @Override
    public void forward() {
        System.out.println("Truck Going Forward");
    }

    @Override
    public void turn() {
        System.out.println("Truck Turnning");
    }

    @Override
    public String name() {
        return "Truck";
    }
}
