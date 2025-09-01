package Swing;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Employeemanagemnetsystem implements ActionListener {
	
	JFrame jf;

	Employeemanagemnetsystem()
	{
		jf = new  JFrame();
		jf.setSize(1170,700);
		jf.setLocation(80, 10);
		
		
		JLabel l1 = new JLabel("Employement Management System");
		l1.setBounds(80,30,1000,70);
		l1.setFont(new Font("serif", Font.PLAIN, 60));
		
		
		
		
		ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("swingimage/img1.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1170,700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel imglable = new JLabel(i3);
		imglable.setBounds(0, 0, 1170,700);
		
		// 1st jframe button//
		
		JButton btn1 = new JButton("Click to Continue");
		btn1.setBounds(380, 500, 200, 50);
		btn1.addActionListener(this);
		imglable.add(btn1);
		
	

		jf.setLayout(null);
		jf.setVisible(true);
		jf.add(l1);
		jf.add(imglable);
		
		while(true)
		{
			l1.setVisible(false);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
			l1.setVisible(true);
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
			
		}
		
		
		
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		jf.setVisible(false);
		
		new Loginframe();
	}
	
	
	
	public static void main(String[] args) {
		
	new 	Employeemanagemnetsystem();
		

	}




	

}
