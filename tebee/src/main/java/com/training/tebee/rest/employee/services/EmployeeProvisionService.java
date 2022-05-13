package com.training.tebee.rest.employee.services;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.ws.rs.PathParam;

import com.training.tebee.ejb.MySingletonEJB;
import com.training.tebee.rest.employee.models.Employee;

@Singleton
@LocalBean
public class EmployeeProvisionService {

    @EJB
    private MySingletonEJB mySingletonEJB;

    public void activate(Employee employeeParam) {
    }

    public void deactivate(@NotEmpty @Positive @PathParam("empId") Long empId) {
    }

    public void suspend(@PathParam("empId") Long empId) {
    }

    public void updateEmployee(Employee employeeParam) {
    }

}
