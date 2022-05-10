package com.teb.training.java.se8.intf;


public interface IMove {

    public static Integer       testStaticInteger      = 10;
    public static final Integer testStaticFinalInteger = 10;

    String moveForward(int km);

    String movebackward(int km);

    default String moveEach(int km) {
        System.out.println("moving test");
        moveForward(km);
        movebackward(km);
        return "returned to starting point";
    }

    default String moveEach2(int km) {
        System.out.println("moving test");
        movebackward(km);
        moveForward(km);
        return "returned to starting point";
    }

    public static String testStatic(String str) {
        return "Tested " + str;
    }

}
