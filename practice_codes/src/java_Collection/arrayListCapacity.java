package java_Collection;

import java.util.*;
import java.util.Iterator;


public class arrayListCapacity {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("aaaaaaaaaaaaaaAaAAAAA");
		list.add("aakk");
		Iterator<String> itr=list.iterator();       //    Iterator itr=list.iterator(); 
		while(itr.hasNext())
		{
			System.out.println("array list are :"+itr.next());
			                                        
		}
		
		/*********************** iterating using for loop*****************/
		System.out.println("size of an array "+list.size());
		
		 for(int i=0;i<list.size();i++)  
         {  
          System.out.println(list.get(i));     // we can get i value using list.get(i)
         }  
		 
		 
		 System.out.println("Traversing list through forEachRemaining() method:");  
         Iterator<String> itr1=list.iterator();  
         
         
         /* forEachRemaining() method of Java Interface Spliterator  
        is used to performs the given action for each remaining element
        sequentially in the current thread until all elements have been processed or the action throws an exception.*/
         
         
         itr1.forEachRemaining(a-> //Here, we are using lambda expression  //
         {  
       System.out.println(a);  
         }); 
	}

}