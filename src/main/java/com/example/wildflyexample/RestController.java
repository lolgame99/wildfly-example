package com.example.wildflyexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("")
public class RestController {
    @GET
    @Produces("text/html")
    @Path("/date")
    public Response date() {
        String output = "<h3>The current date and time is:</h3><br>";
        output += "<p>"+ new Date() + "</p>";
        return Response.ok(output).build();
    }
}
