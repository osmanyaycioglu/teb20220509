package com.training.tebee.rest.employee.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "emp")
public class Employee {

    // Jpa
    @Id
    @GeneratedValue
    private Long        empId;
    @NotEmpty
    @NotBlank
    @Size(min = 2, max = 15)
    @Column(name = "isim")
    private String      name;
    @NotEmpty
    @NotBlank
    @Size(min = 3, max = 20, message = "soy isim 3 ile 20 arasında olmalı")
    private String      surname;
    private String      department;
    @NotEmpty
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$",
             message = "Password küçük harf büyük harf özel harf rakam barındırmalı")
    private String      password;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Address     address;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Phone> phoneNumbers;

    @Version
    private Long        vers;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address addressParam) {
        address = addressParam;
    }

    public List<Phone> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Phone> phoneNumbersParam) {
        phoneNumbers = phoneNumbersParam;
    }

    public Long getVers() {
        return vers;
    }

    public void setVers(Long versParam) {
        vers = versParam;
    }


}
