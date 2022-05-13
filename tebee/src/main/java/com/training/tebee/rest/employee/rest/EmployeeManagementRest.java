package com.training.tebee.rest.employee.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.training.tebee.rest.employee.models.Employee;

@Path("/api/v1/employee/management")
public class EmployeeManagementRest {


    @Path("/update")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateEmployee(Employee employeeParam) {
        return "OK";
    }

}
