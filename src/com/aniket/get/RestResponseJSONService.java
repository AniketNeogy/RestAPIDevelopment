package com.aniket.get;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.aniket.domain.Book;
import com.aniket.utility.BookCreator;

@Path("/getResponseJSON")
public class RestResponseJSONService {
	
	@Produces(MediaType.APPLICATION_JSON)
	@GET()
	public List<Book> getBookAsXML(@Context HttpHeaders httpHeader) {
		
		List<Book> books = BookCreator.getBooks();
		return books;
		
	}

}
