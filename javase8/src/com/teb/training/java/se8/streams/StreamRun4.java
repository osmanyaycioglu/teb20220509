package com.teb.training.java.se8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRun4 {

    public static void main(String[] args) {
        List<String> asListLoc = Arrays.asList("osman",
                                               "orhan",
                                               "osmanaliefendioğlu",
                                               "ali",
                                               "veli",
                                               "ayşe");
        IntSummaryStatistics collectLoc = asListLoc.parallelStream()
                                                   .filter(s -> s.contains("a"))
                                                   .peek(s -> System.out.println("Step1 "
                                                                                 + s
                                                                                 + " thread : "
                                                                                 + Thread.currentThread()
                                                                                         .getName()))
                                                   .parallel()
                                                   .filter(s -> s.length() > 3)
                                                   .peek(s -> System.out.println("Step2 "
                                                                                 + s
                                                                                 + " thread : "
                                                                                 + Thread.currentThread()
                                                                                         .getName()))
                                                   .map(s -> s.length())
                                                   .filter(i -> i > 5)
                                                   .collect(Collectors.summarizingInt(i -> i));
        System.out.println(collectLoc);
    }
}
