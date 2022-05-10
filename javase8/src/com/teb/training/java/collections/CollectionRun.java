package com.teb.training.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionRun {

    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();
        stringsList.add("osman");
        stringsList.add("veli");

        stringsList.forEach(CollectionRun::printDoubleDescription);

        stringsList.forEach(System.out::println);

        stringsList.forEach(s -> {
            System.out.println("deneme : " + s);
            System.out.println("deneme2 : " + s);
        });

        for (String stringLoc : stringsList) {
            System.out.println(stringLoc);
        }

        Iterator<String> iteratorLoc = stringsList.iterator();

        while (iteratorLoc.hasNext()) {
            String nextLoc = iteratorLoc.next();
        }


        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5D);


    }

    public static void printDoubleDescription(String str) {
        System.out.println(str);
        System.out.println(str);
    }
}
