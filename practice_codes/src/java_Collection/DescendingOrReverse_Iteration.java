package java_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class DescendingOrReverse_Iteration 
{
	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("abcd");
		list.add("efgh");
		list.add("ijkl");

		Iterator<String> ref=list.descendingIterator();

		//Iterator i=ll.descendingIterator();  
		while(ref.hasNext())  
		{  
			System.out.println(ref.next());  
		}
	}
}

