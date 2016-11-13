package com.fosmanhost.lendinglibrary.models;

import java.util.ArrayList;

import com.fosmanhost.lendlibrary.utilities.LoanStatus;

public class LoansRegistry
{;
private ArrayList<Loan> registry;

//Constructor
public LoansRegistry()
{
	registry = new ArrayList<Loan>();
}

// add loan method
public void addLoan(Loan loan) throws LoanAlreadyExistsException
{
	if(registry.contains(loan))
	{
		throw new LoanAlreadyExistsException();
	}
	registry.add(loan);	
}

// find Loan method
public Loan findBook(String id) throws LoanNotFoundException
{
	for(Loan loan: registry)
	{
		if(loan.getBook().getId().equals(id) && loan.getStatus() == LoanStatus.CURRENT)
		{
			return loan;
		}
	}
	throw new LoanNotFoundException();
}

// check if book is on loan
//public boolean isBookOnLoan(String id)
public String isBookOnLoan(String id)
{
	try {
		Loan foundLoand = findBook(id);
		//return true;
		return "This is on not loan";
	}	
	catch(LoanNotFoundException e)
	{
		//return false;
		return "Sorry, This book is on loan"; 
	}

}

}



