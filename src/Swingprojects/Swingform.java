package Swingprojects;

import java.awt.Color;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Swingform   {

	Swingform()
	{
		JFrame jf = new JFrame();
		jf.setSize(600,500);
		jf.setTitle("REGISTRATION FORM");
		
		Label l1 = new Label("ENTER USERNAME");
	     l1.setBounds(100, 100, 150, 30);
		l1.setForeground(Color.red);
	
		JTextField jtxt1 = new JTextField();
		 jtxt1.setBounds(270, 100, 200, 30);
		
		
		Label l2  = new Label("ENTER YOUR PASSWORD");
		 l2.setBounds(100, 160, 170, 30);
		l2.setForeground(Color.red);
		
		
		JTextField jtxt2 = new JTextField();
	    jtxt2.setBounds(270, 160, 200, 30);
	    
		
		
		
		
		jf.add(l1);
		jf.add(l2);
		jf.add(jtxt1);
		jf.add(jtxt2);
		jf.setLayout(null);
		jf.setVisible(true);
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
	
	   new Swingform();

	}

}
