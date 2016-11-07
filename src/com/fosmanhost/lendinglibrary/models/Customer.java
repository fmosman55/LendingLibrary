//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:27/10/2016............................End of the course will be.......
//This is the customer class of the Lending Library Application.

package com.fosmanhost.lendinglibrary.models;

import java.util.Date;
import java.util.GregorianCalendar;

import com.fosmanhost.lendlibrary.utilities.GenderType;

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
	private Date expiryDate; // this will finally set a time of expiry date

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
		
		// This GregorianCalendar creates a one year expiry date
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.add(GregorianCalendar.YEAR, 1);
		this.expiryDate = gCal.getTime();

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
	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}



	@Override
	public String toString() {
		return "Customer Details:" + getMailingName();
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + customerNumer;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + (isValid ? 1231 : 1237);
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (customerNumer != other.customerNumer)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender != other.gender)
			return false;
		if (isValid != other.isValid)
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
