//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:27/10/2015............................End of the course will be.......
//This is the BookCatalog class of the Lending Library Application.
package com.fosmanhost;


public class BookCatalog
{

	private Book[] bookArray = new Book[100];
	private int nextPosition = 0;

	public Book[] getBookArray()
	{
		return bookArray;
	}

	//add book method
	public void addBook(Book newBook)
	{
		bookArray[nextPosition] = newBook;
		nextPosition++;
	}
	
	//find method
	public Book findBook(String title)
	{
		for(int counter = 0; counter <nextPosition; counter++)
		{
			if(bookArray[counter].getTitle().equalsIgnoreCase(title));
			return bookArray[counter];

		}
			return null;
	}
	

}
