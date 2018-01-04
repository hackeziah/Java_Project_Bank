import java.awt.*;


import javax.swing.*;

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Withsub extends JFrame implements ActionListener {
	private JPanel l1;
	private JTextField t6;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	
	private JButton wdr,gen,pri,rea; 
	
	public Withsub() {
		Container  c= getContentPane();
		c.setLayout(null);
		
		c.setBackground(new Color(0, 255, 255));
        c.setForeground(SystemColor.desktop);
		
		JLabel l1 = new JLabel("WITHDRAW");
		l1.setForeground(SystemColor.desktop);
		l1.setFont(new Font("AcmeFont", Font.BOLD, 30));
		l1.setBounds(255, 11, 195, 33);
		c.add(l1);
		
		JLabel l2 = new JLabel("Date/Time:");
		l2.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l2.setForeground(SystemColor.desktop);
		l2.setBounds(406, 45, 130, 35);
		c.add(l2);

		
		t1 = new JTextField();
		t1.setBounds(509, 45, 165, 35);
		t1.setFont(new Font("AcmeFont", Font.PLAIN, 13));

		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setForeground(SystemColor.desktop);
        c.add(t1);
		t1.setColumns(10);
		
		JLabel l3 = new JLabel("Account No.");
		 l3.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		 l3.setForeground(SystemColor.desktop);
		l3.setBounds(237, 132, 149, 33);
		c.add(l3);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(347, 132, 140, 35);
		c.add(t2);
		
		 gen = new JButton("GENERATE");
		gen.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		gen.setBounds(500, 132, 130, 35);
		c.add(gen);
	   gen.setForeground(SystemColor.desktop);
	   gen.setBackground(Color.ORANGE);
		
		JLabel l4 = new JLabel("Account No.");
		l4.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l4.setForeground(SystemColor.desktop);
		l4.setBounds(10, 177, 149, 33);
		c.add(l4);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(172, 178, 140, 35);
		c.add(t3);
		
		JLabel l5 = new JLabel("Costumer Name:");
		l5.setForeground(SystemColor.desktop);
		l5.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l5.setBounds(10, 223, 149, 33);
		c.add(l5);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(172, 224, 225, 35);
		c.add(t4);
		
		JLabel l6 = new JLabel("Balance:");
		l6.setForeground(SystemColor.desktop);
		l6.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l6.setBounds(10, 269, 149, 33);
		c.add(l6);
		
		t5 = new JTextField();
		t5 .setColumns(10);
		t5 .setBounds(172, 270, 225, 35);
		c.add(t5);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(172, 316, 225, 35);
		c.add(t6);
		
		JLabel l7= new JLabel("Withdraw Amount:");
		l7.setForeground(SystemColor.desktop);
		l7.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		
		l7.setBounds(10, 318, 149, 33);
		c.add(l7);
		
		 wdr = new JButton("WITHDRAW");
		wdr .setFont(new Font("AcmeFont", Font.PLAIN, 14));
	    wdr.setForeground(SystemColor.desktop);
	    wdr.setBackground(Color.ORANGE);
		wdr .setBounds(435, 316, 130, 35);
		c.add(wdr);
		
	 rea= new JButton("REFRESH");
		 rea.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		 rea.setBounds(136, 383, 110, 35);
		rea.setForeground(SystemColor.desktop);
			rea.setBackground(Color.ORANGE);
		c.add(rea);
		
		 pri = new JButton("PRINT");
		pri .setFont(new Font("AcmeFont", Font.PLAIN, 14));
		pri.setForeground(SystemColor.desktop);
		pri.setBackground(Color.ORANGE);
		pri.setBounds(309, 383, 110, 35);
		c.add(pri);
		pri .addActionListener(this); 
		wdr .addActionListener(this);
		rea .addActionListener(this);
		gen  .addActionListener(this);
		
		t1.setBackground(new Color(255, 250, 205));
		t2.setBackground(new Color(255, 250, 205));
		t3.setBackground(new Color(255, 250, 205));
		t4.setBackground(new Color(255, 250, 205));
		t5.setBackground(new Color(255, 250, 205));
		t6.setBackground(new Color(255, 250, 205));
		
	}


	public void actionPerformed(ActionEvent e) {
	 if (e.getSource()==wdr){

			java.sql.Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
			Statement g =con.createStatement();
			int a = Integer.parseInt(t5.getText());
			int b = Integer.parseInt(t6.getText());
			int withdraw =a-b;
			if (b>a){
			
				JOptionPane.showMessageDialog(null,"TRANSACTION CANNOT BE PROCESS!!","MESSAGE FORM SYSTEM",JOptionPane.ERROR_MESSAGE);
				t6.setText(null);
				
			}
			else{
				if (b<100){
					JOptionPane.showMessageDialog(null,"YOU CANNOT WITHDRAW!!\nMINIMUM CASH YOU CAN WITHDRAW\n100","MESSAGE FORM SYSTEM",JOptionPane.WARNING_MESSAGE);
				}
				else{
			String sql1 = " UPDATE `registration` SET `Balance` = '"+withdraw+"' WHERE Balance = '"+t5.getText()+"'";

			JOptionPane.showMessageDialog(null,"YOUR NOW WITHDRAW !!","MESSAGE FORM SYSTEM",JOptionPane.INFORMATION_MESSAGE);
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();

         
			 String ti=dateFormat.format(cal.getTime());
			String sql = " UPDATE `registration` SET `Date` = '"+ti+"' WHERE Date = '"+t1.getText()+"'";
			g.executeUpdate(sql1);
			g.executeUpdate(sql);
				}
			}
			
		}catch(Exception a){
			JOptionPane.showMessageDialog(null, "ERROR"+a);
		
		}

	 }
	
	 if (e.getSource()==gen){

			Connection conn = null;
			Statement stmt = null;
			ResultSet rs1 = null;
			try {
//				new com.mysql.jdbc.Driver();
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
 if (e.getSource()==pri){

	 try{
	 			JFileChooser fc= new JFileChooser(new File("C:\\Users\\hackeziah\\Desktop\\testFile"));
	 			if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
	 			  File f= fc.getSelectedFile();
	 			 

	 				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
	 				
	 				bw.write("Date/Time:"+" "+t1.getText()+"Account No.: "+" ");
	 				bw.write(t2.getText()+"Name: "+" ");
	 				bw.write(t4.getText()+"Withdraw Amount: "+" ");
	 				bw.write(t6.getText());
	 				bw.close();
	 				bw.close();
	 				bw.close();
	 			bw.close();
	 			}
	 }catch(IOException ex){
	 	
	 }
		 
	 }
 if (e.getSource()==rea){
	 t1.setText (null);
	   t2.setText (null);
		t3.setText (null);
		t4.setText (null);
		t5.setText (null);
		t6.setText (null);
 }
	}

}
