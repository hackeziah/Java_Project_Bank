import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;


public class ADDacSub extends JFrame implements ActionListener{
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JPasswordField t8;
	private JTextField t9;
	private JComboBox combo1,combo2,combo3,combo4;
	private JButton reg,clo,cle;
	public ADDacSub() {
Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(0, 255, 255));
        c.setForeground(SystemColor.desktop);
        
		JLabel l1 = new JLabel("ADD ACCOUNT");
		 l1.setForeground(SystemColor.desktop);
		 l1.setBackground(SystemColor.desktop);
		 l1.setBounds(312, 11, 242, 40);
		 l1.setFont(new Font("AcmeFont", Font.PLAIN, 30));
		c.add( l1);JLabel l2 = new JLabel("Account No.");
		l2.setForeground(SystemColor.desktop);
		l2.setBackground(SystemColor.desktop);
		l2.setBounds(21, 84, 107, 29);
		l2.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l2);
		
		t1 = new JTextField();
		t1 .setBackground(new Color(255, 250, 205));
		t1 .setBounds(138, 83, 120, 35);
		c.add(t1 );
		t1 .setColumns(10);
		
		JLabel l3 = new JLabel("Name:");
		l3.setForeground(SystemColor.desktop);
		l3.setBackground(SystemColor.desktop);
		l3.setBounds(21, 135, 107, 29);
		l3.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l3);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 250, 205));
		t2.setBounds(138, 129, 265, 35);
		t2.setColumns(10);
		c.add(t2);

		JLabel l4 = new JLabel("Address:");
		l4.setForeground(SystemColor.desktop);
		l4.setBackground(SystemColor.desktop);
		l4.setBounds(21, 181, 107, 29);
		l4.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l4);
		
		t3 = new JTextField();
		t3.setBackground(new Color(255, 250, 205));
		t3.setBounds(138, 175, 265, 35);
		t3.setColumns(10);
		c .add(t3);
		
		JLabel l5 = new JLabel("Phone No.");
		l5.setForeground(SystemColor.desktop);
		l5.setBackground(SystemColor.desktop);
		l5.setBounds(21, 227, 107, 29);
		l5.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l5);
		
		t4 = new JTextField();
		t4.setBackground(new Color(255, 250, 205));
		t4.setBounds(138, 221, 265, 35);
		t4.setColumns(10);
		c.add(t4);
		
		JLabel l6 = new JLabel("Birth Date:");
		l6 .setForeground(SystemColor.desktop);
		l6 .setBackground(SystemColor.desktop);
		l6 .setBounds(21, 312, 107, 29);
		l6 .setFont(new Font("AcmeFont", Font.PLAIN, 15));
		c.add(l6 );

		String[] month = {"January ", "February", "March", "April ", "May", "June", "July", "August", "September", "October", "November", "December"};
	combo1 = new JComboBox(month);
		combo1.setBackground(new Color(255, 250, 205));
		combo1.setBounds(138, 312, 100, 30);
		combo1.addActionListener(this);
		c.add(combo1);
		String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		 combo2= new JComboBox(day);
		combo2.setBackground(new Color(255, 250, 205));
		combo2.addActionListener(this);
		combo2.setBounds(248, 313, 50, 30);
		c.add(combo2);
		 String[] year= {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016"};
		 combo3 = new JComboBox(year);
		combo3.setBackground(new Color(255, 250, 205));
		combo3.addActionListener(this);
		combo3.setBounds(308, 313, 77, 30);
		c.add(combo3);
		
		
		JLabel l7 = new JLabel("Gender:");
		 l7.setForeground(SystemColor.desktop);
		 l7.setBackground(SystemColor.desktop);
		 l7.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		 l7.setBounds(21, 353, 107, 29);
		c.add( l7);
		
		String[] gen ={"Male", "Female"};
		 combo4 = new JComboBox(gen);
		combo4.setBackground(new Color(255, 250, 205));
		combo4.addActionListener(this);
		combo4.setBounds(138, 354, 77, 30);
		c.add(combo4);
		
		
		JLabel l8 = new JLabel("Email ID:");
		l8.setForeground(SystemColor.desktop);
		l8.setBackground(SystemColor.desktop);
		l8.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l8.setBounds(21, 272, 107, 29);
		c.add(l8);
		
		t5 = new JTextField();
		t5.setBackground(new Color(255, 250, 205));
		t5.setColumns(10);
		t5.setBounds(138, 267, 265, 35);
		c.add(t5);
		
		reg = new JButton("REGISTER");
		reg.setForeground(SystemColor.desktop);
		reg.setBackground(Color.ORANGE);
		reg.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		reg.setBounds(449, 358, 120, 35);
		c.add(reg);
		
		JLabel l9 = new JLabel("Balance:");
		l9.setForeground(SystemColor.desktop);
		l9.setBackground(SystemColor.desktop);
		l9.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l9.setBounds(413, 134, 107, 29);
		c.add(l9);
		
		t6 = new JTextField();
		t6.setBackground(new Color(255, 250, 205));
		t6.setColumns(10);
		t6.setBounds(573, 124, 242, 35);
		c.add(t6);
		
		JLabel l10 = new JLabel("User Name:");
		l10.setForeground(SystemColor.desktop);
		l10.setBackground(SystemColor.desktop);
		l10.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l10.setBounds(413, 180, 107, 29);
		c.add(l10);
		
		t7= new JTextField();
		t7.setBackground(new Color(255, 250, 205));
		t7.setColumns(10);
		t7.setBounds(573, 170, 242, 35);
		c.add(t7);
		
		JLabel l11 = new JLabel("Password:");
		l11 .setForeground(SystemColor.desktop);
		l11 .setBackground(SystemColor.desktop);
		l11.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l11 .setBounds(413, 226, 148, 35);
		c.add(l11);
		
		t8 = new JPasswordField();
		t8 .setBackground(new Color(255, 250, 205));
		t8 .setColumns(10);
		t8 .setBounds(573, 221, 242, 35);
		c.add(t8);
		
		cle = new JButton("CLEAR");
		cle.setForeground(SystemColor.desktop);
		cle.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		cle.setBackground(Color.ORANGE);
		cle.setBounds(579, 358, 120, 35);
		c.add(cle);
		
		 clo = new JButton("CLOSE");
		clo.setForeground(SystemColor.desktop);
		clo.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		clo.setBackground(Color.ORANGE);
		clo.setBounds(709, 358, 120, 35);
		c.add(clo);
		
		JLabel l12 = new JLabel("Confirm Password:");
		l12.setForeground(SystemColor.desktop);
		l12.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l12.setBackground(SystemColor.desktop);
		l12.setBounds(413, 277, 148, 35);
		//c.add(l12);
		
		t9 = new JTextField();
		t9 .setColumns(10);
		t9 .setBackground(new Color(255, 250, 205));
		t9 .setBounds(573, 272, 242, 35);
		//c.add(t9);
		
		reg.addActionListener(this);
		clo.addActionListener(this);
		cle.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==reg){

			java.sql.Connection con = null;
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
				Statement g =con.createStatement();
			    String sql1 = "INSERT INTO `registration`(`Account No.`, `Name`, `Address`, `Phone No.`, `Email ID`, `Birth_month`, `Birth_day`, `Birth_year`, `Gender`, `Balance`, `Users_Name`, `Password`) VALUES ( '"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+combo1.getSelectedItem().toString()+"','"+combo2.getSelectedItem().toString()+"','"+combo3.getSelectedItem().toString()+"','"+combo4.getSelectedItem().toString()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"') ";
			    String sql2=" INSERT INTO `login`(`USER`, `PASSWORD`) VALUES ('"+t7.getText()+"','"+t8.getText()+"')";                                                                                                                                          
			  
			    int rs1 = g.executeUpdate(sql1);
				 int rs2 = g.executeUpdate(sql2);
				  
					JOptionPane.showMessageDialog(null,"YOU ARE REGISTERED",":D",JOptionPane.INFORMATION_MESSAGE);
				
					
				
				
				
			}catch(Exception a){
				JOptionPane.showMessageDialog(null, ""+a);
				JOptionPane.showMessageDialog(null,"INCORRECT PLEASE TRY IT AGAIN","ERROR FOUND",JOptionPane.ERROR_MESSAGE);
			}	
		}
		if (e.getSource()==clo){
			System.exit(0);
		}	
		
		if (e.getSource()==cle){
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
		

		
	}
}
