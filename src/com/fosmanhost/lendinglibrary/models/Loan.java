//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:07/11/2016............................End of the course will be.......

//This is a Loan Class of the Lending Library Application.



package com.fosmanhost.lendinglibrary.models;

import java.util.Date;
import java.util.GregorianCalendar;

import com.fosmanhost.lendlibrary.utilities.LoanStatus;



public class Loan
{	
private int id;
	private Customer customer;
	private Book book;
	private Date startDate;
	private Date dueDate;
	private Date returnDate;
	private LoanStatus status;
	
 //Construction
	public Loan(int id, Customer customer, Book book) {
		super();
		this.id = id;
		this.customer = customer;
		this.book = book;
		startDate = new Date();
		
		GregorianCalendar gCal = new GregorianCalendar();
		//gCal.add(GregorianCalendar.DAY_OF_WEEK, 14);
		gCal.add(GregorianCalendar.DAY_OF_MONTH,7);
		this.dueDate = gCal.getTime();
		
		status = LoanStatus.CURRENT;
	}

	@Override
	public String toString() {
		//return "Loan [id=" + id + ", customer=" + customer.getMailingName() + ", book=" + book.getTitle() + "]";
		
		return "The Book Id No: " + id +", " + book.getTitle()+ ", Lended to: " + customer.getMailingName() ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		return true;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Book getBook() {
		return book;
	}

	public Date getDueDate() {
		return dueDate;
	}
	public void endLoan()
	{
		returnDate = new Date();
		status = LoanStatus.HISTORY;
	}
	
	public LoanStatus getStatus()
	{
		return status;
	}
	

}
