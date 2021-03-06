//This is a course of Java Programming Language course provided by Virtual Pair Programming on Java.
//Author: Fasial Osman and I will be doing this course until I finish it. Wish me LUCK.
//Date:27/10/2016............................End of the course will be.......
//This is the UI class of the Lending Library Application.
package com.fosmanhost.lendinglibrary.ui;

import java.util.Map;
import java.util.TreeMap;

import com.fosmanhost.lendinglibrary.models.Book;
import com.fosmanhost.lendinglibrary.models.Material;

public class UI 
{
	public void printBook(Book book)
	{
		//String bookIdString = String.valueOf(book.getBookId());
		
	System.out.println(fixLengthString(book.getId(),6)+""+fixLengthString(book.getTitle(),20)+""+
	fixLengthString(book.getAuthor(),20));
	}
	
	
	public void printHeader()
	{
		System.out.println("Book   Title                Author");
	}
	
	public String fixLengthString(String start, int length)
	{//TODO: fix string padding problem
		if(start.length() >= length)
		{
			return start.substring(0, length);
		}
		else
		{
			while(start.length() <= length)
			{
				start += " ";
			}
			return start;
		}
		
		
	}
	//This is an example of Method OVERRIDE. This method has the same method name but different attributes and different datatypes
	public String fixLengthString(int start, int length)
	{
		String startString = String.valueOf(start);
		return fixLengthString(startString, length);
		
	}

/*public void printBookCatalog(TreeMap<String, Book> bookCatalog)
{
	for(Book nextBook : bookCatalog.values())
	{
		printBook(nextBook);
	}
	
}*/

//print material catalog
public void printMaterialCatalog(Map<String, Material> map)
{
	for(Material nextMaterial : map.values())
	{
		System.out.println(nextMaterial.toString());
		//printBook(nextMaterial);
	}
	
}

}
