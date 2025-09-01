package crudoperation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcpratice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails","root" , "root");
		System.out.println(con);
		
		
		
	Statement stmt = con.createStatement();
	
	
	String query="insert into user(name,emailaddress,contactno)values('sachin','sachin@gmail.com',234567)";
	 int rows = stmt.executeUpdate(query);
	 if(rows==1)
	 {
		 System.out.println("data insert succesfully ");
	 }
	 else
	 {
		 System.out.println("data insertion failed");
	 }
	
		
		
	}

}
