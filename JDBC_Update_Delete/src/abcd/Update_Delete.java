package abcd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Update_Delete 
{
	public static void main(String[] args) throws Exception
	{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db" , "root" , "mysql@123");
		System.out.println('1');
	}
}
