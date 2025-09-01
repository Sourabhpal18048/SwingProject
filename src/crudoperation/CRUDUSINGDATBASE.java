package crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDUSINGDATBASE {
	Scanner s1=new Scanner(System.in);
	static String url="jdbc:mysql://localhost:3306/CRUD_OPERATION";
	static String username="root";
	static String password="root";
	 Connection conn;
	 int choice;
	
	 CRUDUSINGDATBASE() throws SQLException 
	 
	 {
		 
		 
		 try
			{
				conn=DriverManager.getConnection(url,username,password);
			}
			 catch (SQLException e) 
			 {
				 System.out.println("database connection problem ");
			 }
		 
		 
		 
		 do {
		
		 System.out.println("INSERT DATA");
		 System.out.println("VIEW DATA");
		 System.out.println("UPDATE DATA ");
		 System.out.println("DELETE DATA ");
		 System.out.println("show database");
		 
		 System.out.println();
		 
		 System.out.println("enter your choice ");
		 choice=s1.nextInt();
		 s1.nextLine();
		 
		 
		 switch(choice)
		 {
		 
		 case 1:
			 addstudent();
			 break;
			 
		 case 2:
			 viewstudent();
			 break;
			 
		 case 3:
			 updatestudent();
			 break;
			 
		 case 4:
			 deletestudent();
			 break;
			 
		 case 5:
			 showdatabase();
			 break;
			 
			 
		 case 6: 
			 System.out.println("exit program ");
			 default:
				 System.out.println("invalid choice  ");
				 
				 
			if(choice!=6)
			{
				System.out.println("click enter to continue ");
				
			}
			
				 
				 
		 
		 	
		 
		 }
		
		 
		 
		 
		 
		 
		 
		 
		 }
		 while(choice!=5);
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
	 	 } 

	 
	 
	private void showdatabase() throws SQLException {
	
		String query = "show databases";
		Statement stmt = conn.createStatement();
	ResultSet rs = 	stmt.executeQuery(query);
		while(rs.next())
		{
			String dbname = rs.getString(1);
			System.out.println(dbname);
			
		}
		
	}



	private void deletestudent() throws SQLException {
	
		System.out.println("pls select id no which you want to delete ");
		int id= s1.nextInt();
		
		String query="delete from student where id =?";
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.setInt(1, id);
	int i=	pstmt.executeUpdate();
		if(i>0)
		{
			System.out.println("data delete sucessfully");
		}
		else
		{
			System.out.println("data not delete ");
		}
				
		
		
	}



	private void updatestudent() throws SQLException {

		System.out.println("enter id no which you want to update");
		int id=s1.nextInt();
		System.out.println("enter name ");
		String name=s1.nextLine();
		System.out.println("enter email");
		String emailaddress=s1.nextLine();
		System.out.println("enter contactno");
		String contactno=s1.nextLine();
		
		String query="update student set name=?,emailaddress=?,contactno=?";
		
		PreparedStatement pstmt=conn.prepareStatement(query);
		
		pstmt.setString(1, name);
		pstmt.setString(2, emailaddress);
		pstmt.setString(3, contactno);
		
	int rows=	pstmt.executeUpdate();
	if(rows>0)
	{
		System.out.println("data update sucessfully");
		
	}
	else
	{
		System.out.println("data not update");
	}
		
		
		
		
	}



	private void viewstudent() throws SQLException {
		String query="select * from student";
		PreparedStatement pstmt=conn.prepareStatement(query);
		
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" " +rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			
		}
		rs.close();
		pstmt.close();
		
		
	}



	private void addstudent() throws SQLException {
	
		System.out.println("enter name ");
		String name =s1.nextLine();
		System.out.println("enter email");
		String emailaddress=s1.nextLine();
		System.out.println("enter contactno");
		String contactno=s1.nextLine();
		
		
		String query="insert into student(name,emailaddress,contactno)values(?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.setString(1, name);
		pstmt.setString(2, emailaddress);
		pstmt.setString(3, contactno);
		
		
		int rows=pstmt.executeUpdate();
		if(rows>0)
		
		{
			System.out.println("data insert sucessfully");
		}
		else
		{
			System.out.println("data not inserted");
		}
		
	}































	public static void main(String[] args) throws SQLException {
		
		
	new	CRUDUSINGDATBASE();

	}

}
