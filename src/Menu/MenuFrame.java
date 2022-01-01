package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Menu.Starters;
import Menu.Soups;
import Menu.Salads;
import Menu.Pastas;
import Menu.Desserts;
import Menu.Drinks;
import Menu.MainDishes;

public class MenuFrame extends JFrame implements ActionListener{
	
	private String title;
	private JPanel buttons;
	private JPanel menuPanel;
	private JLabel tittleLabel;
	private JScrollPane menuPane;
	private JButton starters;
	private JButton soups;
	private JButton salads;
	private JButton pastas;
	private JButton mainDishes;
	private JButton desserts;
	private JButton drinks;
	
	
	public MenuFrame(){
		//Init components
		buttons = new JPanel();
		tittleLabel = new JLabel();
		menuPanel = new JPanel();
		menuPane = new JScrollPane(menuPanel , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		starters = new JButton("Starters");
		soups = new JButton("Soups");
		salads = new JButton("Salads");
		pastas = new JButton("Pastas");
		mainDishes = new JButton("Main Dishes");
		desserts = new JButton("Desserts");
		drinks = new JButton("Drinks");
		
		menuTittle();
		menuButtons();
		menuList();
		
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setTitle(title);
		this.setLayout(new FlowLayout(FlowLayout.CENTER , 1280 / 2, 20));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.add(tittleLabel);
		this.add(buttons);
		this.add(menuPane);
	}
	
	
	public void menuTittle() {
		title = "~Menu~";
		tittleLabel.setText(title);
		tittleLabel.setPreferredSize(new Dimension(150 , 30));
		tittleLabel.setHorizontalTextPosition(JLabel.CENTER);
		tittleLabel.setFont(new Font("Go Mono for Powerline", Font.ITALIC, 30));

	}
	
	
	public void menuButtons() {
		buttons.setOpaque(true);
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 10));
		buttons.setPreferredSize(new Dimension(500 , 80));
		buttons.setBackground(Color.LIGHT_GRAY);
		buttons.add(starters);
		buttons.add(soups);
		buttons.add(salads);
		buttons.add(mainDishes);
		buttons.add(desserts);
		buttons.add(drinks);
		buttons.add(pastas);
		
	}
	
	public void menuList() {
		int foodCount = 12;
		int columnFoodCount = foodCount / 2;
		int height = columnFoodCount * 200 + (columnFoodCount - 1) * 40;
		
		menuPanel.setPreferredSize(new Dimension(520 , height));
		menuPanel.setLayout(new GridLayout(columnFoodCount , 2 , 20 , 20));
		menuPanel.setBackground(Color.black);
		addFood(foodCount);
	}
	
	public void addFood(int food) {
		JLabel foodLabel;
		for (int i = 0; i < food; i++) {
			foodLabel = new JLabel();
			foodLabel.setOpaque(true);
			foodLabel.setBackground(Color.white);
			menuPanel.add(foodLabel);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
