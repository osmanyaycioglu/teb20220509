package com.training.tebee.rest.employee.rest;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.training.tebee.rest.employee.models.Employee;
import com.training.tebee.rest.employee.services.EmployeeProvisionService;

@Path("/api/v1/employee/provision")
@Valid
public class EmployeeProvisionRest {

    @EJB
    private EmployeeProvisionService eps;

    @Path("/activate")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String activate(@Valid Employee employeeParam) {
        if (employeeParam.getName()
                         .equals("osman")) {
            throw new IllegalArgumentException("isim osman olamaz");
        }
        eps.activate(employeeParam);
        return "OK";
    }

    @Path("/deactivate/{empId}")
    @GET
    public String deactivate(@NotEmpty @Positive @PathParam("empId") Long empId) {
        eps.deactivate(empId);
        return "OK";
    }

    @Path("/suspend/{empId}")
    @GET
    public String suspend(@PathParam("empId") Long empId) {
        eps.suspend(empId);
        return "OK";
    }


}
