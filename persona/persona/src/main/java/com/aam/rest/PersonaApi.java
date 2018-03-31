package com.aam.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aam.rest.dao.Persona;

@Path("/servicioPersonas")
public class PersonaApi {

	
	@POST @Path("/new")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPersona(Persona persona) {
		 persona.getNombre();
		 persona.getApellido();
	}

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Persona getPersona() {
		Persona persona = new Persona();
		persona.setApellido("Agudelo");
		persona.setNombre("Alejandro");
		return persona;
	}
	
	@GET
	@Path("/print/{name}")
	@Produces({MediaType.APPLICATION_JSON})
	public Persona produceJSON( @PathParam("name") String name ) {

		Persona st = new Persona();
		st.setNombre(name);
		st.setApellido("Agudelo");
		return st;

	}

}
