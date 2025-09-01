package Swing;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Loginframe implements ActionListener{
	JTextField jtxt1;
	JPasswordField jtxt2;
	JFrame jf;
	
	Loginframe()
	{
		 jf = new JFrame();
		jf.setSize(600, 300);	
		jf.setLocation(350, 200);
		jf.getContentPane().setBackground(Color.white);
		
		JLabel l1 = new JLabel("Username");
		l1.setBounds(50, 20, 80, 100);
		
		 jtxt1 = new JTextField();
		jtxt1.setBounds(150, 60,180, 20);
		
		JLabel l2 = new JLabel("Password");
		l2.setBounds(50, 70, 80, 100);
		
		jtxt2 = new JPasswordField();
		jtxt2.setBounds(150, 115, 180, 20);
		
		JButton btn1 = new JButton("Login");
		btn1.setBounds(130, 180, 80, 30);
		btn1.addActionListener(this);
		
		
		ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("swingimage/loginimg.jpg"));
		Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel imglable = new JLabel(i3);
		imglable.setBounds(380, 30, 200,200);
		
		
		
		
		
		
		
		
		
		
		jf.setLayout(null);
		jf.setVisible(true);
		jf.add(l1);
		jf.add(jtxt1);
		jf.add(l2);
		jf.add(jtxt2);
		jf.add(btn1);
		jf.add(imglable);
		
		
		
		
	}
	
	
	

	public void actionPerformed(ActionEvent e) {
		
		String username = jtxt1.getText();
		String password = jtxt2.getText();
		
		String query = "select * from login where username='"+username+"'and password='"+password+"'";
		
		JDBConnection conn = new JDBConnection();
		try {
			ResultSet executeQuery = conn.stmt.executeQuery(query);
			if(executeQuery.next())
			{
				jf.setVisible(false);
				new Homepage();
				
			}
			else {
				JOptionPane.showMessageDialog(null, "invalid username or password");
				 
			}
		} catch (SQLException e1) {
			System.out.println(e1);
		}
		
		
		
	}
	

	public static void main(String[] args) {
		new Loginframe();

	}

}
