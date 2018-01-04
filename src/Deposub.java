import javax.swing.*;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Deposub extends JFrame implements ActionListener {
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JButton dep,pri,ref,gen;
	String time;
	public Deposub() {
		Container c = getContentPane();

		c.setBackground(new Color(0, 255, 255));
		c.setLayout(null);

		
	
		
		JLabel l1 = new JLabel("DEPOSIT");
		l1.setForeground(SystemColor.desktop);
		l1.setBounds(257, 11, 194, 31);
		l1.setFont(new Font("AcmeFont", Font.BOLD, 30));
		c.add(l1);
		
		JLabel l2 = new JLabel("Date/Time:");
		l2.setForeground(SystemColor.desktop);
		l2.setBounds(406, 45, 130, 35);
		
		l2.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l2);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 250, 205));
		t1.setBounds(509, 45, 165, 35);
		c.add(t1);
		t1.setColumns(10);
		
		JLabel l3 = new JLabel("Account No.");
		l3.setForeground(SystemColor.desktop);
		l3.setBounds(241, 106, 165, 35);
		l3.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l3);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 250, 205));
		t2.setBounds(364, 108, 140, 35);
		t2.setColumns(10);
		c.add(t2);
		
		gen = new JButton("GENERATE");
		gen .setFont(new Font("AcmeFont", Font.PLAIN, 14));
		gen .setBackground(Color.ORANGE);
		gen .setBounds(544, 106, 130, 35);
		c.add(gen);
		
		JLabel l4 = new JLabel("Account No.");
		l4.setForeground(SystemColor.desktop);
		l4.setBounds(10, 160, 165, 35);
		l4.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l4);
		
		t3 = new JTextField();
		t3.setBackground(new Color(255, 250, 205));
		t3.setBounds(170, 154, 140, 35);
		t3.setColumns(10);
		c.add(t3);
		
		t4 = new JTextField();
		t4.setBackground(new Color(255, 250, 205));
		t4.setBounds(170, 204, 225, 35);
		t4.setColumns(10);
		c.add(t4);
		
		JLabel l5 = new JLabel("Costumer Name:");
		l5.setForeground(SystemColor.desktop);
		l5.setBounds(10, 206, 165, 35);
		l5.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l5);
		
		t5 = new JTextField();
		t5.setBackground(new Color(255, 250, 205));
		t5.setBounds(170, 252, 225, 35);
		t5.setColumns(10);
		c.add(t5);
		
		JLabel l6 = new JLabel("Balance:");
		l6.setForeground(SystemColor.desktop);
		l6.setBounds(10, 252, 165, 35);
		l6.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l6);
		
		JLabel l7 = new JLabel("Deposit Amount:");
		l7.setForeground(SystemColor.desktop);
		l7.setBounds(10, 300, 165, 35);
		l7.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l7);
		
		t6 = new JTextField();
		t6.setBackground(new Color(255, 250, 205));
		t6.setBounds(170, 300, 225, 35);
		t6.setColumns(10);
		c.add(t6);
		
		dep = new JButton("DEPOSIT");
		dep.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		dep.setBackground(Color.ORANGE);
		dep.setBounds(426, 300, 110, 35);
		c.add(dep);
		
		ref = new JButton("REFRESH");
		ref.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		ref.setBackground(Color.ORANGE);
		ref.setBounds(140, 375, 110, 35);
		c.add(ref);
		
	     pri = new JButton("PRINT");
		pri.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		pri.setBackground(Color.ORANGE);
		pri.setBounds(309, 375, 110, 35);
		c.add(pri);
		
		dep.addActionListener(this);pri.addActionListener(this);
		ref.addActionListener(this);gen.addActionListener(this);
		


	}

	public void actionPerformed(ActionEvent e) {
		int  deposit;
		
		if (e.getSource()==gen){


			Connection conn = null;
			Statement stmt = null;
			ResultSet rs1 = null;
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
	
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
				stmt = conn.createStatement();
				
				rs1 = stmt.executeQuery("SELECT * FROM `registration` WHERE `Account No.` = '"+t2.getText()+"' ");
				if (rs1.next()) {
					JOptionPane.showMessageDialog(null,"ACCOUNT FOUND","ACCOUNT FOUND :D!!",JOptionPane.INFORMATION_MESSAGE);
					String a	=	rs1.getString("Account No.");
				     t3.setText (a);
		             String b	=rs1.getString("Name");
					t4.setText (b);
					String d	=	rs1.getString("Balance");
					t5.setText (d);
					
					t1.setFont(new Font("AcmeFont", Font.PLAIN, 13));

					
					
					String ea	=	rs1.getString("Date");
					t1.setText (ea);
					t1.setHorizontalAlignment(SwingConstants.CENTER);
					t1.setForeground(SystemColor.desktop);
					
					
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

			
		
		if (e.getSource()==dep){
			java.sql.Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
			Statement g =con.createStatement();
			int a = Integer.parseInt(t5.getText());
			int b = Integer.parseInt(t6.getText());
	
			 deposit =a+b;
			String sql1 = " UPDATE `registration` SET `Balance` = '"+deposit+"' WHERE Balance = '"+t5.getText()+"'";

			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();

         
			 String ti=dateFormat.format(cal.getTime());
			String sql = " UPDATE `registration` SET `Date` = '"+ti+"' WHERE Date = '"+t1.getText()+"'";
		
	  
			JOptionPane.showMessageDialog(null,"YOU NOW DEPOSIT!!","MESSAGE FORM SYSTEM",JOptionPane.WARNING_MESSAGE);
			g.executeUpdate(sql1);
	
			g.executeUpdate(sql);
		}catch(Exception a){
			JOptionPane.showMessageDialog(null, "ERROR"+a);
		
		}
			
		}
	    if (e.getSource()==pri){

	   	 try{
	   	 			JFileChooser fc= new JFileChooser(new File("C:\\Users\\hackeziah\\Desktop\\testFile"));
	   	 			if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
	   	 			  File f= fc.getSelectedFile();
	   	 			 

	   	 				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
	   	 				
	   	 				bw.write("Date/Time:"+" "+t1.getText()+"Account No.: "+" ");
	   	 				bw.write(t2.getText()+"Name: "+" ");
	   	 				bw.write(t4.getText()+"Deposite Amount: "+" ");
	   	 				bw.write(t6.getText());
	   	 				bw.close();
	   	 				bw.close();
	   	 				bw.close();
	   	 			bw.close();
	   	 			}
	   	 }catch(IOException ex){
	   	 	
	   	 }
		}

	   if (e.getSource()==ref){
		   t1.setText (null);
    	   t2.setText (null);
			t3.setText (null);
			t4.setText (null);
			t5.setText (null);
			t6.setText (null);
			
	    }
		
	}

}
