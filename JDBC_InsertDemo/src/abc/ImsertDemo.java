package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImsertDemo 
{
	public static void main(String[] args) throws Exception
	{
		String name = "Shyam";
		String email = "amit@gmail.com";
		String password = "amit123";
		String gender = "male";
		String city = "Mumbai";
		
		//1 - Load and Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2 - Create Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db" , "root" , "mysql@123");
		
		//3 - Create Statement
		
		//PreparedStatement ps = con.prepareStatement("insert into register values('Prakhar' , 'prakhar@gmail.com' , 'prakhar123' , 'male' , 'Lucknow')");
		
		//PreparedStatement ps = con.prepareStatement("insert into register values('"+name+"' , '"+email+"' , '"+password+"' , '"+gender+"' , '"+city+"')");
		
		//using positional parameters
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1 , name);
		ps.setString(2 , email);
		ps.setString(3 , password);
		ps.setString(4 , gender);
		ps.setString(5 , city);
		
		//4 - Execute SQL Statement
		int i = ps.executeUpdate();
		
		//5 - Process the result
		
		if(i > 0)
			System.out.println("Success");
		else
			System.out.println("Failure");
		
		//6 - Close the Connection
		
		
	}
}
