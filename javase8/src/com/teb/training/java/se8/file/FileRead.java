package com.teb.training.java.se8.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {

    public static void main(String[] args) {
        try {
            Path pathLoc = Paths.get("customer.txt");
            List<String> readAllLinesLoc = Files.readAllLines(pathLoc);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
