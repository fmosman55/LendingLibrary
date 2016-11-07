//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:27/10/2016............................End of the course will be.......


//This is the Book class of the Lending Library Application.
package com.fosmanhost.lendinglibrary.models;

public class Book extends Material
{
	//Book class attributes

	private String author;
	private String isbn;
	private int noOfPages;
	
	//Constructions
	public Book(int id, String title, String author, String isbn, String branch, int noOfPages)
	{

		super(id, title, branch);
		this.author = author;
		this.isbn = isbn;
		this.noOfPages =  noOfPages;
	}
	
	//Getter Methods




	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
//Setter Methods


	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	
	//book repair method
	public void sendForRepair()
	{
		System.out.println("Boo has been sent for repair");
	}
	
	//Overriden Method
	public int getLoanPeriod()
	{return 7;}

}
