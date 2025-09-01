package Swingprojects;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Regexform implements ActionListener {
	
	Scanner s1=new Scanner(System.in);
	
	
	
	
	JFrame jf;
	JLabel l1,l2,l3;
	JTextField jtxt1,jtxt2,jtxt3;
	JButton btn1;
	
	static String url="jdbc:mysql://localhost:3306/USERDETAILS";
	static String username="root";
	static String password="root";
	 Connection conn;
	
	
	
	
	
	Regexform()
	{
		
		
		
		
		try
		{
			conn=DriverManager.getConnection(url,username,password);
			System.out.println("connection establish");
		}

		catch(SQLException e)
		{
			System.out.println("connection not established");
		}
		
		
		
		
		
		
		
		
		
		
		
		jf=new JFrame();
		jf.setSize(600, 600);
		jf.setTitle("Student from using validation ");
		
		l1=new JLabel("Enter your name ");
		l1.setBounds(70, 100, 200, 30);
		l1.setFont(new Font("arial",Font.BOLD,22));
		
		jtxt1=new JTextField();
		jtxt1.setBounds(300, 100, 200, 30);
		jtxt1.setFont(new Font("arial",Font.BOLD,22));
		
		
		 l2=new JLabel("Enter your Email");
		 l2.setBounds(70, 200, 200, 30);
		 l2.setFont(new Font("arial",Font.BOLD,22));
		 
		 
		 jtxt2=new JTextField();
		 jtxt2.setBounds(300, 200, 200, 30);
		jtxt2.setFont(new Font("arial",Font.BOLD,22));
		 
		 
		 l3=new JLabel("Enter contact no.");
		 l3.setBounds(70, 300, 200, 30);
		 l3.setFont(new Font("arial",Font.BOLD,22));
		 
		 
		 jtxt3=new JTextField();
		 jtxt3.setBounds(300, 300, 200, 30);
		jtxt3.setFont(new Font("arial",Font.BOLD,22));
		 
		 btn1=new JButton("submit");
		 btn1.setBounds(200, 400, 100, 30);
		 btn1.addActionListener(this);
		 
		
		
		
		jf.add(l1);
		jf.add(jtxt1);
		jf.add(l2);
		jf.add(jtxt2);
		jf.add(l3);
		jf.add(jtxt3);
		jf.add(btn1);
		
		
		jf.setLayout(null);
		jf.setVisible(true);
		
		
		
		
		
		
		
		
	
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = jtxt1.getText();
		String emailaddress=jtxt2.getText();
		String contactno=jtxt3.getText();
		
		try
		{
		String query ="insert into USER(name,emailaddress,contactno)values(?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.setString(1, name);
		pstmt.setString(2, emailaddress);
		pstmt.setString(3, contactno);
		
		int rows=pstmt.executeUpdate();
		
		if(rows>0)
		{
			JOptionPane.showMessageDialog(null, "data insert succesfully ");
			 jtxt1.setText(""); 
	         jtxt2.setText("");
	         jtxt3.setText("");
		}
		
		else
		{
			System.out.println("data not inserted ");
		}
		
		
		
		
		}
		catch(SQLException a)
		{
			System.out.println("data insertion problem " );
		}
		
		
		
		
		
		
		
	}
	

	
	
	
	public static void main(String [] args)
	{
		new Regexform();
		
		
	}
	
	
	
	
	
	
	
	

}
