package practice_codes;
import java.sql.*;  

public class runSQL_comm 
{
	public static void main(String[] args) 
	{

		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/kbd","vinaykbd3733","Gorilla@123");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from station");  
			while(rs.next())
			{	
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			  System.out.println(rs.getObject(columnLabel));
			
			}
			con.close();
		}
		
		catch(Exception e){ System.out.println(e);}  
	}  

}


