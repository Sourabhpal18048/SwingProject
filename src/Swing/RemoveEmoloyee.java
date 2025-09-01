package Swing;

import java.awt.Choice;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RemoveEmoloyee implements ActionListener {
	JFrame jf;
	Choice choiceempid;
	JButton delete , back;
	
	RemoveEmoloyee()
	{
	
		jf = new JFrame();
		jf.setSize(1000, 400);
		jf.setLocation(100, 150);
		
		
		JLabel labelempid = new JLabel("Employee ID");
		labelempid.setBounds(80, 40, 80, 20);
		
		choiceempid = new Choice();
		choiceempid.setBounds(250, 40, 100, 60);
		

	
		try {
			JDBConnection con = new JDBConnection();
			String query = "select * from employee";
			ResultSet rs = con.stmt.executeQuery(query);
			
			while(rs.next())
			{
				choiceempid.add(rs.getString("employeeid"));
			}
			
		} catch (SQLException e) {
		
			System.out.println(e);
			
		}
		
		
		JLabel labelname = new JLabel("Name");
		labelname.setBounds(80, 80, 80, 20);
		
		JLabel lblname = new JLabel();
		lblname.setBounds(250, 80, 80, 20);
		
		
		JLabel labelphone = new JLabel("Phone");
		labelphone.setBounds(80, 120, 80, 20);
		
		JLabel lblphone = new JLabel();
		lblphone.setBounds(250, 120, 80, 20);
		
		
		JLabel labelemail = new JLabel("Email");
		labelemail.setBounds(80, 160, 80, 20);
		
		JLabel lblemail = new JLabel();
		lblemail.setBounds(250, 160, 200, 20);
		
	
		choiceempid.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
			
				
				try {
					JDBConnection con = new JDBConnection();
					String query = "select * from employee where employeeid = '"+choiceempid.getSelectedItem()+"'";
					ResultSet rs = con.stmt.executeQuery(query);
					
					while(rs.next())
					{
						lblname.setText(rs.getString("name"));
						lblphone.setText(rs.getString("phoneno"));
						lblemail.setText(rs.getString("email"));
						
						
					}
					
				} catch (SQLException e1) {
				
					System.out.println(e1);
					
				}
				
				
				
				
			}
		});
		
		
		delete = new JButton("Delete");
		delete.setBounds(350, 280, 100, 40);
		delete.addActionListener(this);
		
		back = new JButton("Back");
		back.setBounds(550, 280, 100, 40);
		
		
		
		
		
		jf.setLayout(null);
		jf.setVisible(true);
		jf.add(labelempid);
		jf.add(choiceempid);
		jf.add(labelname);
		jf.add(lblname);
		jf.add(labelphone);
		jf.add(lblphone);
		jf.add(labelemail);
		jf.add(lblemail);
		jf.add(delete);
		jf.add(back);
	}
	

	public static void main(String[] args) {
	new 	RemoveEmoloyee();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==delete)
		{
			JDBConnection con= new JDBConnection();
			String query = "delete from employee where employeeid = '"+choiceempid.getSelectedItem()+"'";
			try {
				con.stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Employee data  Delete Successfully");
				jf.setVisible(false);
				new Homepage();
			} catch (SQLException e1) {
				System.out.println("data not delete "+e1);
			}
			
			
		}
		else
		{
			jf.setVisible(false);
			new Homepage();
		}
	}




}
