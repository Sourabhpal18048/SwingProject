package Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Updateemployee implements ActionListener   {

	JFrame jf;
	
	
	
	
	
	
	
	JTextField edubox, jtxt2,jtxt3,addtxt,phtxt,emailtxt,designationtxt;
	JLabel  jtxt1,celender,aadhartxt;
	JLabel empid;
	JButton btn1,btn2;
	String employeid1;
	
	 Updateemployee(String employeid1)
	 {
	
		 this.employeid1=employeid1;
		  jf = new JFrame();
		 jf.setSize(1100, 900);
		 jf.setLocation(50, 0);
		 
	
		 
		 
		 JLabel l1 = new JLabel("Update Employee Details");
		 l1.setBounds(450, 20, 250, 50);
		 l1.setFont(new Font("ralewaay", Font.BOLD, 20));
		 
		 JLabel namelable = new JLabel("Name");
		 namelable.setBounds(40, 80, 100, 50);
		 namelable.setFont(new Font("raleway", Font.BOLD, 30));
		 
		  jtxt1 = new JLabel();
		 jtxt1.setBounds(150, 92, 150, 30);
		 jtxt1.setFont(new Font("raleway", Font.BOLD, 20));
		 
		 
		 
		 
		 JLabel fathernamelable = new JLabel(" Father's Name");
		 fathernamelable.setBounds(420, 80, 350, 50);
		 fathernamelable.setFont(new Font("raleway", Font.BOLD, 30));
		 
		  jtxt2 = new JTextField();
		 jtxt2.setBounds(800, 92, 150, 30);
		 jtxt2.setFont(new Font("raleway", Font.BOLD, 20));
		 
		 
		 JLabel doblable = new JLabel(" Date of birth");
		 doblable.setBounds(25, 180, 200, 50);
		 doblable.setFont(new Font("raleway", Font.BOLD, 30));
		 
	
		  celender = new JLabel();
		 celender.setBounds(250, 200, 100, 30);
		 
		 
		 
		 
		 JLabel salarylable = new JLabel("Salary");
		 salarylable.setBounds(450, 190, 100, 50);
		 salarylable.setFont(new Font("raleway", Font.BOLD, 30));
		 
		  jtxt3 = new JTextField();
		 jtxt3.setBounds(800, 200, 150, 30);
		 jtxt3.setFont(new Font("raleway", Font.BOLD, 20));
		 
		 
		  

		 JLabel Addresslable = new JLabel("Address");
		 Addresslable.setBounds(25, 280, 160, 50);
		 Addresslable.setFont(new Font("raleway", Font.BOLD, 30));
		 
		  addtxt = new JTextField();
		 addtxt.setBounds(220, 290, 150, 30);
		 addtxt.setFont(new Font("raleway", Font.BOLD, 20));	
		 
		 

		 JLabel phonelable = new JLabel("Phone no.");
		 phonelable.setBounds(450, 280, 160, 50);
		 phonelable.setFont(new Font("raleway", Font.BOLD, 30));
		 
		  phtxt = new JTextField();
		 phtxt.setBounds(800, 290, 150, 30);
		 phtxt.setFont(new Font("raleway", Font.BOLD, 20));	
		 
		 
		 
		 
		 JLabel emaillable = new JLabel("Email Add.");
		 emaillable.setBounds(25, 380, 160, 50);
		 emaillable.setFont(new Font("raleway", Font.BOLD, 30));
		 
		  emailtxt = new JTextField();
		 emailtxt.setBounds(220, 390, 150, 30);
		 emailtxt.setFont(new Font("raleway", Font.BOLD, 20));	
		 

		 
		 JLabel higedulable = new JLabel("Highest Edu.");
		 higedulable.setBounds(450, 380, 230, 50);
		 higedulable.setFont(new Font("raleway", Font.BOLD, 30));
		 
		 
		 
		 
		 
		 edubox = new JTextField ();
		edubox.setBackground(Color.white);
		edubox.setBounds(800, 390, 150, 30);
		 
		 
		 
		
		
		
		
		JLabel Designationlable = new JLabel("Designation");
		Designationlable.setBounds(25, 480, 260, 50);
		Designationlable.setFont(new Font("raleway", Font.BOLD, 30));
		 
		  designationtxt = new JTextField();
		 designationtxt.setBounds(220, 490, 150, 30);
		 designationtxt.setFont(new Font("raleway", Font.BOLD, 20));	
		 
		 

		 JLabel adhharlable = new JLabel("Aadhar no.");
		 adhharlable.setBounds(450, 480, 160, 50);
		 adhharlable.setFont(new Font("raleway", Font.BOLD, 30));
		 
		  aadhartxt = new JLabel();
		 aadhartxt.setBounds(800, 480, 150, 30);
		 aadhartxt.setFont(new Font("raleway", Font.BOLD, 20));	
		 
		 
			JLabel Employeelable = new JLabel("Employee id");
			Employeelable.setBounds(25, 580, 260, 50);
			Employeelable.setFont(new Font("raleway", Font.BOLD, 30));
			 
		
	 empid = new JLabel();
		empid.setBounds(220, 590, 150, 30);
		empid.setFont(new Font("raleway", Font.BOLD, 40));
		
		
		
		 btn1 = new JButton("Update  Details");
		btn1.setBounds(450, 590, 150, 30);
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		btn1.addActionListener(this);
	
		
		
		
		 btn2 = new JButton("Back");
		btn2.setBounds(650, 590, 150, 30);
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
	
		
		
		 
		 
		
		
		
		
		 
		 jf.setLayout(null);
		 jf.setVisible(true);
		 jf.add(l1);
		 jf.add(namelable);
		 jf.add(jtxt1);
		 jf.add(fathernamelable);
		 jf.add(jtxt2);
		 jf.add(doblable);
		 jf.add(celender);
		 jf.add(salarylable);
		 jf.add(jtxt3);
		 jf.add(Addresslable);
		 jf.add(addtxt);
		 jf.add(phonelable);
		 jf.add(phtxt);
		 jf.add(emaillable);
		 jf.add(emailtxt);
		 jf.add(higedulable);
		 jf.add(edubox);
		 jf.add(Designationlable);
		 jf.add(designationtxt);
		 jf.add(adhharlable);
		 jf.add(aadhartxt);
		 jf.add(Employeelable);
		 jf.add(empid);
		 jf.add(btn1);
		 jf.add(btn2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 try {
				
			 JDBConnection con = new JDBConnection();
			 String query = " select * from employee where employeeid = '"+employeid1+"'";
			 ResultSet rs = con.stmt.executeQuery(query);
			while (rs.next())
			 {
				
				
				
				
				
				jtxt1.setText(rs.getString("name"));
	            jtxt2.setText(rs.getString("fathername"));
	            celender.setText(rs.getString("dob"));
	            jtxt3.setText(rs.getString("salary"));
	            addtxt.setText(rs.getString("address"));
	            phtxt.setText(rs.getString("phoneno"));
	            emailtxt.setText(rs.getString("email"));
	            edubox.setText(rs.getString("education"));
	            designationtxt.setText(rs.getString("designation"));
	            aadhartxt.setText(rs.getString("aadhar"));
	            empid.setText(rs.getString("employeeid"));
				
				
				
				 
				 
			}
			 
			 
		} catch (Exception e) {
		System.out.println(e);
		}
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }

	 @Override
	 public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource()==btn1)
		 {
			 
			 String fathername =jtxt2.getText();
			 String salary =jtxt3.getText();
			 String address =addtxt.getText();
			 String phoneno =phtxt.getText();
			 String email =emailtxt.getText();
			 String education =edubox.getText();
			 String designation =designationtxt.getText();
			 
			 try {
				
				 JDBConnection con = new JDBConnection();
				 String query = "UPDATE employee SET fathername = '"+fathername+"', salary = '"+salary+"', address = '"+address+"', phoneno = '"+phoneno+"', email = '"+email+"', education = '"+education+"', designation = '"+designation+"' WHERE employeeid = '"+employeid1+"'";
				 
				 con.stmt.executeUpdate(query);
				 JOptionPane.showMessageDialog(null,"Deatils update successfully");
				 jf.setVisible(false);
				 new Homepage();
				 
			} catch (Exception e2) {
				System.out.println(e2);
			}
			
			 
			 
			 
		 }
		
	 }
	
	
}
