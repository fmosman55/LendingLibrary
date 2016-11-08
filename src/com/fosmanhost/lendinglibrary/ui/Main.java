// This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:27/10/2016............................End of the course will be.......

package com.fosmanhost.lendinglibrary.ui;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import com.fosmanhost.lendinglibrary.models.Book;
import com.fosmanhost.lendinglibrary.models.BookCatalog;
import com.fosmanhost.lendinglibrary.models.BookNotFoundException;
import com.fosmanhost.lendinglibrary.models.Customer;
import com.fosmanhost.lendinglibrary.models.DVD;
import com.fosmanhost.lendinglibrary.models.Loan;
import com.fosmanhost.lendinglibrary.models.LoanAlreadyExistsException;
import com.fosmanhost.lendinglibrary.models.LoansRegistry;
import com.fosmanhost.lendlibrary.utilities.GenderType;

public class Main {
	public static void main(String[] args)
	{	


		Date today = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM YYY");
		GregorianCalendar gCal = new GregorianCalendar(2016,10,10);

		gCal.add(GregorianCalendar.AM_PM,307);
		today =  gCal.getTime();

		System.out.println(sdf.format(today));
		//System.out.println(gCal);

		Customer customer = new Customer("Mr","Faisal","Osman","123 High Road","12345", "f@f.com",9876,GenderType.MALE);

		System.out.println(customer.getExpiryDate());

		double d = 1.2345;
		Locale swiss = new Locale("fr","ch");// this is how to add unlisted currency code in Java NUMBERFORMAT
		Locale somali = new Locale("SOS","SO");// this is how to add unlisted currency code in Java NUMBERFORMAT


		NumberFormat nf = NumberFormat.getCurrencyInstance();// this is for any local currency based on computer's local area
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH); // this for particular country.
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(swiss);
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(somali);
		System.out.println(nf.format(d));
		System.out.println(nf1.format(d));
		System.out.println(nf2.format(d));
		System.out.println(nf3.format(d));
		System.out.println(nf2.format(d));
		System.out.println("..........................Just a Line........................................");



		//Book[] bookCatalog= new Book[10];
		BookCatalog bookCatalog = new BookCatalog();

		Book book1 = new Book(1,"Better in Java", "Faisal Osman","12345", "Mogadishu", 400);
		Book book2 = new Book(1,"More Better in Java", "Abdul Hussein","34567", "Harringay",450);
		//Book book2 = new Book(2,"More Better in Java", "Abdul Hussein", "34567");
		DVD dvd1 = new DVD(1,"Epic Film about Java in the Jungle", "London","Faisal and Abdul","1234ABC",125);
		DVD dvd2 = new DVD(1,"Epic Film about Java in the Jungle", "London","Faisal and Abdul","1234ABC",125);

		DVD dvd3 = new DVD(2,"Epic Film about Java in the Jungle", "London","Faisal and Abdul","1234ABC",200);
		//bookCatalog[0] = book1;
		//bookCatalog[1] = book2;

		book1.relocate("Harringay London");

		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);

		UI ui = new UI();

		ui.printHeader();

		ui.printBookCatalog(bookCatalog.getBookArray());
		System.out.println();

		System.out.println("..........................For DVD........................................");
		System.out.println(dvd1.lend(customer));
		dvd1.licence();
		//System.out.println(dvd1.getTitle());
		//System.out.println(dvd1.getTitle());
		System.out.println(dvd1.lend(customer));
		System.out.println(dvd1.lend(customer));
		System.out.print("DVDs can be loaned for: "+dvd1.getLoanPeriod()+" days");
		System.out.println();

		System.out.println("..........................For Lending a Book.....................................");


		System.out.println(book1.lend(customer));
		System.out.println(book1.lend(customer));
		System.out.println("Books can be loaned for: "+book1.getLoanPeriod()+" days");
		System.out.println("..........................For find method........................................");


		try {

			Book foundBook = bookCatalog.findBook("Better in Java");
			System.out.println("We found your book of: "+foundBook.getTitle());
		}

		catch (BookNotFoundException e)
		{
			System.out.println("Sorry!! We cound not find the book you are looking for:");
		}

		//lending a book to a customer
		System.out.println("..........................Lending........................................");
		Loan firstLoan = new Loan(1,customer, book1); 
		System.out.println(firstLoan.getDueDate());
		System.out.println(firstLoan);
		
		System.out.println("..........................is Book on loan?........................................");
		
		LoansRegistry registry = new LoansRegistry();
		try {
			registry.addLoan(firstLoan);
			System.out.println("Add Loan worked");
		}
		catch(LoanAlreadyExistsException e)
		{
			System.out.println("Add Loan Failed");
		}
		
		//repeated add loan to check if it fails 
		//LoansRegistry registry = new LoansRegistry();
		try {
			registry.addLoan(firstLoan);
			System.out.println("Add Loan worked");
		}
		catch(LoanAlreadyExistsException e)
		{
			System.out.println("Add Loan Failed");
		}
		System.out.println(registry.isBookOnLoan(book1.getId()));
		firstLoan.endLoan();
		System.out.println(registry.isBookOnLoan(book1.getId()));
	}
}
