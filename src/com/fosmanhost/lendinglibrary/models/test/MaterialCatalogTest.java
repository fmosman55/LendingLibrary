package com.fosmanhost.lendinglibrary.models.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.fosmanhost.lendinglibrary.models.Book;
import com.fosmanhost.lendinglibrary.models.Material;
import com.fosmanhost.lendinglibrary.models.MaterialCatalogMemoryVersion;
import com.fosmanhost.lendinglibrary.models.MaterialNotFoundException;

public class MaterialCatalogTest {

	//global variables
	private MaterialCatalogMemoryVersion bc;
	private Book book1;
	
	
	public MaterialCatalogTest()
	{
		bc = new MaterialCatalogMemoryVersion();
		book1 = new Book("1","","","","",10);
		bc.addMaterial(book1);
	}
	// add a book test method
	@Test
	public void testAddABook() {

		//MaterialCatalog bc = new MaterialCatalog();
		int initialNumber = bc.getNumberOfMaterials();

		Book book = new Book("2","","","","",10);
		bc.addMaterial(book);

		assertTrue(initialNumber == bc.getNumberOfMaterials() -1);
	}
	
	//find a book test method
	
    @Test
	public void testFindAMaterial() {

		//MaterialCatalog bc = new MaterialCatalog();
		//int initialNumber = bc.getNumberOfBooks();

		//Book book = new Book(1,"learning Java","","","",10);
		//bc.addMaterial(book);
		try
		{
			Material founndbook  = bc.findMaterial("Learning Java");
		}
		catch (MaterialNotFoundException e)
		{  
			System.out.println("Something Went Wrong");
			
		}

	}
    
    //ignore case
    @Test
  	public void testFindABookIgnoreCase() {

  		//MaterialCatalog bc = new MaterialCatalog();
  		//int initialNumber = bc.getNumberOfBooks();

  		//Book book = new Book(1,"learning Java","","","",10);
  		//bc.addMaterial(book);
  		try
  		{
  			Material founndbook  = bc.findMaterial("learning Java");
  		}
  		catch (MaterialNotFoundException e)
  		{  
  			System.out.println("Something Went Wrong");
  			
  		}

  	}
	
	
	//find a book that does not exist method.
	//@Test(expected = BookNotFoundException.class)
   /* @Test(expected = BookNotFoundException.class)
	public void testFindABookThatDoestntExist() throws BookNotFoundException
	{
		MaterialCatalog bc = new MaterialCatalog();
		
		Book book = new Book(1,"learning Java","","","",10);
		bc.addMaterial(book);
		
		Book foundBook  = bc.findBook("learning More Java");

		
	}*/

}
