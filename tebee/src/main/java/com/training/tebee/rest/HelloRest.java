package com.training.tebee.rest;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class HelloRest {

    // Path den parametre alma yolu 1
    // /tebee/api/hello/greet1/mehmet/talas
    @Path("/greet1/{abc}/{xyz}")
    @GET
    public String hello1(@PathParam("abc") String name,
                         @PathParam("xyz") String surname) {
        return "Hello 1 " + name + " " + surname;
    }

    // Path den parametre alma yolu 2
    // /tebee/api/hello/greet2?isim=ali&soy=veli
    @Path("/greet2")
    @GET
    public String hello2(@QueryParam("isim") String name,
                         @QueryParam("soy") String surname) {
        return "Hello 2 " + name + " " + surname;
    }

    // /tebee/api/hello/greet3/orhan?soy=veli
    @Path("/greet3/{ret}")
    @GET
    public String hello3(@PathParam("ret") String name,
                         @QueryParam("soy") String surname) {
        return "Hello 3 " + name + " " + surname;
    }

    @Path("/greet4")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String hello4(Person person) {
        return "Hello 4 " + person;
    }

    @Path("/greet5")
    @POST
    public String hello5(@FormParam("ret") String name,
                         @FormParam("soy") String surname) {
        return "Hello 5 " + name + " " + surname;
    }

    @Path("/greet6")
    @GET
    public String hello6(@HeaderParam("ret") String name,
                         @HeaderParam("soy") String surname) {
        return "Hello 6 " + name + " " + surname;
    }

    @Path("/greet7/{name}/{surname}")
    @GET
    public String hello7(@BeanParam Person person) {
        return "Hello 7 " + person;
    }

    @Path("/greet8")
    @GET
    public String hello8(@MatrixParam("ret") String name,
                         @MatrixParam("soy") String surname) {
        return "Hello 8 " + name + " " + surname;
    }

}
