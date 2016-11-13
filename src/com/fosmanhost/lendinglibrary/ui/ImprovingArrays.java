
//This is only for test

//ArrayList:
/* If you don't know how many items are going to be held in your array, 
you may be better off using something called an ArrayList. An ArrayList is a dynamic data structure,
meaning items can be added and removed from the list and it will resize itself. A normal array in java is a static data structure, 
because you stuck with the initial size of your array.
*/

//HashSet


package com.fosmanhost.lendinglibrary.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ImprovingArrays {

	public static void main(String[] args)
	{
		ArrayList<String> myArrayList = new ArrayList<String>();// ArrayList Array
		HashSet<String> myHashSet = new HashSet<String>(); // HashSet Array
		
		//add to ArrayList
		myArrayList.add("my first array");
		myArrayList.add("my Second array");
		myArrayList.add("my third array");
		myArrayList.add("my fourth array");
		//System.out.println(myArrayList);
		
		//add to HashSet Array
		myHashSet.add("my first hashSet");
		myHashSet.add("my second hashSet");
		myHashSet.add("my third hashSet");
		myHashSet.add("my fourth hashSet");
		
		//no dublicates allowed in HashSet Array, so below objects were added to the array
		myHashSet.add("my fourth hashSet");
		myHashSet.add("my fourth hashSet");
		
		System.out.println(myHashSet.size());
		//to remove an item from ArrayList, we need the array position
		myArrayList.remove(1);
		myArrayList.add("my fifth array");
		myArrayList.add(2,"my sixth array");
		
		//to remove an item from HashSet array, we need tbe object name
		myHashSet.remove("my second hashSet");
		myHashSet.add("my fifth hashSet");
		myHashSet.add("my sixth hashSet");
		System.out.println(myHashSet.size());
		//for iteration
		for(int i = 0; i < myArrayList.size(); i++)
		{
			System.out.println(myArrayList.get(i));
		}
		System.out.println(myArrayList.size());	
		
		System.out.println("HashSet objects");
		Iterator<String> myIterator = myHashSet.iterator();
		while(myIterator.hasNext())
		{
			String myString = myIterator.next();
			//HashSet objects
			
			System.out.println(myString);
		}
	}

}
