import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class SubWall extends JFrame implements ActionListener {
	private JButton log,dep,trans,wth,add ;
	private JLabel l1;
	private JMenuBar menuBar;
	private JMenu file,hel,his;
	private JMenuItem cos,tl,cp,ab;
	private JPanel panel;
	public SubWall(){
		
		try{
			Container c = getContentPane();

		c.setLayout(null);

	
		c.add( panel = new JPanel());
		panel.setBounds(968, 60, 182, 672);
	
		
	
		c.add( dep = new JButton(""));

	 Image pic5 = new ImageIcon(this.getClass().getResource("/dep.png")).getImage();
	dep.setIcon(new ImageIcon(pic5));
			
	 dep.setFont(new Font("AcmeFont", Font.PLAIN, 14));
	 dep.setForeground(SystemColor.desktop);
	 dep.setBackground(Color.ORANGE);
	 dep.setBounds(10, 39, 162, 118);
		panel.add(dep);
		
		c.add(	wth = new JButton(""));
		Image pic4 = new ImageIcon(this.getClass().getResource("/withdraw.png")).getImage();
		wth.setIcon(new ImageIcon(pic4));
		wth.setForeground(SystemColor.desktop);
		wth.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		wth.setBackground(Color.ORANGE);
		wth.setBounds(10, 198, 162, 118);
		panel.add(wth);
		
		c.add(trans = new JButton(""));
	Image pic3 = new ImageIcon(this.getClass().getResource("/exc.png")).getImage();
	 trans.setIcon(new ImageIcon(pic3));
 trans .setForeground(new Color(0, 118, 163));
 trans .setFont(new Font("AcmeFont", Font.PLAIN, 14));
 trans .setBackground(Color.ORANGE);
 trans .setBounds(10, 360, 162, 118);
	panel.add(trans);
		
	c.add(add = new JButton(""));
	Image pic2 = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
	add.setIcon(new ImageIcon(pic2));
	add.setForeground(SystemColor.desktop);
	add.setFont(new Font("AcmeFont", Font.PLAIN, 14));
	add.setBackground(Color.ORANGE);
	add.setBounds(10, 514, 162, 118);
	panel.add(add);
		
	c.add(panel);
	c.add( l1 = new JLabel(""));
	 Image pic1 = new ImageIcon(this.getClass().getResource("/last.jpg")).getImage();
		l1.setIcon(new ImageIcon(pic1));
		l1.setBackground(Color.ORANGE);
	    l1.setBounds(0, 60, 967, 670);
		//c.add(l1);
		
		
		c.add( menuBar = new JMenuBar());
		menuBar.setBounds(0, 0, 967, 59);
		menuBar.setBackground(Color.LIGHT_GRAY);
		//c.add(menuBar);
	//setJMenuBar(menuBar);
		c.add(file= new JMenu("FILE"));
    	file.setForeground(SystemColor.desktop);
        file.setFont(new Font("AcmeFont", Font.PLAIN, 17));
		menuBar.add(file);
		
		c.add(cos = new JMenuItem("Costumer"));
	 cos.setBackground(SystemColor.controlHighlight);
	 cos.setForeground(SystemColor.desktop);
	 cos.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		file.add(cos);
		
		c.add(his = new JMenu("HISTORY"));
 his.setBackground(SystemColor.controlHighlight);
 his.setForeground(SystemColor.desktop);
 his.setFont(new Font("AcmeFont", Font.PLAIN, 17));
		menuBar.add( his);
		
		c.add(tl = new JMenuItem("Transaction List"));
		 tl .setBackground(SystemColor.controlHighlight);
		 tl .setForeground(SystemColor.desktop);
		 tl .setFont(new Font("AcmeFont", Font.PLAIN, 15));
		his.add(tl);
		
		c.add(hel= new JMenu("HELP"));
		hel.setBackground(SystemColor.controlHighlight);
		hel.setForeground(SystemColor.desktop);
		hel.setFont(new Font("AcmeFont", Font.PLAIN, 17));
		menuBar.add(hel);
		
		c.add( ab = new JMenuItem("About"));
	 ab.setBackground(SystemColor.controlHighlight);
	 ab.setForeground(SystemColor.desktop);
	 ab.setFont(new Font("AcmeFont", Font.PLAIN, 15));
	hel.add(ab);
		
	c.add(cp = new JMenuItem("Change Password"));
		cp.setBackground(SystemColor.controlHighlight);
		cp.setForeground(SystemColor.desktop);
		cp.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		hel.add(cp);
	
	 c.add(log= new JButton("LOG OUT"));
	Image p = new ImageIcon(this.getClass().getResource("/log.png")).getImage();
	 log.setIcon(new ImageIcon(p));
	 log.setBounds(968, 0, 182, 59);
	log.setBackground(new Color(255, 153, 102));
	log.setFont(new Font("AcmeFont", Font.PLAIN, 17));
	log.setForeground(SystemColor.desktop);
		//c.add(log);
		
		
		cos.addActionListener(this);
		tl.addActionListener(this);
		cp.addActionListener(this);
		ab.addActionListener(this);;
		log.addActionListener(this);
		dep.addActionListener(this);
		trans.addActionListener(this);
		wth.addActionListener(this);
		add.addActionListener(this); 
	}catch(Exception e){
	JOptionPane.showMessageDialog(null,""+e);
		}
	}


	public void actionPerformed(ActionEvent e) {
		//Event for buttons
		if (e.getSource()==log){
			
		}
		
	   if (e.getSource()==dep){
			
		}
	   if (e.getSource()==trans){
			
		}
	   if (e.getSource()==wth){
			
		}
	if (e.getSource()==add){
			
		}
		//MenuItemEvent
	if (e.getSource()==cos){
		
	}
	if (e.getSource()==tl){
		
	}
	if (e.getSource()==cp){
		
	}
	if (e.getSource()==ab){
		
	}
	}
}
