package com.fosmanhost.lendinglibrary.models;
//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:07/11/2016............................End of the course will be.......

//This is the superclass class (called Material) of the Lending Library Application.

// abstract class. Abstract classes cannot instantiated (such as Material material = new Material) 
//and they are a way of restricting programming loop-holes.
public abstract class Material 
{
	private int id;
	private String title;
	private String branch;
	private Customer borrower;

	public Material(int id, String title, String branch) {
		//super();
		this.id = id;
		this.title = title;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getBranch() {
		return branch;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void relocate(String newBranch)
	{
		this.branch = newBranch;
	}

	public boolean lend(Customer customer)
	{
		if(borrower ==null)
		{
			borrower = customer;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//an abstract method which must be overriden in child classes
public abstract int getLoanPeriod();

//toString Method
public String toString()
{
	return getTitle();
}

//equals() method that compare two strings
public boolean equals(Object obj)
{
	if(obj==null)
	{
		return false;
	}
	if(getClass() == obj.getClass())
	{
		Material otherClass = (Material)obj;
		if(id==otherClass.id)
		return true;
	}
else
{
	return false;
}
	return false;
}
}