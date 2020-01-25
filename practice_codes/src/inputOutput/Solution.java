
package inputOutput;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if(N%2!=0)
		{
			System.out.println("Weird");

		}
		else if((N>2 && N<5) && (N%2==0))
		{
			System.out.println("Not Weird");
		}
		else if(N<20 && N>6) 
		{
			
			System.out.println("Weird");
		}
		else if(N>20)
		{
			System.out.println("Not Weird");
		}
		else
			System.out.println("enter valid number");


		scanner.close();
	}
}