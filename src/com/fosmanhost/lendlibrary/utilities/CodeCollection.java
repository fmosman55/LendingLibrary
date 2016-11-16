/*//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:02/11/2016............................End of the course will be.......


//This is the important code collection class that I use it to collect any code that I see as interesting or necessary.

package com.fosmanhost.lendlibrary.utilities;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CodeCollection {
	// this code shows a good way of how to use the Java Calendar by using GregorianCalendar
	
	Date today = new Date();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM YYY");
	GregorianCalendar gCal = new GregorianCalendar(2016,10,10);
	
	gCal.add(GregorianCalendar.AM_PM,307);
	today =  gCal.getTime();

	System.out.println(sdf.format(today));
	System.out.println(sdf.format(today));
	//System.out.println(gCal);
	
	double d = 1.2345;
	Locale swiss = new Locale("fr","ch");// this is how to add unlisted currency code in Java NUMBERFORMAT
	Locale somali = new Locale("SOS","SO");// this is how to add unlisted currency code in Java NUMBERFORMAT
	
	
	NumberFormat nf = NumberFormat.getCurrencyInstance();// this is for any local currency based on computer's local area
	NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH); // this for particular country.
	NumberFormat nf2 = NumberFormat.getCurrencyInstance(swiss);
	NumberFormat nf3 = NumberFormat.getCurrencyInstance(somali);
	System.out.println(nf.format(d));
	System.out.println(nf1.format(d));
	System.out.println(nf2.format(d));
	System.out.println(nf3.format(d));
	
	
	
	
	

}
*/