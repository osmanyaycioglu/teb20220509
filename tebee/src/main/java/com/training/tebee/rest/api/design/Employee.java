package com.training.tebee.rest.api.design;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Employee {

    @NotNull
    @Positive
    @Max(Integer.MAX_VALUE)
    @Min(0)
    private Long   empId;
    @NotEmpty
    @NotBlank
    @Size(min = 2, max = 15)
    private String name;
    @NotEmpty
    @NotBlank
    @Size(min = 3, max = 20, message = "soy isim 3 ile 20 arasında olmalı")
    private String surname;
    private String department;
    @NotEmpty
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$",
             message = "Password küçük harf büyük harf özel harf rakam barındırmalı")
    private String password;


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String departmentParam) {
        department = departmentParam;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empIdParam) {
        empId = empIdParam;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameParam) {
        name = nameParam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surnameParam) {
        surname = surnameParam;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passwordParam) {
        password = passwordParam;
    }


}
