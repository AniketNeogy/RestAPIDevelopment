package practice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.aniket.domain.Book;

@Path("/getJSON")
public class RestJSONService {
	
	@Produces(MediaType.APPLICATION_JSON)
	@GET()
	public Book getBookAsJson(@Context HttpHeaders httpHeader) {
		
		Book Book1 =new Book("Head First Java", 1);
		return Book1;
		
	}

}
