package practice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@Path("/helloWorld")
public class HelloWorldRestService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{name}")
	public String getGreetings(@Context HttpHeaders httpHeaders,@PathParam("name") String name)
	{
		String greeting = "Hello" + name;
		return greeting;
		
	}

}
