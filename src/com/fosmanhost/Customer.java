//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:27/10/2015............................End of the course will be.......
//This is the customer class of the Lending Library Application.

package com.fosmanhost;

public class Customer
{
	private String title;
	private String firstName;
	private String surName;
	private String address;
	private String phoneNumber;
	private String email;
	private int customerNumer;
	private GenderType gender;
	private boolean isValid;

	public Customer(String title, String firstName, String surName, String address, String phoneNumber, 
			String email, int customerNumber, GenderType gender)
	{
		setName(title, firstName, surName, address, phoneNumber, email, customerNumber, gender);
		this.title = title;
		this.firstName =  firstName;
		this.surName = surName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email =  email;
		this.gender = gender;
		this.isValid = true;

	}

	public void setName(String title, String firstName, String surName, String address, String phoneNumber, 
			String email, int customerNumber, GenderType gender)
	{
			/*this.title = title;
			this.firstName =  firstName;
			this.surName = surName;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.email =  email;
			this.gender = gender;
			this.isValid = true;*/
	}

	public String getMailingName()
	{
		//String mailingName;
		String mailingName  = title+" "+ firstName.substring(0, 1) +" "+surName+ " "+address+
				" "+phoneNumber+" "+email+" "+gender;
		return mailingName;
	}

	//getter Methods
	public String getTitle() {
		return title;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSurName() {
		return surName;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public int getCustomerNumer() {
		return customerNumer;
	}

	public GenderType getGender() {
		return gender;
	}

	public boolean isValid() {
		return isValid;
	}
	// setter Methods
	public void setTitle(String title) {
		this.title = title;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCustomerNumer(int customerNumer) {
		this.customerNumer = customerNumer;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
}
