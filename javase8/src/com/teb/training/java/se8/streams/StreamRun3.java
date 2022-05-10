package com.teb.training.java.se8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRun3 {

    public static void main(String[] args) {
        List<String> asListLoc = Arrays.asList("osman",
                                               "orhan",
                                               "osmanaliefendioğlu",
                                               "ali",
                                               "veli",
                                               "ayşe");
        IntSummaryStatistics collectLoc = asListLoc.stream()
                                                   .distinct()
                                                   .filter(s -> s.contains("a"))
                                                   .peek(s -> System.out.println("Step1 " + s))
                                                   .filter(s -> s.length() > 3)
                                                   .peek(s -> System.out.println("Step2 " + s))
                                                   .map(s -> s.length())
                                                   .filter(i -> i > 5)
                                                   .collect(Collectors.summarizingInt(i -> i));
        System.out.println(collectLoc);

        IntSummaryStatistics summaryStatisticsLoc = asListLoc.stream()
                                                             .distinct()
                                                             .filter(s -> s.contains("a"))
                                                             .peek(s -> System.out.println("Step1 " + s))
                                                             .filter(s -> s.length() > 3)
                                                             .peek(s -> System.out.println("Step2 " + s))
                                                             .mapToInt(s -> s.length())
                                                             .summaryStatistics();

        Integer reduceLoc = asListLoc.stream()
                                     .distinct()
                                     .filter(s -> s.contains("a"))
                                     .peek(s -> System.out.println("Step1 " + s))
                                     .filter(s -> s.length() > 3)
                                     .peek(s -> System.out.println("Step2 " + s))
                                     .reduce(0,
                                             (i,
                                              s) -> i + s.length(),
                                             (ia1,
                                              ia2) -> ia1 + ia2);
        ArrayList<String> reduce2Loc = asListLoc.stream()
                                                .distinct()
                                                .filter(s -> s.contains("a"))
                                                .peek(s -> System.out.println("Step1 " + s))
                                                .filter(s -> s.length() > 3)
                                                .peek(s -> System.out.println("Step2 " + s))
                                                .reduce(new ArrayList<String>(),
                                                        (al,
                                                         s) -> {
                                                            al.add(s);
                                                            return al;
                                                        },
                                                        (al1,
                                                         al2) -> {
                                                            al1.addAll(al2);
                                                            return al1;
                                                        });
        System.out.println("---------------------");
        reduce2Loc.forEach(System.out::println);

        System.out.println(asListLoc.stream()
                                    .distinct()
                                    .filter(s -> s.contains("a"))
                                    .peek(s -> System.out.println("Step1 " + s))
                                    .filter(s -> s.length() > 3)
                                    .peek(s -> System.out.println("Step2 " + s))
                                    .reduce("",
                                            (toparlama,
                                             gelenData) -> toparlama + " " + gelenData,
                                            (paralelyapilan1,
                                             paralelyapilan2) -> paralelyapilan1 + " " + paralelyapilan2));
    }
}
