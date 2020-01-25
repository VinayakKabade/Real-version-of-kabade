import java.sql.*;
public class sqlCodes
{

	public static void main(String[] args) throws ClassNotFoundException 
	 {
		Class.forName("sql");

	}

}
class sql
{
	static
	{
		System.out.println("in static");
		
	}
	{
		System.out.println("in ");
	}
}
