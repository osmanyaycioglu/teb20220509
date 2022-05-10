package com.teb.training.java.common;


public class CustomerImmutable {

    private final String  name;
    private final String  surname;
    private final String  username;
    private final String  password;
    private final EGender gender;

    private CustomerImmutable(String nameParam,
                              String surnameParam,
                              String usernameParam,
                              String passwordParam,
                              EGender genderParam) {
        super();
        name = nameParam;
        surname = surnameParam;
        username = usernameParam;
        password = passwordParam;
        gender = genderParam;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


    public EGender getGender() {
        return gender;
    }

    public static CustomerImmutableBuilder getBuilder() {
        return new CustomerImmutableBuilder();
    }

    public static class CustomerImmutableBuilder {

        private String  name;
        private String  surname;
        private String  username;
        private String  password;
        private EGender gender;


        private CustomerImmutableBuilder() {
        }

        public String getName() {
            return name;
        }

        public CustomerImmutableBuilder setName(String nameParam) {
            name = nameParam;
            return this;
        }

        public String getSurname() {
            return surname;
        }

        public CustomerImmutableBuilder setSurname(String surnameParam) {
            surname = surnameParam;
            return this;
        }

        public String getUsername() {
            return username;
        }

        public CustomerImmutableBuilder setUsername(String usernameParam) {
            username = usernameParam;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public CustomerImmutableBuilder setPassword(String passwordParam) {
            password = passwordParam;
            return this;
        }

        public EGender getGender() {
            return gender;
        }

        public CustomerImmutableBuilder setGender(EGender genderParam) {
            gender = genderParam;
            return this;
        }

        public CustomerImmutable build() {
            return new CustomerImmutable(name,
                                         surname,
                                         username,
                                         password,
                                         gender);
        }

    }

}
