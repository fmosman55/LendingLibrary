//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:27/10/2016............................End of the course will be.......
//This is the BookCatalog class of the Lending Library Application.
package com.fosmanhost.lendinglibrary.models;

import java.util.TreeMap;
public class BookCatalog
{
	//
	/*The Integer class wraps a value of the primitive type int in an object. 
	An object of type Integer contains a single field whose type is int.
	 */
	
	//Constructor
	public BookCatalog()
	{
		bookMap = new TreeMap<String, Book>();
		//bookMap = new TreeMap<String, Book>();
	}
	private TreeMap<String, Book> bookMap;

	public TreeMap<String, Book> getBookMap()
	{
		return bookMap;
	}

	public int getNumberOfBooks()
	{
		return bookMap.size();
	}
	//add book method
	public void addBook(Book newBook)
	{
		bookMap.put(newBook.getId(), newBook);
	}

	//find method
	public Book findBook(String title) throws BookNotFoundException
	{
		title = title.trim();
		for(Book nextBook : bookMap.values())
		{ 
			if(nextBook.getTitle().equalsIgnoreCase(title));
			{
				return nextBook;
			}
		}
		throw new BookNotFoundException();
	}

	@Override
	public String toString() {
		return ""+bookMap;
	}
	
}
