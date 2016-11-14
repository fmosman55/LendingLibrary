package com.fosmanhost.lendinglibrary.ui;

import java.util.TreeMap;

import com.fosmanhost.lendinglibrary.models.Book;
import com.fosmanhost.lendinglibrary.models.DVD;
import com.fosmanhost.lendinglibrary.models.Material;
import com.fosmanhost.lendinglibrary.models.MaterialCatalog;
import com.fosmanhost.lendinglibrary.models.MaterialNotFoundException;

public class MaterialCatalogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaterialCatalog materialCatalog = new MaterialCatalog();
		
		Book book1 = new Book("100","An Introducaton to Java","Faisal Osman","887766","Dagenham Heathway",250);
		DVD dvd1 = new DVD("123","More Java","Harringay","Qorane","32",120);
		//materialCatalog.addBook(book1);
		materialCatalog.addMaterial(book1);
		materialCatalog.addMaterial(dvd1);
		
		//System.out.println(book1.toString());
		//System.out.println(dvd1.toString());
		
		TreeMap<String, Material> myMap = materialCatalog.getMap();
		for(Material nextMaterial: myMap.values())
		{
			System.out.println(nextMaterial.getTitle());
		}
	
		// find Method
		try {
		Material foundMaterial = materialCatalog.findMaterial("More Java");
		System.out.println("Waa kan shaygii la helay : "+ foundMaterial.getTitle()+" with Id No :"+foundMaterial.getId());
		}
		catch(MaterialNotFoundException e)
		{
			System.out.println("shaygaan lama helin ");
		}
	}

}
