package Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class addEmployee implements ActionListener  {

	Random randomno = new Random();
	int num = randomno.nextInt(999999);
	JFrame jf;
	
	
	
	
	
	
	
	JTextField jtxt1,jtxt2,jtxt3,addtxt,phtxt,emailtxt,designationtxt,aadhartxt;
	JDateChooser  celender;
	JComboBox<String> edubox;
	JLabel empid;
	JButton btn1,btn2;
	
	 addEmployee()
	 {
	
		  jf = new JFrame();
		 jf.setSize(1100, 900);
		 jf.setLocation(50, 0);
		 
		 JLabel l1 = new JLabel("Add Employee Detail");
		 l1.setBounds(450, 20, 250, 50);
		 l1.setFont(new Font("ralewaay", Font.BOLD, 20));
		 
		 JLabel namelable = new JLabel("Name");
		 namelable.setBounds(40, 80, 100, 50);
		 namelable.setFont(new Font("raleway", Font.BOLD, 30));
		 
		  jtxt1 = new JTextField();
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
		 
	
		  celender = new JDateChooser();
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
		 
		 String arr [] = {"BCA","BA","MBA","MCA","B.COM","B.ED","M.TECH","BSC"};
		 
		 
		 
		 edubox = new JComboBox<String>(arr);
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
		 
		  aadhartxt = new JTextField();
		 aadhartxt.setBounds(800, 480, 150, 30);
		 aadhartxt.setFont(new Font("raleway", Font.BOLD, 20));	
		 
		 
			JLabel Employeelable = new JLabel("Employee id");
			Employeelable.setBounds(25, 580, 260, 50);
			Employeelable.setFont(new Font("raleway", Font.BOLD, 30));
			 
		
	 empid = new JLabel("" +num);
		empid.setBounds(220, 590, 150, 30);
		empid.setFont(new Font("raleway", Font.BOLD, 40));
		
		
		
		 btn1 = new JButton("Add Employee");
		btn1.setBounds(450, 590, 150, 30);
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		btn1.addActionListener(this);
		
		
		
		 btn2 = new JButton("Back");
		btn2.setBounds(650, 590, 150, 30);
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		btn2.addActionListener(this);
		
		
		 
		 
		
		
		
		
		 
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
		 
		 
	 }
	
	 public static void main (String [] args)
	 {
		 new addEmployee();
	 }

	 @Override
	 public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn1)
		{
			

			String Name =jtxt1.getText();
			String FatherName = jtxt2.getText();
			String DOB = ((JTextField)celender.getDateEditor().getUiComponent()).getText();
			String Salary = jtxt3.getText();
			String Address = addtxt.getText();
			String PhoneNo = phtxt.getText();
			String Email = emailtxt.getText();
			String Education = (String)edubox.getSelectedItem();
			String Designation = designationtxt.getText();
			String Aadhar = aadhartxt.getText();
			String Employeeid = empid.getText();
			
			try {
				
				JDBConnection conn = new JDBConnection();
				
				String  query = "insert into employee values('"+Name+"','"+FatherName+"' ,'"+DOB+"','"+Salary+"','"+Address+"','"+PhoneNo+"' ,'"+Email+"' ,'"+Education+"' ,'"+Designation+"' ,'"+Aadhar+"','"+Employeeid+"')";                         
				int row = conn.stmt.executeUpdate(query);
				if(row>0)
				{
				JOptionPane.showMessageDialog(null, "Deatils added Succesfully");
				}
				jf.setVisible(false);
				new Homepage();
				
			} catch (Exception e2) {
				
		System.out.println("error in "+e2);
			}
			
			
			
		}
		else {
			jf.setVisible(false);
			new Homepage();
		}
		 
	 }
	
	
}
