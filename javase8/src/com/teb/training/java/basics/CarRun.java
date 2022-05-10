package com.teb.training.java.basics;


public class CarRun {

    public static void main(final String[] args) {
        IVehicle carLoc = new Truck();

        carLoc.forward();
        carLoc.turn();
    }
}
