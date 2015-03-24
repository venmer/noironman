package ru.mremne.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/{username}")
public class MyResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@PathParam("username")String username) {
        return username;
    }
}
