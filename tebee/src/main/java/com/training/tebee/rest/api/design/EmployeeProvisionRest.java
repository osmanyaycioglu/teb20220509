package com.training.tebee.rest.api.design;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/api/v1/employee/provision")
public class EmployeeProvisionRest {

    @Path("/activate")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String activate(Employee employeeParam) {
        return "OK";
    }

    @Path("/deactivate/{empId}")
    @GET
    public String deactivate(@PathParam("empId") Long empId) {
        return "OK";
    }

    @Path("/suspend/{empId}")
    @GET
    public String suspend(@PathParam("empId") Long empId) {
        return "OK";
    }


}
