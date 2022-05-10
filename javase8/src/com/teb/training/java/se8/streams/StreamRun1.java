package com.teb.training.java.se8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRun1 {

    public static void main(String[] args) {
        //        File fileLoc = new File("xyz.txt");
        //        FileInputStream streamLoc = new FileInputStream(fileLoc);

        List<String> strList = new ArrayList<>();
        strList.add("osman");
        strList.add("osman");
        strList.add("osman");
        strList.add("ali");
        strList.add("veli");
        strList.add("ayşe");

        List<String> asListLoc = Arrays.asList("osman",
                                               "osman",
                                               "osman",
                                               "ali",
                                               "veli",
                                               "ayşe");
        Set<String> setLoc = new TreeSet<>();
        for (String stringLoc : asListLoc) {
            setLoc.add(stringLoc);
        }
        List<String> result = new ArrayList<>();
        for (String stringLoc : setLoc) {
            if (stringLoc.length() > 3) {
                result.add(stringLoc);
            }
        }
        for (String stringLoc : result) {
            System.out.println(stringLoc);
        }

        List<String> result2 = asListLoc.stream()
                                        .sorted()
                                        .distinct()
                                        .filter(s -> s.length() > 3)
                                        .filter(s -> s.length() < 10)
                                        .collect(Collectors.toList());
        Stream<String> streamLoc = asListLoc.stream();


        result2.forEach(System.out::println);


        MyList<String> listLoc = new MyList<String>().add("osman")
                                                     .add("osman")
                                                     .add("osman")
                                                     .add("ali")
                                                     .add("veli")
                                                     .add("ayşe")
                                                     .addAll("mehmet",
                                                             "faik",
                                                             "orhan")
                                                     .distinct()
                                                     .sorted((s1,
                                                              s2) -> s1.compareTo(s2))
                                                     .filter(s -> s.length() > 3)
                                                     .filter(s -> s.length() < 10);

    }
}
