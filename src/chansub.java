import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class chansub extends JFrame implements ActionListener{
	private JTextField t1;
	private JTextField t2;
	private JPasswordField t3;
	private JButton cha,sea;
	public chansub(){
		Container c = getContentPane();
		c.setBackground(Color.CYAN);

		c.setLayout(null);
		
		JLabel l1 = new JLabel("Account No.");
		l1.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l1.setBounds(156, 21, 105, 25);
		c.add(l1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 250, 205));
		t1.setBounds(262, 11, 99, 35);
		t1.setColumns(10);
		c.add(t1);
		
		
		 sea = new JButton("Search");
		sea.setBackground(Color.ORANGE);
		sea.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		sea.setBounds(364, 11, 110, 36);
		c.add(sea);
		
		JLabel l2= new JLabel("Password:");
		l2.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l2.setBounds(10, 84, 105, 25);
		c.add(l2);
		
		t2= new JTextField();
		t2.setBackground(new Color(255, 250, 205));
		t2.setColumns(10);
		t2.setBounds(156, 74, 205, 35);
		c.add(t2);
		
		JLabel l3 = new JLabel("Change Password:");
		l3 .setFont(new Font("AcmeFont", Font.PLAIN, 15));
		l3 .setBounds(10, 141, 144, 25);
		c.add(l3 );
		
		t3 = new JPasswordField();
		t3.setBackground(new Color(255, 250, 205));
		t3.setColumns(10);
		t3.setBounds(156, 131, 205, 35);
		c.add(t3);
		
		 cha = new JButton("Change");
		 cha.setBackground(Color.ORANGE);
		 cha.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		 cha.setBounds(364, 131, 110, 36);
		c.add(cha);
		cha.addActionListener(this);
		sea.addActionListener(this);;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==cha){

			java.sql.Connection con = null;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
				Statement g =con.createStatement();
				String sql1 = " UPDATE `registration` SET `Password` = '"+t3.getText()+"'   WHERE Password = '"+t2.getText()+"'";

				JOptionPane.showMessageDialog(null,"PASSWORD SUCCESFULLY CHANGED!!","MESSAGE FORM SYSTEM",JOptionPane.WARNING_MESSAGE);
				g.executeUpdate(sql1);
			
				
			}catch(Exception a){
				JOptionPane.showMessageDialog(null, "ERROR"+a);
				
			
			
			}
			
		}
        if (e.getSource()==sea){

			Connection conn = null;
			Statement stmt = null;
			ResultSet rs1 = null;
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
	
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
				stmt = conn.createStatement();
				
				rs1 = stmt.executeQuery("SELECT * FROM `registration` WHERE `Account No.` = '"+t1.getText()+"' ");
				if (rs1.next()) {
					JOptionPane.showMessageDialog(null,"ACCOUNT FOUND","ACCOUNT FOUND :D!!",JOptionPane.INFORMATION_MESSAGE);
					String a	=	rs1.getString("Password");
				     t2.setText (a);	
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
	
	

}
