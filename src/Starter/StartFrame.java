package Starter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
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
import javax.swing.border.EmptyBorder;

import Menu.menuFrame.MenuFrame;

public class StartFrame extends JFrame implements ActionListener{
	private String title;
	
	private int[] size;
	
	private JLabel backgroundLabel;
	private JLabel centerLabel;
	private JLabel buttonsLabel;
	
	private JLayeredPane layeredPane;
	
	private JLabel mainTittle;
	
	private JButton customer;
	private JButton manager;
	
	ImageIcon backgroundImg;
	
	public StartFrame() {
		
		customer = new JButton("Customer");
		manager = new JButton("Manager");
			
		backgroundImg = new ImageIcon("src/Pictures/PlaceImg/RestaurantInterior.jpeg");
		backgroundLabel = new JLabel(backgroundImg);
		
		backgroundLabel.setBounds( 0 , 0  , backgroundImg.getIconWidth(), backgroundImg.getIconHeight());
		mainTittle = new JLabel();
		centerLabel = new JLabel();
		buttonsLabel = new JLabel();
		
		layeredPane = new JLayeredPane();
		
		title = "Welcome to St. Regis Brasserie";
		
		centerLabel();
		
		
		this.add(layeredPane);
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);	
		this.setLayout(null);
		this.setSize(backgroundImg.getIconWidth() , backgroundImg.getIconHeight());
		layeredPane();
		
	}
	
	public void layeredPane() {
		layeredPane.setBounds(0 , 0 , backgroundImg.getIconWidth() , backgroundImg.getIconHeight());
		layeredPane.add(centerLabel);
		layeredPane.add(backgroundLabel);
	}
	
	public void centerLabel() {
		centerLabel.repaint();
		centerLabel.setLayout(new BorderLayout(100, 50));
		centerLabel.setBorder(new EmptyBorder(30 , 20 , 40 , 20));
		centerLabel.setBounds(backgroundImg.getIconWidth()  / 2 - 350 , backgroundImg.getIconHeight() / 2 - 100 , 700 , 200);
		mainTittle();
		buttons();
	}
	
	public void mainTittle() {
		mainTittle.setText("Welcome to the Sr. Regis Brasserie");
		mainTittle.setFont(new Font("Go Mono for Powerline" , Font.ITALIC , 30));
		mainTittle.setForeground(Color.white);
		mainTittle.setHorizontalAlignment(JLabel.CENTER);
		mainTittle.setVerticalAlignment(JLabel.CENTER);
		centerLabel.add(mainTittle , BorderLayout.CENTER);
	}
	
	public void buttons() {
		buttonsLabel.setLayout(new GridLayout(1 ,2 , 50 , 10));
		buttonsLabel.setBorder(new EmptyBorder(10 , 100 , 10 , 100));
		buttonsLabel.setPreferredSize(new Dimension(10 , 50));
		
		customer.setSize(new Dimension(5 , 40));
		manager.setSize(new Dimension(5 , 40));
		
		customer.setBackground(MenuFrame.buttonColor);
		manager.setBackground(MenuFrame.buttonColor);
		customer.setForeground(Color.white);
		manager.setForeground(Color.white);
		customer.setBorderPainted(false);
		manager.setBorderPainted(false);
		customer.setOpaque(true);
		manager.setOpaque(true);
		
		customer.setFocusable(false);
		manager.setFocusable(false);
		
		customer.addActionListener(this);
		manager.addActionListener(this);
		
		buttonsLabel.add(customer);
		buttonsLabel.add(manager);
		
		centerLabel.add(buttonsLabel , BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == customer) {
			MenuFrame menu = new MenuFrame("Gökhan Uysal" , 123);
			menu.setBounds(this.getBounds());
			menu.setSize(720,820);
			dispose();
		}
		else if (e.getSource() == manager) {
			dispose();
		}
	}
}
