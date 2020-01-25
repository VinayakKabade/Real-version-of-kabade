package java_Collection;

import java.util.HashSet;

public class removeIfFunction {

	public static void main(String[] args) 
	{
	    // create an ArrayList which going to 
        // contains a list of Numbers 
		HashSet<Object> Numbers = new HashSet<>(); 
  
        // Add Number to list 
		Numbers.add(23); 
        Numbers.add(32); 
        Numbers.add(45); 
        Numbers.add("Vinayak");
        Numbers.add("Kabade");
        Numbers.add("rocket");
        //Numbers.clear();
        
  
        // apply removeIf() method 
        // we are going to remove numbers divisible by 3 
      //Numbers.removeIf(n -> Numbers.contains("Vinayak"));
      // it checks weather string contains substring--->>>  public boolean String.contains(CharSequence s)
      
        // print list 
        for (Object i : Numbers)
        { 
            System.out.println(i); 
        } 

	}

}
