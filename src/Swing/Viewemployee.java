package Swing;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class Viewemployee implements ActionListener {
	
	JFrame jf;
	JLabel searchbar;
	Choice employeid;
	JButton search,print,update,back;
	
	JTable table;
	
	Viewemployee()
	{
		jf = new JFrame();
		jf.setSize(1000, 800);
		jf.setLocation(70, 50);
		
		searchbar = new JLabel("Search by Emp. Id");
		searchbar.setBounds(40, 20, 150, 40);
		
		
		employeid = new Choice();
		employeid.setBounds(220, 30, 200, 20);
		
		
		 table = new JTable();
		table.setFont(new Font("raeway", Font.BOLD, 10));
	
		
		
		
		
		
		
		try {
			JDBConnection jdbc = new JDBConnection();
			String query = "select * from employee";
			ResultSet rs = jdbc.stmt.executeQuery(query);
			
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
			
			
			
			
		} catch (SQLException e) {
			System.out.println("problem in"+e );
		
		
		}
		
		
		
		
	
		try {
			JDBConnection jdbc = new JDBConnection();
			String query = "select * from employee";
			ResultSet rs = jdbc.stmt.executeQuery(query);
			
			while (rs.next()) {
				employeid.add(rs.getString("employeeid"));
			}
			
			
			
			
			
			
			
			
			
		} catch (SQLException e1) {
			System.out.println("problem in"+e1 );
		}
		
		JScrollPane jsp = new JScrollPane(table);
		jsp.setBounds(0, 100, 1000, 600);
		
		search = new JButton("Search");
		search.setBounds(40, 70, 100, 25);
		search.addActionListener(this);
		
		print = new JButton("Print");
		print.setBounds(180, 70, 100, 25);
		print.addActionListener(this);
		
		update = new JButton("Update");
		update.setBounds(350, 70, 100, 25);
		update.addActionListener(this);
		
		back = new JButton("Back");
		back.setBounds(550, 70, 100, 25);
		back.addActionListener(this);

		
		jf.add(jsp);
		jf.add(searchbar);
		jf.add(employeid);
		jf.add(search);
		jf.add(print);
		jf.add(update);
		jf.add(back);
		
		
		jf.setLayout(null);
		jf.setVisible(true);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
	
		new Viewemployee();
		

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==search)
		{
			String query = "select * from employee where employeeid= '"+employeid.getSelectedItem()+ "'";
			
			JDBConnection con = new JDBConnection();
			try {
				ResultSet rs = con.stmt.executeQuery(query);
				table.setModel(DbUtils.resultSetToTableModel(rs));
			} catch (SQLException e1) {
				
				System.out.println("problem in "+e1);
			}
			
			
			
		}else if (e.getSource()==print) {
			
			
			try {
				
				table.print();
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
			
		}else if (e.getSource()==update) {
			
			jf.setVisible(false);
			new Updateemployee(employeid.getSelectedItem());
		}else {
			jf.setVisible(false);
			new Homepage();
		}
		
	}

}
