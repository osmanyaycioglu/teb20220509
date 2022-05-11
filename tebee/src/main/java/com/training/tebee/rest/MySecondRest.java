package com.training.tebee.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/second")
@Produces(MediaType.TEXT_PLAIN)
public class MySecondRest {

    @Path("/hello")
    @GET
    public String helloWorld1() {
        return "Hello GET 1";
    }

    @Path("/hello1a")
    @GET
    public String helloWorld1a() {
        return "Hello GET 1a";
    }

    @Path("/hello")
    @POST
    public String helloWorld2() {
        return "Hello POST";
    }

    @Path("/hello")
    @PUT
    public String helloWorld3() {
        return "Hello PUT";
    }

    @Path("/hello")
    @PATCH
    public String helloWorld4() {
        return "Hello PATCH";
    }

    @Path("/hello")
    @DELETE
    public String helloWorld5() {
        return "Hello DELETE";
    }

}
