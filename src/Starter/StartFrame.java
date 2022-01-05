package Starter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import Menu.menuFrame.MenuFrame;

public class StartFrame extends JFrame implements ActionListener{
	private String title;
	private int[] size;
	private JPanel centerPanel;
	private JLabel mainTittle;
	private JButton customer;
	private JButton manager;
	private ImageIcon backgroundImg;
	
	public StartFrame() {
		centerPanel = new JPanel();
		mainTittle = new JLabel();
		customer = new JButton("Customer");
		manager = new JButton("Manager");
		backgroundImg = new ImageIcon();
		customer.addActionListener(this);
		manager.addActionListener(this);
		
		
		
		size = new int[2];
		size[0] = 1280;
		size[1] = 720;
		title = "Welcome to St. Regis Brasserie";
	
		centerPanel();
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(size[0] , size[1]);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setLayout(new FlowLayout(FlowLayout.CENTER , 200 , 275));
		this.setResizable(false);
		this.setVisible(true);	
		
		
	}
	
	public void centerPanel() {
		centerPanel.setOpaque(true);
		centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER , 50 , 20));
		centerPanel.setPreferredSize(new Dimension(700 , 150));
		centerPanel.setBackground(this.getBackground().getColor(title));
		mainTittle();
		Buttons();
		this.add(centerPanel , BorderLayout.CENTER);
	
	}
	
	public void mainTittle() {
		mainTittle.setText("Welcome to the Sr. Regis Brasserie");
		mainTittle.setFont(new Font("Go Mono for Powerline" , Font.ITALIC , 30));
		mainTittle.setForeground(Color.black);
		centerPanel.add(mainTittle);
	}
	
	public void Buttons() {
		customer.setPreferredSize(new Dimension(100 , 40));
		manager.setPreferredSize(new Dimension(100 , 40));
		customer.setFocusable(false);
		manager.setFocusable(false);
		
		centerPanel.add(customer);
		centerPanel.add(manager);
		
		customer.setAlignmentY(CENTER_ALIGNMENT);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == customer) {
			MenuFrame menu = new MenuFrame();
			menu.setBounds(this.getBounds());
			menu.setSize(720,820);
			dispose();
		}
		else if (e.getSource() == manager) {
			dispose();
		}
	}

}
