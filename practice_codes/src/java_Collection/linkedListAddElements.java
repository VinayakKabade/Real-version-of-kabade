package java_Collection;

import java.util.LinkedList;

public class linkedListAddElements {
	// Main method
	public static void main(String[] args) {

		// Creating a LinkedList objec
		LinkedList<String> list = new LinkedList<String>();

		// Adding an element at the last
		list.add("one");

		// Adding an element at the last
		list.add("two");

		// Adding an element at the last
		list.add("three");

		// Adding an element at the last
		list.add("one");
		list.add("one");list.add("one");list.add("one");

		list.addLast("one_to_one");

		System.out.print("List before removing the " + "first Occurrence of \"one\" : ");

		// Printing the list
		System.out.println(list);
		
		
		

		// Removing first occurrence of one.
		boolean returnValue = list.removeFirstOccurrence("one");

		// Printing the returned value
		System.out.println("Returned Value : " + returnValue);

		System.out.print("List after removing the" + " first Occurrence of \"one\" : ");

		// Printing the list
		System.out.println(list);
		
		list.add("one");list.add("one");list.add("one");

		list.removeLastOccurrence("one");

		System.out.print("List after removing the " + "Last Occurrence of \"one\" : ");

		// Printing the list
		System.out.println(list);
		
	}
}