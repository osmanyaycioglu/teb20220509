package com.teb.training.java.se8.functional.interfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.teb.training.java.common.Customer;

public class FuncRun {

    public static void main(String[] args) {
        Customer customer = Customer.createMaleCustomer()
                                    .setName("osman")
                                    .setSurname("yaycıoğlu")
                                    .setUsername("osmany")
                                    .setPassword("123123")
                                    .validateTip1()
                                    .validateTip2();

        Consumer<String> strConsume = s -> System.out.println(s);

        BiConsumer<String, String> strBiConsumerLoc = (s1,
                                                       s2) -> System.out.println(s1 + " " + s2);

        Consumer<Customer> custConsume = c -> System.out.println("Customer : " + c.getName() + " " + c.getSurname());
        custConsume.accept(Customer.createMaleCustomer()
                                   .setName("osman")
                                   .setSurname("yaycıoğlu")
                                   .setUsername("osmany")
                                   .setPassword("123123")
                                   .validateTip1()
                                   .validateTip2());

        Function<String, Customer> custFunc = str -> Customer.createMaleCustomer()
                                                             .setName(str);
        Function<String, String> strFunctionLoc = s -> "Sayın " + s;

        UnaryOperator<String> unaryOperatorLoc = s -> "Sayın " + s;

        BiFunction<String, Customer, String> biFunctionLoc = (s,
                                                              c) -> s + " " + c;
        BiFunction<String, String, String> biFunctionLoc2 = (s1,
                                                             s2) -> s1 + " " + s2;

        BinaryOperator<String> binaryOperatorLoc = (s1,
                                                    s2) -> s1 + " " + s2;

        Customer applyLoc = custFunc.apply("osman");

        Supplier<String> supplierLoc = () -> "osman";

        testSomething(3,
                      "customer : " + customer);

        String str1 = "osman";
        String str2 = str1;
        str1 += " another";
        String concatLoc = str1.concat(" test");
        System.out.println(concatLoc);
        testSomething2(6,
                       () -> "customer : " + customer);

        Predicate<String> strPredicateLoc = s -> s.length() > 5;
        Predicate<String> andLoc = strPredicateLoc.and(s -> s.length() < 10);
        andLoc = andLoc.and((s -> s.length() < 10));

        strPredicateLoc.and(s -> s.length() < 10)
                       .and(t -> t.contains("os"))
                       .or(f -> f.length() < 20)
                       .negate();
        if (strPredicateLoc.test("osman yay")) {
            System.out.println("5 den büyük");
        }
        BiPredicate<String, Integer> biPredicateLoc = (s,
                                                       i) -> s.length() == i;
        boolean testLoc = biPredicateLoc.test(concatLoc,
                                              1);


    }

    private static void testSomething(int level,
                                      String str) {
        if (level > 5) {
            System.out.println(str);
        }
    }

    private static void testSomething2(int level,
                                       Supplier<String> ss) {
        if (level > 5) {
            System.out.println(ss.get());
        }
    }

}
