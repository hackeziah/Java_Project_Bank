import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class logsub extends JFrame implements ActionListener{
	private JTextField t1;
	private JPasswordField pf1;
	private JButton log,reg,cancel;
	private JFrame w;
	private JComboBox combo1;
public logsub (){
	
	
Container c = getContentPane();

	c.setBackground(Color.CYAN);
	c.setForeground(SystemColor.desktop);
	c.setLayout(null);
	
	 log = new JButton("LOGIN");
	Image pic1 = new ImageIcon(this.getClass().getResource("/sign-check-icon.png")).getImage();
	log.setIcon(new ImageIcon(pic1));
	log.setBackground(Color.ORANGE);
	log.setFont(new Font("AcmeFont", Font.PLAIN, 14));
	log.setForeground(SystemColor.desktop);
	log.setBounds(174, 172, 127, 50);
	c.add(log);
	
	 cancel = new JButton("CANCEL");
	Image pic2 = new ImageIcon(this.getClass().getResource("/Close-icon.png")).getImage();
	cancel.setIcon(new ImageIcon(pic2));
	cancel.setBackground(Color.ORANGE);
	cancel.setFont(new Font("AcmeFont", Font.PLAIN, 14));
	cancel.setForeground(SystemColor.desktop);
	cancel.setBounds(366, 172, 127, 50);
	c.add(cancel);
	
	t1 = new JTextField();
	t1.setBackground(new Color(255, 250, 205));
	t1.setBounds(175, 51, 318, 35);
	t1.setColumns(10);
	c.add(t1);
	pf1 = new JPasswordField();
	pf1.setBackground(new Color(255, 250, 205));
	pf1.setBounds(175, 95, 318, 35);
	c.add(pf1);
	
	//String[] cho= {"", "MANAGER", "USERS"};
   //combo1 = new JComboBox(cho);
	//combo1.setFont(new Font("AcmeFont", Font.PLAIN, 14));
	//combo1 .setBackground(Color.ORANGE);
	//combo1 .setBounds(395, 141, 95, 20);
	//c.add(combo1 );
	
	 reg = new JButton("REGISTRATION");
	reg.setBackground(Color.ORANGE);
	reg.setFont(new Font("AcmeFont", Font.PLAIN, 14));
	reg.setForeground(SystemColor.desktop);
	reg.setBounds(345, 11, 148, 23);
	c.add(reg);
	
	JLabel l2 = new JLabel("");
	Image pic3 = new ImageIcon(this.getClass().getResource("/bank-icon.png")).getImage();
	l2.setIcon(new ImageIcon(pic3));
	l2.setBounds(29, 25, 148, 136);
	c.add(l2);
	
	reg.addActionListener(this);
	log.addActionListener(this);
	cancel.addActionListener(this);
	
}

public void actionPerformed(ActionEvent o) {

if (o.getSource()==log){

	java.sql.Connection con = null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
		Statement g =con.createStatement();
		String sql1 = "SELECT `USER`, `PASSWORD` FROM `login` WHERE `USER`= '"+t1.getText()+"' AND `PASSWORD` =  '"+pf1.getText()+"'  ";
		                                                                                                                                                   
		
		ResultSet rs = g.executeQuery(sql1);
		
	if(rs.next()){
			JOptionPane.showMessageDialog(null,"CORRECT PASSWORD",":D",JOptionPane.INFORMATION_MESSAGE);
	
		     menu win = new menu();
			win.setVisible (true);
			win.setSize(1366,768);
			win.setTitle("MINI BANKING SYSTEM");
			win.setLocationRelativeTo(null);

			
			
		}
	else{
		JOptionPane.showMessageDialog(null,"INCORRECT PASSWORDPLEASE TRY AGAIN!!","ERROR FOUND ",JOptionPane.ERROR_MESSAGE);
	}
		
		
	}catch(Exception a){
		JOptionPane.showMessageDialog(null, ""+a);
		
	
	
	}
}
	if (o.getSource()==reg){
	    Regsub wr= new Regsub();
		
	    wr.setTitle("Registration Form");
	    wr.setVisible(true);
	    wr.setSize( 855, 460);
		wr.setLocationRelativeTo(null);
		wr.setResizable(false);
		
	}

if (o.getSource()==cancel){
	t1.setText("");
	pf1.setText("");
}

	
}
}
