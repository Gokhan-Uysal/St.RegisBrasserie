package Menu.menuFrame;

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
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

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
	
	private JLabel tittleLabel;
	
	private JScrollPane menuPane;
	
	private JButton starters;
	private JButton soups;
	private JButton salads;
	private JButton pastas;
	private JButton mainDishes;
	private JButton desserts;
	private JButton drinks;
	
	private JPanel mainPanel;
	private JPanel startersPanel;
	private JPanel saladsPanel;
	private JPanel soupsPanel;
	private JPanel pastasPanel;
	private JPanel mainDishesPanel;
	private JPanel drinksPanel;
	private JPanel dessertsPanel;
	
	public MenuFrame(){
		//Init components
		buttons = new JPanel();
		
		tittleLabel = new JLabel();
		
		mainPanel = new JPanel();
		
		startersPanel = new StartersList();
		//saladsPanel = new SaladsList();
		//soupsPanel = new SoupsList();
		//pastasPanel = new PastasList();
		//mainDishesPanel = new MainDishesList();
		//drinksPanel = new DrinksList();
		//dessertsPanel = new DessertsList();
		
		menuPane = new JScrollPane(mainPanel , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		starters = new JButton("Starters");
		soups = new JButton("Soups");
		salads = new JButton("Salads");
		pastas = new JButton("Pastas");
		mainDishes = new JButton("Main Dishes");
		desserts = new JButton("Desserts");
		drinks = new JButton("Drinks");

		menuTittle();
		menuButtons();
		mainPanel();

		
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		this.add(menuPane);
	
	}
	
	public void mainPanel() {
		mainPanel.setLayout(new BorderLayout(20 , 20));
		mainPanel.setBorder(new EmptyBorder(10 , 100 , 20 , 100));
		mainPanel.add(buttons , BorderLayout.NORTH);
		mainPanel.add(tittleLabel);
		mainPanel.add(startersPanel , BorderLayout.CENTER);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == starters) {
			//startersPanel.setOpaque(true);
		}
		else if (e.getSource() == desserts) {
			//desserts.setOpaque(true);
			//menuPane = new JScrollPane(dessertsPanel , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		}
	}


	public static void incrementTextArea() {
		
	}
		
}
