package java_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class sampl_C1
{

	public static void main(String[] args) 
	{
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add(" kbd_Ajay");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}
