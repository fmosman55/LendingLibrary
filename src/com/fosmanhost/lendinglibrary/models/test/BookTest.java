//JUnit Test
package com.fosmanhost.lendinglibrary.models.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fosmanhost.lendinglibrary.models.Book;

public class BookTest {
	Book book1, book2, book3;
	@Before
	public void setup()
	{
		book1 = new Book("100","","","","",200);
		book2 = new Book("100","","","","",200);
		book3 = new Book("102","","","","",200);
	}
	@Test
	public void test2EqualBooks() {
		//fail("Not yet implemented");


		assertTrue(book1.equals(book2));
		Assert.assertEquals(book1, book2);
	}
	@Test
	public void test2NonEqualBooks()
	{


		assertFalse(book1.equals(book3));
	}

}
