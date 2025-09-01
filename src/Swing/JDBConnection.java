package Swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBConnection {

	Statement stmt;
	
	JDBConnection()
	{
		
		

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem","root" , "root");
			
			stmt = con.createStatement();
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			
		} catch (SQLException e) {
		
			System.out.println(e);
		}
	
		
	
		
			
			
		
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	
		

	}

}
