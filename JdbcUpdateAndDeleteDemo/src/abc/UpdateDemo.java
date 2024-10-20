package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo 
{
	public static void main(String[] args) throws Exception
	{
		String city1 = "Pune";
		String email1 = "amit@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db" , "root" , "mysql@123");
		
		PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
		ps.setString(1 , city1);
		ps.setString(2 , email1);
		
		int i = ps.executeUpdate();
		
		if(i > 0)
			System.out.println("Successfully Updated");
		else
			System.out.println("Unsuccessfully Updated");
		
		con.close();
	}
}
