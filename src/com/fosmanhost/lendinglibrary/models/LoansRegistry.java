package com.fosmanhost.lendinglibrary.models;

import com.fosmanhost.lendlibrary.utilities.LoanStatus;

public class LoansRegistry
{
	private Loan[] registry;
	private int nextPosition;

	public LoansRegistry()
	{
		registry = new Loan[100];
		nextPosition = 0;
	}


	// add loan method
	public void addLoan(Loan loan) throws LoanAlreadyExistsException
	{
		for(int i =0; i < nextPosition; i++)
		{
			if(registry[i].equals(loan))
			{
				throw new LoanAlreadyExistsException();
			}	
		}
		registry[nextPosition] = loan;
		nextPosition++;
	}

	// find Loan method
	public Loan findBook(int id) throws LoanNotFoundException
	{
		for(int i =0; i < nextPosition; i++)
		{
			if(registry[i].getBook().getId() == id && registry[i].getStatus() == LoanStatus.CURRENT)
			{
				return registry[i];
			}	
		}
		throw new LoanNotFoundException();
	}
	
	// check if book is on loan
	public boolean isBookOnLoan(int id)
	{
		try {
		Loan foundLoand = findBook(id);
		return true;
		}	
		catch(LoanNotFoundException e)
		{
			return false;
		}
		
	}
}


