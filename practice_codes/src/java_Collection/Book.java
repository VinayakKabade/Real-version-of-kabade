package java_Collection;

import java.util.ArrayList;
import java.util.List;

class Book 
{
	int rollNum;
	String Name;
	Object USN;

	public Book(int rollNum, String Name, Object USN) 
	{
		this.rollNum = rollNum;
		this.Name = Name;
		this.USN = USN;
	}

	public static void main(String[] args) 
	{
		List<Book> list = new ArrayList<Book>();
		Book b1 = new Book(100, "vinayak", "1jb15me105");
		Book b2 = new Book(101, "ramesh", "1jb15me107");
		Book b3 = new Book(102, "rahul", "1jb15me109");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		
		for (Book b : list)
		{
			System.out.println(b.Name + " " + b.rollNum + " " + b.USN);
		}
	}
}
