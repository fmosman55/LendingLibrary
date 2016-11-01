//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:27/10/2015............................End of the course will be.......


//This is the Book class of the Lending Library Application.
package com.fosmanhost;

public class Book
{
	//Book class attributes
	private int bookId;
	private String title;
	private String author;
	private String isbn;
	
	//Constructions
	public Book(int bookId, String title, String author, String isbn)
	{
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	//Getter Methods
	public int getBookId()
	{
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
//Setter Methods
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	

}
