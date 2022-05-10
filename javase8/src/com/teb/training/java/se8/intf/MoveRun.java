package com.teb.training.java.se8.intf;


public class MoveRun {

    public static void main(String[] args) {
        IMove iMoveLoc = new MoveImpl();
        iMoveLoc.moveEach(10);
    }
}
