import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
public class hissub extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JScrollPane sp;
	private JTable tab1 ;
	private DefaultTableModel m1,m2;
	public hissub() {
Container c = getContentPane();
	
		c.setLayout(null);
		
		JLabel l1 = new JLabel("HISTORY");
		l1.setBounds(375, 15, 150, 38);
		l1.setForeground(SystemColor.desktop);
		l1.setFont(new Font("AcmeFont", Font.BOLD, 30));
		c.add(l1);
	

		 
	     c.setForeground(SystemColor.desktop);

		 Connection con = null;
		   Statement st = null;
		   ResultSet rs = null;
		   String s;





		   try{
		       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
		       st = con.createStatement();
		       s = "SELECT `Account No.`, `Name`,`Balance`,`Date` FROM `registration`";
		       rs = st.executeQuery(s);
		       ResultSetMetaData rsmt = rs.getMetaData();
		       int ca = rsmt.getColumnCount();
		       Vector column = new Vector(ca);
		       for(int i = 1; i <= ca; i++)
		       {
		           column.add(rsmt.getColumnName(i));
		           
		       }
		       Vector data = new Vector();
		       Vector row = new Vector();
		       while(rs.next())
		       {
		           row = new Vector(ca);
		           for(int i = 1; i <= ca; i++){
		    
		               row.add(rs.getString(i));
		    	      
		           }
		           data.add(row);
		       }
	
		       
		        JPanel panel = new JPanel();
		        
		       JTable table = new JTable(data,column);
		        JScrollPane jsp = new JScrollPane(table);
		        panel.setLayout(new BorderLayout());
		        panel.add(jsp,BorderLayout.CENTER);
		       panel.setBounds(43, 93,800, 312); 
		       table. setForeground(Color.white);
		        table. setBackground(Color.gray);
		        table.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		       c.add(panel);
		     
		               
		               
		   }catch(Exception e){
		       JOptionPane.showMessageDialog(null, "ERROR");
		   }finally{
		       try{
		       st.close();
		       rs.close();
		       con.close();
		       }catch(Exception e){
		           JOptionPane.showMessageDialog(null, "ERROR CLOSE");
		       }
		   }
		
	}

	
	public void actionPerformed(ActionEvent arg0) {
		
		
		
		
		
	}

}
