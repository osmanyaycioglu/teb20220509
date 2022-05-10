package com.teb.training.java.se8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRun2 {

    public static void main(String[] args) {
        List<String> asListLoc = Arrays.asList("osman",
                                               "osman",
                                               "osman",
                                               "ali",
                                               "veli",
                                               "ayşe");
        List<String> collectLoc = asListLoc.stream()
                                           .distinct()
                                           .filter(s -> s.contains("a"))
                                           .peek(s -> System.out.println("Step1 " + s))
                                           .filter(s -> s.length() > 3)
                                           .peek(s -> System.out.println("Step2 " + s))
                                           .collect(Collectors.toList());

        System.out.println("--------------------------");
        boolean anyMatchLoc = asListLoc.stream()
                                       .distinct()
                                       .filter(s -> s.contains("a"))
                                       .peek(s -> System.out.println("Step1 " + s))
                                       .filter(s -> s.length() > 3)
                                       .peek(s -> System.out.println("Step2 " + s))
                                       .allMatch(s -> s.length() >= 6);
        System.out.println("--------------------------");
        String orElseLoc = asListLoc.stream()
                                    .distinct()
                                    .filter(s -> s.contains("a"))
                                    .peek(s -> System.out.println("Step1 " + s))
                                    .filter(s -> s.length() > 13)
                                    .peek(s -> System.out.println("Step2 " + s))
                                    .findAny()
                                    .orElse("olmadı");
        System.out.println(orElseLoc);


    }
}
