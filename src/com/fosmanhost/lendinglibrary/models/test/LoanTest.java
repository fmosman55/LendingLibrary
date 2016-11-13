//JUnit test class
package com.fosmanhost.lendinglibrary.models.test;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Test;

import com.fosmanhost.lendinglibrary.models.Book;
import com.fosmanhost.lendinglibrary.models.Customer;
import com.fosmanhost.lendinglibrary.models.Loan;
import com.fosmanhost.lendlibrary.utilities.GenderType;

public class LoanTest {

	@Test
	public void testDueDate() 
	{
		Book book = new Book("0","","","","",20);
		Customer customer = new Customer("","","","","","",1,GenderType.MALE);
		
		Loan loan =  new Loan(1,customer,book);
		
		GregorianCalendar gcExpected = new GregorianCalendar();
		gcExpected.add(GregorianCalendar.DAY_OF_WEEK,14);
		
		GregorianCalendar gcActual = new GregorianCalendar();
		gcActual.setTime(loan.getDueDate());
		
		//AssertEquals
		//assertEquals();
		assertEquals("Checking Year",gcExpected.get(GregorianCalendar.YEAR),gcActual.get(GregorianCalendar.YEAR));
		assertEquals("Checking Month",gcExpected.get(GregorianCalendar.MONTH),gcActual.get(GregorianCalendar.MONTH));
		assertEquals("Checking Day",gcExpected.get(GregorianCalendar.DAY_OF_WEEK),gcActual.get(GregorianCalendar.DAY_OF_WEEK));
		
		//Date expectedDueDate = gc.getTime();
	}

}
