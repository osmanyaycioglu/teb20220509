package com.teb.training.java.se8.lab.customer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.teb.training.java.common.Customer;
import com.teb.training.java.common.EGender;

public class CustomerDataReader {

    private final List<Customer> customers = new ArrayList<>();

    // osman,yaycıoğlu,osmany,12345,MALE,10000
    public void readCustomerFromFile(String fileName) {
        try {
            Path pathLoc = Paths.get(fileName);
            List<String> readAllLinesLoc = Files.readAllLines(pathLoc);
            readAllLinesLoc.stream()
                           .map(s -> s.split(","))
                           .filter(sa -> sa.length == 6)
                           .map(sa -> Customer.createCustomer()
                                              .setName(sa[0])
                                              .setSurname(sa[1])
                                              .setUsername(sa[2])
                                              .setPassword(sa[3])
                                              .setGender(EGender.valueOf(sa[4]))
                                              .setAmount(Integer.parseInt(sa[5])))
                           .filter(c -> c.getAmount() > 0)
                           .sorted((c1,
                                    c2) -> c1.getName()
                                             .compareTo(c2.getName()))
                           .sorted((c1,
                                    c2) -> c1.getAmount() - c2.getAmount())
                           .forEach(c -> customers.add(c));

            //            customers = readAllLinesLoc.stream()
            //                                       .map(s -> s.split(","))
            //                                       .filter(sa -> sa.length == 6)
            //                                       .map(sa -> Customer.createCustomer()
            //                                                          .setName(sa[0])
            //                                                          .setSurname(sa[1])
            //                                                          .setUsername(sa[2])
            //                                                          .setPassword(sa[3])
            //                                                          .setGender(EGender.valueOf(sa[4]))
            //                                                          .setAmount(Integer.parseInt(sa[5])))
            //                                       .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public List<Customer> getCustomers() {
        return customers;
    }

}
