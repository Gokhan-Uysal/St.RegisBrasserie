package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
	private JButton addButton;
	private JButton removeButton;
	
	private ImageIcon addIcon;
	private ImageIcon removeIcon;
	
	private JTextArea countTextArea;
	private static int count;
	
	public MenuFrame(){
		//Init components
		buttons = new JPanel();
		menuPanel = new JPanel();
		
		tittleLabel = new JLabel();
		
		menuPane = new JScrollPane(menuPanel , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		starters = new JButton("Starters");
		soups = new JButton("Soups");
		salads = new JButton("Salads");
		pastas = new JButton("Pastas");
		mainDishes = new JButton("Main Dishes");
		desserts = new JButton("Desserts");
		drinks = new JButton("Drinks");
		
		addIcon = new ImageIcon("src/Icons/icons8-add-40.png");
		removeIcon = new ImageIcon("src/Icons/icons8-minus-40.png");
		
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
		int foodCount = 8;
		int columnFoodCount = foodCount / 2;
		int height = columnFoodCount * 200 + (columnFoodCount - 1) * 40;
		
		menuPanel.setPreferredSize(new Dimension(520 , height));
		menuPanel.setLayout(new GridLayout(columnFoodCount , 2 , 20 , 20));
		menuPanel.setBackground(Color.black);
		addFood(foodCount);
	}
	
	public void addFood(int food) {
		JLabel foodLabel;
		JLabel buttonsLabel;
		
		
		for (int i = 0; i < food; i++) {
			count = 0;
			
			addButton = new JButton();
			removeButton = new JButton();
			
			foodLabel = new JLabel();
			buttonsLabel = new JLabel();
			
			countTextArea = new JTextArea();
			
			foodLabel.setLayout(new BorderLayout(5 , 5));
			foodLabel.setOpaque(true);
			foodLabel.setBackground(Color.blue);
			
			buttonsLabel.setOpaque(true);
			buttonsLabel.setLayout(new FlowLayout(FlowLayout.CENTER , 30 , 2));
			buttonsLabel.setPreferredSize(new Dimension(100 , 50));
			
			addButton.setPreferredSize(new Dimension(50 , 50));
			removeButton.setPreferredSize(new Dimension(50 , 50));
			
			addButton.setIcon(addIcon);
			removeButton.setIcon(removeIcon);
			
			addButton.addActionListener(this);
			removeButton.addActionListener(this);
		
			buttonsLabel.setBackground(Color.white);
			buttonsLabel.add(removeButton);
			buttonsLabel.add(countTextArea);
			buttonsLabel.add(addButton);
			
			countTextArea.setText("" + count);
			foodLabel.add(buttonsLabel , BorderLayout.SOUTH);
			menuPanel.add(foodLabel);
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addButton) {
			count += 1;
		}
		else if (e.getSource() == removeButton) {
			if (count != 0) {
				count -= 1;
			}
		}
		countTextArea.setText("" + count);
	}


	public static void incrementTextArea() {
		
	}
		
}
