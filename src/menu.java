import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;


public class menu extends JFrame implements ActionListener{

	private static final Component RIGHT = null;
	private JPanel contentPane;
	private JButton log,dep,trans,wth,add ;
	private JLabel l1;
	private JMenuBar menuBar;
	private JMenu file,hel,his;
	private JMenuItem cos,tl,cp,ab;
	private JPanel panel;

	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	 panel = new JPanel();
		panel.setBounds(1168, 60, 182, 697);
		panel.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(panel);
		panel.setLayout(null);
		
	 dep = new JButton("");
		 Image pic5 = new ImageIcon(this.getClass().getResource("/dep.png")).getImage();
		dep.setIcon(new ImageIcon(pic5));
		dep.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		dep.setForeground(SystemColor.desktop);
		dep.setBackground(Color.ORANGE);
		dep.setBounds(10, 39, 162, 118);
		panel.add(dep);
		
	 wth= new JButton("");

		Image pic4 = new ImageIcon(this.getClass().getResource("/withdraw.png")).getImage();
		wth.setIcon(new ImageIcon(pic4));
		wth.setForeground(SystemColor.desktop);
		wth.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		wth.setBackground(Color.ORANGE);
		wth.setBounds(10, 198, 162, 118);
		panel.add(wth);
		
 trans= new JButton("");
		Image pic3 = new ImageIcon(this.getClass().getResource("/exc.png")).getImage();
		trans.setIcon(new ImageIcon(pic3));
		trans.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		trans.setBackground(Color.ORANGE);
		trans.setBounds(10, 360, 162, 118);
		panel.add(trans);
		
	add = new JButton("");

		Image pic2 = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
		add.setIcon(new ImageIcon(pic2));
		add.setForeground(SystemColor.desktop);
		add.setFont(new Font("AcmeFont", Font.PLAIN, 14));
		add.setBackground(Color.ORANGE);
		add.setBounds(10, 514, 162, 118);
		panel.add(add);
	 l1 = new JLabel("");
		l1.setBackground(Color.ORANGE);
		l1.setBounds(0, 60, 1171, 670);
		contentPane.add(l1);
		 Image pic1 = new ImageIcon(this.getClass().getResource("/last.jpg")).getImage();
			l1.setIcon(new ImageIcon(pic1));
		
			menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1171, 59);
		menuBar.setBackground(Color.LIGHT_GRAY);
		contentPane.add(menuBar);
		
		file = new JMenu("FILE");
		file.setForeground(SystemColor.desktop);
		file.setFont(new Font("AcmeFont", Font.PLAIN, 17));
		menuBar.add(file);
		
		cos = new JMenuItem("Costumer");
		cos.setBackground(SystemColor.controlHighlight);
		cos.setForeground(SystemColor.desktop);
		cos.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		file.add(cos);
		
		his = new JMenu("HISTORY");
		his.setBackground(SystemColor.controlHighlight);
		his.setForeground(SystemColor.desktop);
		his.setFont(new Font("AcmeFont", Font.PLAIN, 17));
		menuBar.add(his);
		
		tl = new JMenuItem("Transaction List");
		tl.setBackground(SystemColor.controlHighlight);
		tl.setForeground(SystemColor.desktop);
		tl.setFont(new Font("AcmeFont", Font.PLAIN, 15));
	     his.add(tl);
		
	hel= new JMenu("HELP");
	hel.setBackground(SystemColor.controlHighlight);
	hel.setForeground(SystemColor.desktop);
	hel.setFont(new Font("AcmeFont", Font.PLAIN, 17));
		menuBar.add(hel);
		
		ab= new JMenuItem("About");
		ab.setBackground(SystemColor.controlHighlight);
		ab.setForeground(SystemColor.desktop);
		ab.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		hel.add(ab);
		
		cp = new JMenuItem("Change Password");
		cp.setBackground(SystemColor.controlHighlight);
		cp.setForeground(SystemColor.desktop);
		cp.setFont(new Font("AcmeFont", Font.PLAIN, 15));
		hel.add(cp);
		
	log = new JButton("LOG OUT");
		Image p = new ImageIcon(this.getClass().getResource("/log.png")).getImage();
		 log.setIcon(new ImageIcon(p));
		 log.setBounds(1168, 0, 182, 59);
		 log.setBackground(new Color(255, 153, 102));
		 log.setFont(new Font("AcmeFont", Font.PLAIN, 17));
		 log.setForeground(SystemColor.desktop);
		contentPane.add( log);
		
		
		
		
		cos.addActionListener(this);
		tl.addActionListener(this);
		cp.addActionListener(this);
		ab.addActionListener(this);;
		log.addActionListener(this);
		dep.addActionListener(this);
		trans.addActionListener(this);
		wth.addActionListener(this);
		add.addActionListener(this); 
		
	}
	public void actionPerformed(ActionEvent e) {
		//Event for buttons
		if (e.getSource()==log){
			
			logsub w1 = new logsub();
			w1.setVisible(true);
			w1.setSize(530, 268);
			w1.setTitle("LOGIN");
			w1.setLocationRelativeTo(null);
			w1.setResizable(false);
			
			System.exit(0);
		}
		
	   if (e.getSource()==dep){
		 Deposub w1 = new Deposub();
			w1.setVisible(true);
			w1.setBounds(20,150,700,500);
			w1.setTitle("DEPOSIT");
			w1.setLocationRelativeTo(RIGHT);
			w1.setResizable(false);
		}
	   if (e.getSource()==trans){
			FundTsub  ft = new FundTsub();
			ft.setVisible(true);
			ft.setSize(700,570);
			ft.setTitle("FUND TRANSFER");
			ft.setLocationRelativeTo(null);
			ft.setResizable(false);
		}
	   if (e.getSource()==wth){
			Withsub t = new Withsub();
			t.setVisible(true);
			t.setSize(700,500);
		   t.setTitle("WITHDRAW");
		    t.setLocationRelativeTo(null);
			   
			
		}
	if (e.getSource()==add){
	 ADDacSub w = new ADDacSub();
		w.setVisible(true);
		w.setTitle("Add Acount");
		w.setSize(850, 500);
		w.setLocationRelativeTo(null);
		w.setResizable(false);
		}
		//MenuItemEvent
	if (e.getSource()==cos){
		 cossub w = new cossub();
		w.setVisible(true);
		w.setTitle("Customer Information");
		w.setSize(855, 477);
		w.setLocationRelativeTo(null);
		w.setResizable(false);
	}
	if (e.getSource()==tl){

        hissub w = new hissub();		
        w.setVisible(true);
		w.setSize(900,500);
		w.setTitle("Transaction List");
		w.setLocationRelativeTo(null);
		w.setResizable(false);
	}
	if (e.getSource()==cp){
		
		 cossub w = new cossub();
			w.setVisible(true);
			w.setTitle("Customer Information");
			w.setSize(855, 477);
			w.setLocationRelativeTo(null);
			w.setResizable(false);
	}
	if (e.getSource()==ab){
		
	}
	}
}
