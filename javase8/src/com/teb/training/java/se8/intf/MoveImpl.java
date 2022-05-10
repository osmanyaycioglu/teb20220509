package com.teb.training.java.se8.intf;


public class MoveImpl implements IMove {

    @Override
    public String moveForward(int kmParam) {
        return "moving forward";
    }

    @Override
    public String movebackward(int kmParam) {
        return "moving backward";
    }

}
