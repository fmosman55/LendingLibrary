package com.fosmanhost.lendinglibrary.models.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.fosmanhost.lendinglibrary.models.Book;
import com.fosmanhost.lendinglibrary.models.BookCatalog;
import com.fosmanhost.lendinglibrary.models.BookNotFoundException;

public class BookCatalogTest {

	//global variables
	private BookCatalog bc;
	private Book book1;
	
	
	public BookCatalogTest()
	{
		bc = new BookCatalog();
		book1 = new Book("1","","","","",10);
		bc.addBook(book1);
	}
	// add a book test method
	@Test
	public void testAddABook() {

		//BookCatalog bc = new BookCatalog();
		int initialNumber = bc.getNumberOfBooks();

		Book book = new Book("2","","","","",10);
		bc.addBook(book);

		assertTrue(initialNumber == bc.getNumberOfBooks() -1);
	}
	
	//find a book test method
	
    @Test
	public void testFindABook() {

		//BookCatalog bc = new BookCatalog();
		//int initialNumber = bc.getNumberOfBooks();

		//Book book = new Book(1,"learning Java","","","",10);
		//bc.addBook(book);
		try
		{
			Book founndbook  = bc.findBook("Learning Java");
		}
		catch (BookNotFoundException e)
		{  
			System.out.println("Something Went Wrong");
			
		}

	}
    
    //ignore case
    @Test
  	public void testFindABookIgnoreCase() {

  		//BookCatalog bc = new BookCatalog();
  		//int initialNumber = bc.getNumberOfBooks();

  		//Book book = new Book(1,"learning Java","","","",10);
  		//bc.addBook(book);
  		try
  		{
  			Book founndbook  = bc.findBook("learning Java");
  		}
  		catch (BookNotFoundException e)
  		{  
  			System.out.println("Something Went Wrong");
  			
  		}

  	}
	
	
	//find a book that does not exist method.
	//@Test(expected = BookNotFoundException.class)
   /* @Test(expected = BookNotFoundException.class)
	public void testFindABookThatDoestntExist() throws BookNotFoundException
	{
		BookCatalog bc = new BookCatalog();
		
		Book book = new Book(1,"learning Java","","","",10);
		bc.addBook(book);
		
		Book foundBook  = bc.findBook("learning More Java");

		
	}*/

}
