package com.teb.training.java.common;


public class CustomerUsage {

    public static void main(String[] args) {
        Customer customerLoc = new Customer();
        customerLoc.setName("osman");
        customerLoc.setSurname("yaycıoğlu");
        customerLoc.setUsername("osmany");
        customerLoc.setPassword("13434");
        customerLoc.validateTip1();
        customerLoc.validateTip2();

        System.out.println("Customer : " + customerLoc);

        Customer customerLoc2 = new Customer("osman",
                                             "yaycıoğlu",
                                             "osmany",
                                             "13434");

        Customer customerLoc3 = new Customer().setName("osman")
                                              .setSurname("yaycıoğlu")
                                              .setUsername("osmany")
                                              .setPassword("123123")
                                              .validateTip1()
                                              .validateTip2();

        Customer customerLoc4 = Customer.createMaleCustomer()
                                        .setName("osman")
                                        .setSurname("yaycıoğlu")
                                        .setUsername("osmany")
                                        .setPassword("123123")
                                        .validateTip1()
                                        .validateTip2();

        CustomerImmutable immutableLoc = CustomerImmutable.getBuilder()
                                                          .setName("osman")
                                                          .setSurname("yay")
                                                          .setUsername("dsjfh")
                                                          .setPassword("1213")
                                                          .setGender(EGender.MALE)
                                                          .build();


    }
}
