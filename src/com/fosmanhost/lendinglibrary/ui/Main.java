// This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:27/10/2015............................End of the course will be.......

package com.fosmanhost.lendinglibrary.ui;

import com.fosmanhost.lendinglibrary.models.Book;
import com.fosmanhost.lendinglibrary.models.BookCatalog;

public class Main {
	public static void main(String[] args)
	{	
	
		//Book[] bookCatalog= new Book[10];
		BookCatalog bookCatalog = new BookCatalog();

		Book book1 = new Book(1,"Better in Java", "Faisal Osman","12345");
		Book book2 = new Book(2,"More Better in Java", "Abdul Hussein", "34567");
		
		//bookCatalog[0] = book1;
		//bookCatalog[1] = book2;
		
		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);
		
		UI ui = new UI();
		
		ui.printHeader();
		
		ui.printBookCatalog(bookCatalog.getBookArray());
		
		Book foundBook = bookCatalog.findBook("Better in Java");
		
		if(foundBook != null)
		{
			System.out.println("We found your book of: "+foundBook.getTitle());
		}
		/*else {
			System.out.println("Sorry!! We cound not find the book you are looking for:");
		}*/
		
	}
}   


