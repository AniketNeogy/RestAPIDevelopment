package com.aniket.utility;

import java.util.ArrayList;
import java.util.List;

import com.aniket.domain.Book;

public class BookCreator {
	
	static List<Book> books = new ArrayList<Book>();

	public static List<Book> getBooks(){
		return books;
	}
	
	public static void addBooks(Book mybook){
		books.add(mybook);
	}
	
}
