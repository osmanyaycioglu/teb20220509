package com.training.tebee.rest.api.design;


public class Employee {

    private Long   empId;
    private String name;
    private String surname;
    private String department;

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


}
