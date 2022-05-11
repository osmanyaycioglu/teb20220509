package com.teb.training.java.se8.trycatch;

import java.util.Scanner;

public class TryCatchRun {

    public static void main(String[] args) {
        int val1 = 100_000;
        try (Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("girdi : ");
            String nextLineLoc = scannerLoc.nextLine();
            System.out.println("Sayın : " + nextLineLoc);
        } catch (IllegalStateException | IllegalArgumentException eLoc) {
            eLoc.printStackTrace();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
