package Starter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
	private JLayeredPane middlePane;
	private JLabel middleLabel;
	private JLabel backgroundLabel;
	private JButton customer;
	private JButton manager;
	private ImageIcon backgroundImg;
	
	public StartFrame() {
		backgroundImg = new ImageIcon("Picture/RestaurantInterior2.jpeg");
		middlePane = new JLayeredPane();
		backgroundLabel = new JLabel();
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
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.getContentPane().setBackground(Color.cyan);
		this.setVisible(true);	
		
		pane();
	}
	
	public void pane() {
		middlePane.setSize(new Dimension(800 , 800));
		bacground();
		middleScreen();
		this.add(middlePane);
	}
	
	public void bacground() {
		backgroundLabel.setIcon(backgroundImg);
		backgroundLabel.setBackground(Color.LIGHT_GRAY);
		//backgroundLabel.setPreferredSize(new Dimension(200 , 200));
		backgroundLabel.setBounds(0 , 0  , 500 , 500);
		backgroundLabel.setOpaque(true);
		middlePane.add(backgroundLabel);
	}
	
	public void middleScreen() {
		middleLabel.setText(title);
		middleLabel.setFont(new Font("MW Boli" , Font.ITALIC , 50));
		middleLabel.setBounds(0 , 0  , 200 , 200);
		middleLabel.setOpaque(true);
		middlePane.add(middleLabel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
