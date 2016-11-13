package com.fosmanhost.lendinglibrary.models.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.fosmanhost.lendinglibrary.models.Customer;
import com.fosmanhost.lendinglibrary.models.CustomerNotFoundException;
import com.fosmanhost.lendinglibrary.models.CustomerRecords;
import com.fosmanhost.lendlibrary.utilities.GenderType;

public class CustomerRecordsTest {
	
	CustomerRecords records;
	@Test
	public void testAddCustomer() {
		//fail("Not yet implemented");
		Customer addCustomer1 = new Customer("Mr","Faisal","Osman","99 Bruce Grove","07998866","ridwan@ridwan.com",1200,GenderType.MALE);
		
		
		int initialSize = records.getNumberOfCustomer();
		
		records.addCustomer(addCustomer1);
		
		assertTrue(initialSize == records.getNumberOfCustomer() -1);
	}
	
	//test find method
	@Test
	public void testFindCustomer()
	{
		
		try 
		{
			Customer foundCustomer = records.findByName("Miss Riyaan Osman");
		} 
		catch (CustomerNotFoundException e)
		{
			fail("Customer not found");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
	private void fail(String string) {
		// TODO Auto-generated method stub
		
	}

	//Constructor
	public CustomerRecordsTest()
	{
		records = new CustomerRecords();
		
		Customer addCustomer = new Customer("Miss","Sumaya","Osman","7 London Town","0799886600","sumaya@sumaya.com",1100,GenderType.FEMALE);
		//records.addCustomer(addCustomer);
		records.addCustomer(addCustomer);
		
		//System.out.println(records);
		System.out.println(addCustomer);
		
	}
	

}
