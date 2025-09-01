package Swing;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Homepage implements ActionListener {
	
	JFrame jf;
	JButton add,view,update,remove;
	
	Homepage()
	
	{
		 jf = new JFrame();
		jf.setSize(1100, 500);
		jf.setLocation(120, 130);
		

		ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("swingimage/homepageimg.png"));
		Image i2 = i1.getImage().getScaledInstance(1000,500, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel imglable = new JLabel(i3);
		imglable.setBounds(0, 0, 1000,500);
		jf.add(imglable);
		
		JLabel l1 = new JLabel("Employement Management System ");
		l1.setBounds(500,20,350,30);
		l1.setFont(new Font("raleway", Font.BOLD, 20));
		
		
		add = new JButton("Add Employee");
		add.setBounds(20, 10, 160, 30);
		add.addActionListener(this);
		
		
		view = new JButton("View Employee");
		view.setBounds(200, 10, 160, 30);
		view.addActionListener(this);
		
		update = new JButton("Update Employee");
		update.setBounds(20, 50, 160, 30);
		update.addActionListener(this);
		
		remove = new JButton("Remove Employee");
		remove.setBounds(200, 50, 160, 30);
		remove.addActionListener(this);
	
		
		jf.setLayout(null);
		
		jf.setVisible(true);
		imglable.add(l1);
		imglable.add(add);
		imglable.add(view);
		imglable.add(update);
		imglable.add(remove);
	
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		new Homepage();
		

	}




	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==add)
			
		{
			jf.setVisible(false);	
			new addEmployee();
		}
		
		else if (e.getSource()==view) 
			
		{
			jf.setVisible(false);
		new	Viewemployee();
		}
		
		else if (e.getSource()==update)
		
		{
			jf.setVisible(false);
			new Viewemployee();
			
		}
		
		else if (e.getSource()==remove) {
			
		}
		
	}

}
