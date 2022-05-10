package com.teb.training.java.generics;

import java.math.BigDecimal;

public class GeneralRun {

    public static void main(String[] args) {
        IGeneral generalLoc = s -> s + "1";
        IGeneralInteger generalIntegerLoc = i -> i + 100;

        IGenericGeneral<String> general2Loc = s -> s + "1";

        IGenericGeneral<Integer> general3Loc = i -> i + 100;

        ITwoGenericGeneral<String, Integer> general4Loc = s -> Integer.parseInt(s);

        ITwoGenericGeneral<String, Integer> general5Loc = s -> s.length();

        ITwoGenericGeneral<String, BigDecimal> generalt6Loc = s -> new BigDecimal(s.length());

    }
}
