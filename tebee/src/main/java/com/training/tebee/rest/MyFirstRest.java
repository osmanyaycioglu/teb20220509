package com.training.tebee.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.training.tebee.ejb.MySingletonEJB;
import com.training.tebee.ejb.MyStatefulEJB;
import com.training.tebee.ejb.MyStatelessEJB;

@Path("/first")
@RequestScoped
// @SessionScoped
// @ApplicationScoped
public class MyFirstRest {

    private int            localCounter = 0;

    @EJB
    private MySingletonEJB mySingletonEJB;

    @EJB
    private MyStatefulEJB  myStatefulEJB1;

    @EJB
    private MyStatefulEJB  myStatefulEJB2;

    @EJB
    private MyStatelessEJB myStatelessEJB;

    // /tebee/api/first/hello1/deneme --> GET
    @GET
    @Path("/hello1/singleton")
    public String hello1() {
        localCounter++;
        return "Hello " + mySingletonEJB.getCounter() + " local : " + localCounter;
    }

    @GET
    @Path("/hello1/stateful")
    public String stateful() {
        localCounter++;
        return "Stateful1 :  "
               + myStatefulEJB1.getCounter()
               + " local : "
               + localCounter
               + " Stateful2 :  "
               + myStatefulEJB2.getCounter();
    }

    // Havuzda 3 instance var i1 i2 i3
    @GET
    @Path("/hello1/stateless")
    public String stateless() {
        localCounter++;
        return "stateless1 :  "
               + myStatelessEJB.getCounter()
               + " local : "
               + localCounter
               + " stateless : "
               + myStatelessEJB.getCounter();
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
