package com.teb.training.java.se8;


public interface ITest {

    boolean test(String str);

    default boolean textExtra(String str) {
        return str.length() > 5;
    }
}
