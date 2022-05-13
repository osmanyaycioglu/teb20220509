package com.training.tebee.rest.employee.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.training.tebee.rest.employee.models.Employee;
import com.training.tebee.rest.employee.services.EmployeeQueryService;

@Path("/api/v1/employee/query")
public class EmployeeQueryRest {

    @EJB
    private EmployeeQueryService eqs;

    @Path("/get/one/{empId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("empId") Long empId) {
        return eqs.getOneEmployee(empId);
    }

    @Path("/get/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAll() {
        return eqs.getAll();
    }

    @Path("/get/by/surname/{sur}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployee(@PathParam("sur") String surname) {
        return eqs.getEmployeesBySurname(surname);
    }


}
