package com.aniket.post;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.aniket.domain.Book;
import com.aniket.utility.BookCreator;

@Path("/postResponseJSON")
public class RestRequestJSONService {
	
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Book getBookAsXML(@Context HttpHeaders httpHeader, Book mybook) {
		List<Book> books = BookCreator.getBooks();
		books.add(mybook);
		return mybook;
		
	}

}
