import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

import java.sql.*;


public class cossub extends JFrame implements ActionListener{
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JButton clo,cle,gen;
	
	public cossub() {

		Container c = getContentPane();	
		c.setBackground(new Color(0, 255, 255));


		c.setLayout(null);
		
		JLabel l1 = new JLabel("CUSTOMER INFORMATION");
		l1.setBounds(232, 11, 422, 38);
		l1.setFont(new Font("AcmeFont", Font.PLAIN, 30));
		c.add(l1);
		
		JLabel l2 = new JLabel("Account No.");
		l2.setBounds(466, 60, 95, 35);
		l2.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l2);
		
		t1 = new JTextField();
		t1 .setBounds(571, 60, 110, 35);
		c.add(t1);
		t1 .setColumns(10);
		
		 gen = new JButton("GENERATE");
		gen.setBounds(711, 60, 118, 35);
		gen.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		gen.setBackground(new Color(255, 200, 0));
		c.add(gen);
		
		JLabel l3 = new JLabel("Account No.");
		l3.setBounds(10, 97, 95, 35);
		l3.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l3);
		
		t2 = new JTextField();
		t2.setBounds(115, 97, 110, 35);
		t2.setColumns(10);
		c.add(t2);
		
		JLabel l4 = new JLabel("Name:");
		 l4.setBounds(10, 143, 110, 35);
		 l4.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add( l4);
		
		t3 = new JTextField();
		t3.setBounds(115, 143, 230, 35);
		t3.setColumns(10);
		c.add(t3);
		
		JLabel l5 = new JLabel("Address:");
		l5.setBounds(10, 189, 110, 35);
		l5.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l5);
		
		t4 = new JTextField();
		t4.setBounds(115, 189, 230, 35);
		t4.setColumns(10);
		c.add(t4);
		
		JLabel l6 = new JLabel("Phone No.");
		l6.setBounds(10, 235, 110, 38);
		l6.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l6);
		
		t5 = new JTextField();
		t5.setBounds(115, 235, 230, 35);
		t5.setColumns(10);
		c.add(t5);
		
		JLabel l7 = new JLabel("Email ID:");
		l7.setBounds(10, 284, 110, 38);
		l7.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l7);
		
		t6 = new JTextField();
		t6.setBounds(115, 284, 230, 35);
		t6.setColumns(10);
		c.add(t6);
		
		JLabel l8 = new JLabel("Birth Date:");
		l8.setBounds(10, 330, 110, 38);
		l8.setFont(new Font("AcmeFont", Font.PLAIN, 15));
	    c.add(l8);
		
		t7 = new JTextField();
		t7.setBounds(115, 330, 230, 35);
		t7.setColumns(10);
		c.add(t7);
		
		JLabel l9 = new JLabel("Gender:");
		l9.setBounds(10, 384, 110, 38);
		l9.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l9);
		
		t8= new JTextField();
		t8.setBounds(115, 384, 230, 35);
		t8.setColumns(10);
		c.add(t8);
		
		JLabel l10 = new JLabel("Balance");
		l10.setBounds(355, 140, 110, 38);
		l10.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l10);
		
		t9 = new JTextField();
		t9.setBounds(460, 140, 230, 35);
		t9.setColumns(10);
		c.add(t9);
		
		JLabel l11 = new JLabel("User Name:");
		l11.setBounds(355, 186, 110, 38);
		l11.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l11);
		
		t10 = new JTextField();
		t10.setBounds(460, 186, 230, 35);
		t10.setColumns(10);
		c.add(t10);
		
	cle = new JButton("CLEAR");
		cle .setFont(new Font("AcmeFont", Font.PLAIN, 14));
		cle .setBackground(Color.ORANGE);
		cle .setBounds(454, 237, 118, 35);
		c.add(cle );
		
		 clo = new JButton("CLOSE");
		clo.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		clo.setBackground(Color.ORANGE);
		clo.setBounds(582, 237, 118, 35);
		c.add(clo);
		cle.addActionListener(this);

		clo.addActionListener(this);

		gen.addActionListener(this);
		t1.setBackground(new Color(255, 250, 205));
		t2.setBackground(new Color(255, 250, 205));
		t3.setBackground(new Color(255, 250, 205));
		t4.setBackground(new Color(255, 250, 205));
		t5.setBackground(new Color(255, 250, 205));
		t6.setBackground(new Color(255, 250, 205));
		t7.setBackground(new Color(255, 250, 205));
		t8.setBackground(new Color(255, 250, 205));
		t9.setBackground(new Color(255, 250, 205));
		t10.setBackground(new Color(255, 250, 205));
	
	}
	
	public void actionPerformed(ActionEvent e) {
		 
		if (e.getSource()==gen){
			 {
					Connection conn = null;
					Statement stmt = null;
					ResultSet rs1 = null;
					try {
//						new com.mysql.jdbc.Driver();
						Class.forName("com.mysql.jdbc.Driver").newInstance();
			
						conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
						stmt = conn.createStatement();
						
						rs1 = stmt.executeQuery("SELECT * FROM `registration` WHERE `Account No.` = '"+t1.getText()+"' ");
						if (rs1.next()) {
							JOptionPane.showMessageDialog(null,"ACCOUNT FOUND","ACCOUNT FOUND :D!!",JOptionPane.INFORMATION_MESSAGE);
							String a	=	rs1.getString("Account No.");
						     t2.setText (a);
				             String b	=		rs1.getString("Name");
							t3.setText (b);
							 String c	=rs1.getString("Address");
							t4.setText (c);
							String d	=	rs1.getString("Phone No.");
							t5.setText (d);
							String ea =rs1.getString("Email ID");
							t6.setText (ea);
							String m=rs1.getString("Birth_month")+"/"+rs1.getString("Birth_day")+"/"+rs1.getString("Birth_year");
							t7.setText (m);
							String g=rs1.getString("Gender");
							t8.setText (g);
							String ba= rs1.getString("Balance");
							t9.setText (ba);
							String uss= rs1.getString("Users_Name");
							t10.setText (uss);
						}
						else{
							JOptionPane.showMessageDialog(null,"NO ACCOUNT","ACCOUNT NOT FOUND",JOptionPane.ERROR_MESSAGE);
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					} finally {
						try { if (rs1 != null) rs1.close(); } catch (SQLException ex) { ex.printStackTrace(); }
						try { if (stmt != null) stmt.close(); } catch (SQLException ex) { ex.printStackTrace(); }
						try { if (conn != null) conn.close(); } catch (SQLException ex) { ex.printStackTrace(); }
					}
				}
 
		
		}
        if (e.getSource()==clo){
			
			System.exit(0);
		}
       if (e.getSource()==cle){
    	   t1.setText (null);
    	   t2.setText (null);
			t3.setText (null);
			t4.setText (null);
			t5.setText (null);
			t6.setText (null);
			t7.setText (null);
			t8.setText (null);
			t9.setText (null);
			t10.setText (null);
			
        }
		
	}

}
