package Swingprojects;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FORMTODATABSE implements ActionListener  {
	
	FORMTODATABSE()
	{
		JFrame jf=new JFrame();
		jf.setSize(600,500);
		jf.setTitle("student registration form ");
		
		
		JLabel l1=new JLabel("Enter your name  :  ");
		l1.setBounds(50,100,200,30);
		l1.setFont(new Font("arial",Font.PLAIN,22));
		l1.setForeground(Color.black);
		
		JTextField jtxt1= new JTextField();
		jtxt1.setBounds(250, 100, 200, 30);
		jtxt1.setFont(new Font("arial",Font.BOLD,22));
		
		
		
		JLabel l2=new JLabel("Enter your Email  : ");
		l2.setBounds(50,200,200,30);
		l2.setFont(new Font("arial",Font.PLAIN,22));
		
		
		JTextField jtxt2=new JTextField();
		jtxt2.setBounds(250,200,200,30);
		jtxt2.setFont(new Font("arial",Font.BOLD,22));

		
		JButton btn1=new JButton(" SUBMIT ");
		btn1.setBounds(200, 300, 100, 30);	
		btn1.addActionListener(this);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		jf.add(l1);
		jf.add(jtxt1);
		jf.add(l2);
		jf.add(jtxt2);
		jf.add(btn1);
		jf.setLayout(null);
		jf.setVisible(true);
	
		
	}

	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "submit succefully");
	}
	
	
	
	
	
	








	public static void main(String[] args) {
		new FORMTODATABSE();
		

	}

}
