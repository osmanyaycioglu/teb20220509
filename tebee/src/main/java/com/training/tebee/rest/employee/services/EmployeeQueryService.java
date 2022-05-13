package com.training.tebee.rest.employee.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.training.tebee.rest.employee.data.EmployeeDao;
import com.training.tebee.rest.employee.models.Employee;

@Singleton
@LocalBean
public class EmployeeQueryService {

    @EJB
    private EmployeeDao employeeDao;

    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    public Employee getOneEmployee(Long empIdLongParam) {
        return employeeDao.get(empIdLongParam);
    }

    public List<Employee> getEmployeesBySurname(String surname) {
        return employeeDao.getBySurname(surname);
    }

}
