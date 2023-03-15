package org.dev;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class TestRestApi {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML() {
		
		String resource="<?xml version='1.0' ?>"+
		"<hello> Hi Krishna, This is Hello from XML</hello>";
		return resource;
	}
}
