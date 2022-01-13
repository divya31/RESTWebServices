package com.jaxrswebservice;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/greeting")
public class HelloWorldService {

    @GET
    public String myGreeting(){
        return "Welcome to the world of REST APIs in Java!";
    }

}
