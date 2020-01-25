package java_Collection;

public class Sample_String
{
	public static void main(String[] args)
	{
		String str_Sample = "This is a String contains Example";
		
		//Check if String contains a sequence
		System.out.println("Contains sequence 'ing': " + str_Sample.contains("ing"));
		
		if(str_Sample.contains("ings"))
			System.out.println(" \"ing\" is in string");
		
		else
			System.out.println("\"ing\" is not in string");
		
		
		System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
		
		//String contains method is case sensitive  
		System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
		
		System.out.println("Contains sequence 'is String': " + str_Sample.contains("is String"));
	}
}