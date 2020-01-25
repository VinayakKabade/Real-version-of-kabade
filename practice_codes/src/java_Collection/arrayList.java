package java_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		// Traversing list through Iterator
		/*Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());   
		} */
		
		/* using for loop
		for(String list1:list )
		System.out.print(list1); */
	}


}
