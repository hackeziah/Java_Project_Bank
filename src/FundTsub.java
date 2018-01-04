import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
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
public class FundTsub extends JFrame implements ActionListener{
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JButton gen,ref,che,trans, prin;
	public FundTsub() {

Container c = getContentPane();
	
		
	
		
		c.setLayout(null);
		c.setBackground(new Color(0, 255, 255));
        c.setForeground(SystemColor.desktop);
        
		JLabel l1 = new JLabel("FUND TRANSFER");
		l1.setForeground(SystemColor.desktop);
		l1.setBounds(205, 11, 390, 35);
		l1.setFont(new Font("AcmeFont", Font.BOLD, 30));
		c.add(l1);
		
		JLabel l2  = new JLabel("Account No.\r\n");
		l2 .setForeground(SystemColor.desktop);
		l2 .setBounds(269, 112, 162, 33);
		l2 .setFont(new Font("AcmeFont", Font.PLAIN, 15));
	    c.add(l2);
		
		t2 = new JTextField();
		t2 .setBounds(374, 110, 140, 35);
		t2.setColumns(10);
		c.add(t2);
		
		
	
		 gen = new JButton("GENERATE");
		gen.setForeground(SystemColor.desktop);
		gen.setBackground(Color.ORANGE);
		gen.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		gen.setBounds(546, 110, 128, 35);
		c.add(gen);
		
		JLabel l3= new JLabel("Date/Time:");
		l3.setForeground(SystemColor.desktop);
		l3.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l3.setBounds(406, 45, 130, 35);
		
		c.add(l3);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(509, 45, 165, 35);
		t1.setFont(new Font("AcmeFont", Font.PLAIN, 13));
		
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setForeground(SystemColor.desktop);
		c.add(t1);
		t1.setBackground(new Color(0, 255, 255));
		JLabel l4 = new JLabel("Account No.");
		l4.setForeground(SystemColor.desktop);
		l4.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l4.setBounds(24, 153, 198, 35);
		c.add(l4);
		
		t3 = new JTextField();
		t3 .setColumns(10);
		t3 .setBounds(167, 153, 140, 35);
		c.add(t3);
		
		JLabel l5 = new JLabel("Costumer Name:");
		l5.setForeground(SystemColor.desktop);
		l5.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l5.setBounds(24, 197, 198, 35);
		c.add(l5);
		
		t4 = new JTextField();
		t4 .setColumns(10);
		t4 .setBounds(167, 199, 225, 35);
		c.add(t4);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(167, 245, 225, 35);
		c.add(t5);
		
		JLabel l6 = new JLabel("Balance:");
		l6.setForeground(SystemColor.desktop);
		l6.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l6.setBounds(24, 243, 198, 35);
		c.add(l6);
		
		JLabel l7 = new JLabel("Destination No.");
		l7.setForeground(SystemColor.desktop);
		l7.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l7.setBounds(24, 291, 198, 35);
		c .add(l7);
		
		t6 = new JTextField();
		t6 .setColumns(10);
		t6 .setBounds(167, 293, 225, 35);
		c.add(t6);
		
		 che = new JButton("CHECK");
		che.setForeground(SystemColor.desktop);
		che.setBackground(Color.ORANGE);
		che.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		che.setBounds(430, 293, 113, 35);
		c.add(che);
		
		JLabel l8= new JLabel("Name\r\n");
		l8.setForeground(SystemColor.desktop);
		l8.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l8.setBounds(24, 339, 198, 35);
		c.add(l8);
		

		JLabel l9= new JLabel("Balace:\r\n");
		l9.setForeground(SystemColor.desktop);
		l9.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l9.setBounds(24, 387, 198, 35);
		c.add(l9);

		JLabel l10= new JLabel("Transfer Amount:\r\n");
		l10.setForeground(SystemColor.desktop);
		l10.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l10.setBounds(24, 435, 198, 35);
		c.add(l10);
		
		
		
		t7 = new JTextField();
		t7.setColumns(10);
		t7.setBounds(167, 341, 225, 35);
	  
		c.add(t7);
		
		t8 = new JTextField();
		t8.setColumns(10);
		t8.setBounds(167, 387, 225, 35);
		c.add(t8);
		
		t9 = new JTextField();
		t9.setColumns(10);
		t9.setBounds(167, 433, 225, 35);
		c.add(t9);
		
		 ref = new JButton("REFRESH");
		ref.setForeground(SystemColor.desktop);
		ref.setBackground(Color.ORANGE);
		ref.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		ref.setBounds(133, 500, 123, 35);
		c.add(ref);
		
		trans = new JButton("TRANSFER");
		trans.setForeground(SystemColor.desktop);
		trans.setBackground(Color.ORANGE);
		trans.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		trans.setBounds(430, 435, 113, 35);
		c.add(trans);
		
        prin = new JButton("PRINT");
		prin.setForeground(SystemColor.desktop);
		prin.setBackground(Color.ORANGE);
		prin.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		prin.setBounds(319, 500, 123, 35);
		c.add(prin);
		 t8.setBackground(new Color(255, 250, 205));
		 t9.setBackground(new Color(255, 250, 205));
		t1.setBackground(new Color(255, 250, 205));
		t2.setBackground(new Color(255, 250, 205));
		t3.setBackground(new Color(255, 250, 205));
		t4.setBackground(new Color(255, 250, 205));
		t5.setBackground(new Color(255, 250, 205));
		t6.setBackground(new Color(255, 250, 205));
		t7.setBackground(new Color(255, 250, 205));
		gen.addActionListener(this);ref.addActionListener(this);
		che.addActionListener(this);trans.addActionListener(this);
		prin.addActionListener(this);

	}

	
	public void actionPerformed(ActionEvent o) {
		
	if (o.getSource()==gen){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs1 = null;
		try {
//			new com.mysql.jdbc.Driver();
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
    if (o.getSource()==ref){
    	t1.setText(null);
		t2.setText(null);
		t3.setText(null);
		t4.setText(null);
		t5.setText(null);
		t6.setText(null);
		t7.setText(null);
		t8.setText(null);
		t9.setText(null);
		
	}

  if (o.getSource()==che){
	  Connection conn = null;
		Statement stmt = null;
		ResultSet rs1 = null;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
			stmt = conn.createStatement();
			
			rs1 = stmt.executeQuery("SELECT * FROM `registration` WHERE `Account No.` = '"+t6.getText()+"' ");
			
			
			if (rs1.next()) {
				JOptionPane.showMessageDialog(null,"ACCOUNT FOUND","ACCOUNT FOUND :D!!",JOptionPane.INFORMATION_MESSAGE);
				
				  String b	=rs1.getString("Name");
					t7.setText (b);
					
					String d	=	rs1.getString("Balance");
					t8.setText (d);

					t1.setFont(new Font("AcmeFont", Font.PLAIN, 13));

					
					
					String ea	=	rs1.getString("Date");
					t1.setText (ea);
					t1.setHorizontalAlignment(SwingConstants.CENTER);
					t1.setForeground(SystemColor.desktop);
				
			}
			else{
				JOptionPane.showMessageDialog(null,"NO ACCOUNT FOUND","ACCOUNT NOT FOUND",JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
  if (o.getSource()==trans){
	  Connection conn = null;
		Statement stmt = null;
		ResultSet rs1 = null;

		java.sql.Connection con = null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
		Statement g =con.createStatement();
		int a = Integer.parseInt(t5.getText());
		int b = Integer.parseInt(t9.getText());
		int c = Integer.parseInt(t8.getText());
		int withdraw =a-b;
		
		if (b>a){
			
			JOptionPane.showMessageDialog(null,"TRANSACTION CANNOT BE PROCESS!!","MESSAGE FORM SYSTEM",JOptionPane.ERROR_MESSAGE);
			t9.setText(null);
		}
		
		else{
		
		JOptionPane.showMessageDialog(null,"YOUR NOW TRANSFER !!","MESSAGE FORM SYSTEM",JOptionPane.INFORMATION_MESSAGE);
		String sql1 = " UPDATE `registration` SET `Balance` = '"+withdraw+"' WHERE Balance = '"+t5.getText()+"'";
		int ran =c+b;
		
		String sql2 = " UPDATE `registration` SET `Balance` = '"+ran+"' WHERE Balance = '"+t8.getText()+"'";	
		g.executeUpdate(sql1);
		g.executeUpdate(sql2);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();

     
		 String ti=dateFormat.format(cal.getTime());
		String sql = " UPDATE `registration` SET `Date` = '"+ti+"' WHERE Date = '"+t1.getText()+"'";
		g.executeUpdate(sql);
		
		t1.setText(null);
		t2.setText(null);
		t3.setText(null);
		t4.setText(null);
		t5.setText(null);
		t6.setText(null);
		t7.setText(null);
		t8.setText(null);
		t9.setText(null);
		}
	}catch (Exception ex) {
		ex.printStackTrace();
	} finally {
		try { if (rs1 != null) rs1.close(); } catch (SQLException ex) { ex.printStackTrace(); }
		try { if (stmt != null) stmt.close(); } catch (SQLException ex) { ex.printStackTrace(); }
		try { if (conn != null) conn.close(); } catch (SQLException ex) { ex.printStackTrace(); }
	}
	  
	  
		
	}
  if (o.getSource()==prin){

		 try{
		 			JFileChooser fc= new JFileChooser(new File("C:\\Users\\hackeziah\\Desktop\\testFile"));
		 			if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
		 			  File f= fc.getSelectedFile();
		 			 

		 				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		 				
		 				bw.write("Date/Time:"+" "+t1.getText()+"Account No.: "+" ");
		 				bw.write(t2.getText()+"Name: "+" ");
		 				bw.write(t4.getText()+"Destination No."+" ");
		 				bw.write(t6.getText()+"Tranfer Amount: "+" ");
		 				bw.write(t9.getText());
		 				
		 				bw.close();
		 				bw.close();
		 				bw.close();
		 				bw.close();
		 				bw.close();
		 			bw.close();
		 			}
		 }catch(IOException ex){
		 	
		 }
	}
	}

}
