package com.training.tebee.rest.employee.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.training.tebee.rest.employee.models.Employee;

@Path("/api/v1/employee/query")
public class EmployeeQueryRest {


    @Path("/get/one/{empId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("empId") Long empId) {
        return null;
    }

    @Path("/get/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAll() {
        return null;
    }

}
