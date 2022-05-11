package com.training.tebee.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/first")
public class MyFirstRest {

    // /tebee/api/first/hello1/deneme --> GET
    @GET
    @Path("/hello1/deneme")
    public String hello1() {
        return "Hello 1";
    }

    // /tebee/api/first/hello1/deneme --> POST
    @POST
    @Path("/hello1/deneme")
    public String hello2() {
        return "Hello 2";
    }

    @GET
    @Path("/greet")
    public String greet() {
        return "Greetings";
    }

}
