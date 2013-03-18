package com.petstagram;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/petstagram")
public class Consultas {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		 
		String output = "Pestagram le gustan los perros : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
}
