package com.fosmanhost.lendinglibrary.models;

import java.util.HashSet;

public class CustomerRecords
{
	private HashSet<Customer>records;
	
	//Constructor
	public CustomerRecords()
	{
		records =  new HashSet<Customer>();
	}
	
	//add method
	public void addCustomer(Customer customer)
	{
		records.add(customer);
	}
	
	//find a customer method
	public Customer findByName(String name) throws CustomerNotFoundException
	{  
		for(Customer customer: records)
		{
			if(customer.getMailingName().equals(name))
			{
				return customer;
			}
		}
		throw new CustomerNotFoundException();
	}
	public int getNumberOfCustomer()
	{
		return records.size();
	}
	
}
