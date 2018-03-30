package com.aam.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pathHolaMundo")
@Produces(MediaType.APPLICATION_JSON)
public class HolaRest {

	@GET
	@Path("/metodoGet/")
	public Response diHola() {
		return Response.status(200).entity("Hola mundo!!").build();
	}

}
