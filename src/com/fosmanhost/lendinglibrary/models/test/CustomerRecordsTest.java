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
		Customer newCustomer = new Customer("Mr","Faisal","Osman","99 Bruce Grove","07998866","ridwan@ridwan.com",1200,GenderType.MALE);
		
		
		int initialSize = records.getNumberOfCustomer();
		
		//records.addCustomer(customerRecords);
		records.add(newCustomer);
		//assertTrue(initialSize == records.getNumberOfCustomer() -1);
		assertTrue(initialSize == records.getNumberOfCustomer() -1);
	}
	
	//test find method
	@Test
	public void testFindCustomer()
	{
		
		try 
		{
			Customer foundCustomer = records.findByName("Mr Ridwan Osman");
			System.out.println(foundCustomer);
			
	
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
		
		Customer newCustomer = new Customer("Miss","Sumaya","Osman","7 London Town","0799886600","sumaya@sumaya.com",1100,GenderType.FEMALE);
		//records.addCustomer(addCustomer);
		records.add(newCustomer);
		
		//System.out.println(records);
		System.out.println(newCustomer);
		
	}
	

}
