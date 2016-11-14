//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:07/11/2016............................End of the course will be.......


//This is the DVD class of the Lending Library Application.
package com.fosmanhost.lendinglibrary.models;

public class DVD extends Material
{
	
private String director;
private String catalogNo;
private int runningTime;
private boolean licenced;

public DVD(String id, String title, String branch, String director, String catalogNo, int runningTime)
{
	super(id, title, branch);
	this.director = director;
	this.setCatalogNo(catalogNo);
	this.runningTime = runningTime;
	licenced = false;
}

public void licence()
{
	licenced = true;
	
}
public boolean lend(Customer customer)
{
	if(licenced)
	{
		return super.lend(customer);
	}
	else {
		return false;
	}
	
}

//Overriden Method
public String getLoanPeriod()
{return "21";}

public String getCatalogNo() {
	return catalogNo;
}

public void setCatalogNo(String catalogNo) {
	this.catalogNo = catalogNo;
}

@Override
public String toString()
{
	return "DVD: "+getId()+" "+getTitle() +" / "+director;
	
}
}
