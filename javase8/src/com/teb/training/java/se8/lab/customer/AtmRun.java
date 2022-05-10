package com.teb.training.java.se8.lab.customer;

public class AtmRun {

    public static void main(String[] args) {
        CustomerDataReader readerLoc = new CustomerDataReader();
        readerLoc.readCustomerFromFile("customer.txt");
        readerLoc.getCustomers()
                 .forEach(System.out::println);

    }
}
