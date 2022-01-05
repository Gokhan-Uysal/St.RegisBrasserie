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
import javax.swing.JComboBox;
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
	
	private JPanel headerPanel;
	
	private JLabel tittleLabel;
	private JLabel costLabel;
	
	private JScrollPane menuPane;
	
	private JComboBox<String> buttonBox;
	private ArrayList<JPanel> currentPanels;
	
	private ImageIcon cart;
	
	private JPanel mainPanel;
	private JPanel startersPanel;
	private JPanel saladsPanel;
	private JPanel soupsPanel;
	private JPanel pastasPanel;
	private JPanel mainDishesPanel;
	private JPanel drinksPanel;
	private JPanel dessertsPanel;
	
	private static float totalCost;
	
	public static float getTotalCost() {
		return totalCost;
	}

	public static void setTotalCost(float totalCost) {
		MenuFrame.totalCost = totalCost;
	}

	public MenuFrame(){
		//Init components
		headerPanel = new JPanel();
		
		tittleLabel = new JLabel();
		costLabel = new JLabel();
		
		mainPanel = new JPanel();
		buttonBox = new JComboBox<String>();
		currentPanels = new ArrayList<JPanel>();
		
		cart = new ImageIcon("src/Pictures/Icons/icons8-shopping-30.png");
		
		startersPanel = new StartersList();
		saladsPanel = new SaladsList();
		soupsPanel = new SoupsList();
		pastasPanel = new PastasList();
		mainDishesPanel = new MainDishesList();
		drinksPanel = new DrinksList();
		dessertsPanel = new DessertsList();
		
		currentPanels.add(startersPanel);
		currentPanels.add(saladsPanel);
		currentPanels.add(soupsPanel);
		currentPanels.add(pastasPanel);
		currentPanels.add(mainDishesPanel);
		currentPanels.add(drinksPanel);
		currentPanels.add(dessertsPanel);
		
		menuPane = new JScrollPane(mainPanel , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		
		mainPanel();
		menubuttonBox();

		
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.add(menuPane);
	
	}
	
	public void mainPanel() {
		mainPanel.setLayout(new BorderLayout(20 , 20));
		mainPanel.setBorder(new EmptyBorder(10 , 100 , 20 , 100));
		menuTittle();
		mainPanel.add(headerPanel , BorderLayout.NORTH);
		
		
		setVisible(startersPanel);
	}
	
	public void menuTittle() {
		title = "~Menu~";
		tittleLabel.setText(title);
		tittleLabel.setPreferredSize(new Dimension(150 , 30));
		tittleLabel.setHorizontalTextPosition(JLabel.CENTER);
		tittleLabel.setHorizontalAlignment(JLabel.CENTER);
		tittleLabel.setFont(new Font("Go Mono for Powerline", Font.ITALIC, 30));

	}
	
	public void costLabel() {
		costLabel.setOpaque(true);
		costLabel.setPreferredSize(new Dimension(120 , 40));
		costLabel.setLayout(new GridLayout(1 , 2));
		costLabel.setText("" + totalCost);
		costLabel.setIcon(cart);
		costLabel.setBackground(Color.LIGHT_GRAY);
		costLabel.setIconTextGap(10);
		costLabel.setVerticalAlignment(JLabel.CENTER);
	}
	
	public void menubuttonBox() {
		headerPanel.setOpaque(true);
		headerPanel.setLayout(new BorderLayout(20 , 20));
		headerPanel.setPreferredSize(new Dimension(500 , 80));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		headerPanel.add(tittleLabel , BorderLayout.NORTH);
		
		costLabel();
		headerPanel.add(costLabel , BorderLayout.EAST);
		buttonBox.addItem("Starters");
		buttonBox.addItem("Soups");
		buttonBox.addItem("Salads");
		buttonBox.addItem("Pastas");
		buttonBox.addItem("Main Dishes");
		buttonBox.addItem("Desserts");
		buttonBox.addItem("Drinks");
		
		buttonBox.addActionListener(this);
		headerPanel.add(buttonBox , BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonBox) {
			String type = buttonBox.getSelectedItem().toString();
			if (type == "Starters") {
				setVisible(startersPanel);
			}
			else if (type == "Soups") {
				setVisible(soupsPanel);
			}
			else if (type == "Salads") {
				setVisible(saladsPanel);
			}
			else if (type == "Pastas") {
				setVisible(pastasPanel);
			}
			else if (type == "Main Dishes") {
				setVisible(mainDishesPanel);
			}
			else if (type == "Desserts") {
				setVisible(dessertsPanel);
			}
			else if (type == "Drinks") {
				setVisible(drinksPanel);
			}
		}
	}
	
	public void setVisible(JPanel visiblePanel) {
		for (JPanel p : currentPanels) {
			if (p != visiblePanel) {
				p.setVisible(false);
				mainPanel.remove(p);
			}
		}
		mainPanel.add(visiblePanel , BorderLayout.CENTER);
		visiblePanel.setVisible(true);
	}
}
