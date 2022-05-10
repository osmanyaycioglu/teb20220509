package com.teb.training.java.common;

public class Customer {

    private String  name;
    private String  surname;
    private String  username;
    private String  password;
    private EGender gender;
    private Integer amount;

    public Customer() {
    }

    public Customer(String nameParam,
                    String surnameParam,
                    String usernameParam,
                    String passwordParam) {
        super();
        name = nameParam;
        surname = surnameParam;
        username = usernameParam;
        password = passwordParam;
    }


    public Customer(String nameParam,
                    String surnameParam,
                    String usernameParam) {
        super();
        name = nameParam;
        surname = surnameParam;
        username = usernameParam;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amountParam) {
        amount = amountParam;
    }

    public EGender getGender() {
        return gender;
    }

    public Customer setGender(EGender genderParam) {
        gender = genderParam;
        return this;
    }

    public static Customer createMaleCustomer() {
        return new Customer().setGender(EGender.MALE);
    }

    public static Customer createFemaleCustomer() {
        return new Customer().setGender(EGender.FEMALE);
    }

    public String getName() {
        return name;
    }

    public Customer setName(String nameParam) {
        name = nameParam;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Customer setSurname(String surnameParam) {
        surname = surnameParam;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Customer setUsername(String usernameParam) {
        username = usernameParam;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Customer setPassword(String passwordParam) {
        password = passwordParam;
        return this;
    }

    public Customer validateTip1() {
        if (name == null) {
            throw new IllegalArgumentException("name null olamaz");
        }
        return this;
    }

    public Customer validateTip2() {
        if (username == null) {
            throw new IllegalArgumentException("username null olamaz");
        }
        return this;
    }

    @Override
    public String toString() {
        return "Customer [name="
               + name
               + ", surname="
               + surname
               + ", username="
               + username
               + ", password="
               + password
               + "]";
    }


}
