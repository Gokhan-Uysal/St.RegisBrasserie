package Starter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class StartFrame extends JFrame implements ActionListener{
	private String title;
	private int[] size;
	private JPanel middlePanel;
	private JLabel middleLabel;
	private JButton customer;
	private JButton manager;
	private ImageIcon backgroundImg;
	
	public StartFrame() {
		backgroundImg = new ImageIcon("RestaurantInterior2.jpeg");
		middlePanel = new JPanel();
		middleLabel = new JLabel();
		customer = new JButton();
		manager = new JButton();
		
		
		size = new int[2];
		size[0] = 1280;
		size[1] = 720;
		title = "Welcome to St. Regis Brasserie";
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(size[0] , size[1]);
		this.setVisible(true);
		
		middleScreen();
	}
	
	public void middleScreen() {
		middlePanel.setBounds(this.WIDTH / 2 , this.HEIGHT / 2 , 100 , 100);
		middlePanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		middlePanel.setAlignmentY(JPanel.CENTER_ALIGNMENT);
		middlePanel.setBackground(Color.red);
		
		middleLabel.setOpaque(true);
		middleLabel.setText(title);
		//middleLabel.setFont(new Font("MW Boli" , Font.BOLD , 25));
		//middleLabel.setIcon(backgroundImg);
		
		
		middlePanel.add(middleLabel);
		this.add(middlePanel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
