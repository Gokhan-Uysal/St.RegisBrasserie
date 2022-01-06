package Menu.menuFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Starter.StartFrame;
import Stocks.DbManager;


public class MenuFrame extends JFrame implements ActionListener{
	
	private String title;
	
	private JPanel headerPanel;
	
	private JLabel tittleLabel;
	protected static JLabel costLabel;
	
	private JScrollPane menuPane;
	
	private JComboBox<String> buttonBox;
	private ArrayList<JPanel> currentPanels;
	
	private ImageIcon cart;
	private Image backgroundImg;
	
	private JPanel mainPanel;
	private JPanel startersPanel;
	private JPanel saladsPanel;
	private JPanel soupsPanel;
	private JPanel pastasPanel;
	private JPanel mainDishesPanel;
	private JPanel drinksPanel;
	private JPanel dessertsPanel;
	
	private JMenuBar menuBar;
	private JMenu checkout;
	private JMenu profile;
	private JMenuItem pay;
	private JMenuItem splitCheck;
	
	private JTextArea userName;
	private JTextArea seasionNumber;
	private JTextArea age;
	
	private static float totalCost;
	protected static String checkoutText;
	
	public static float getTotalCost() {
		return totalCost;
	}

	public static void setTotalCost(float totalCost) {
		MenuFrame.totalCost = totalCost;
	}
	
	public static Color backgroundColor = new Color(0x5C2018);
	public static Color foregroundColor = new Color(0xBC4639);
	public static Color textColor = new Color(0xF3E0DC);
	public static Color buttonColor = new Color(0x4285F4);
	public static Color labelColor = new Color(0xD4A59A);

	public MenuFrame(String userName , int seasionNumber , int age){
		//Init components
		headerPanel = new JPanel();
		
		tittleLabel = new JLabel();
		costLabel = new JLabel();
		
		mainPanel = new JPanel();
		buttonBox = new JComboBox<String>();
		currentPanels = new ArrayList<JPanel>();
		
		menuBar = new JMenuBar();
		checkout = new JMenu("Checkout");
		profile = new JMenu("Profile");
		pay = new JMenuItem("Pay");
		splitCheck = new JMenuItem("Split Check");
		
		cart = new ImageIcon("src/Pictures/Icons/icons8-shopping-30.png");
		
		
		checkoutText = "";
		
		this.userName = new JTextArea();
		this.seasionNumber = new JTextArea();
		this.age = new JTextArea();
		
		this.userName.setEditable(false);
		this.seasionNumber.setEditable(false);
		this.setSize(720,820);
		
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

		this.userName.setText("  User: " + userName + " ");
		this.seasionNumber.setText("  Seasion Number: " + seasionNumber + " ");
		this.age.setText("  Age: " + age + " ");
		
		mainPanel();
		menubuttonBox();
		menuBar();
		
		this.getContentPane().setBackground(backgroundColor);
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.add(menuPane);
		this.setJMenuBar(menuBar);
	
	}
	
	public void mainPanel() {
		mainPanel.setLayout(new BorderLayout(20 , 20));
		mainPanel.setBorder(new EmptyBorder(10 , 100 , 20 , 100));
		mainPanel.setBackground(foregroundColor);
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
		tittleLabel.setForeground(Color.white);

	}
	
	public void costLabel() {
		costLabel.setOpaque(true);
		costLabel.setPreferredSize(new Dimension(120 , 40));
		costLabel.setLayout(new GridLayout(1 , 2));
		costLabel.setText("" + totalCost + "₺");
		costLabel.setIcon(cart);
		costLabel.setBackground(buttonColor);
		costLabel.setForeground(Color.white);
		costLabel.setIconTextGap(10);
		costLabel.setVerticalAlignment(JLabel.CENTER);
	}
	
	public void menubuttonBox() {
		headerPanel.setOpaque(true);
		headerPanel.setLayout(new BorderLayout(20 , 20));
		headerPanel.setBorder(new EmptyBorder(5 , 20 , 5 , 20));
		headerPanel.setPreferredSize(new Dimension(500 , 100));
		headerPanel.setBackground(buttonColor);
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
		headerPanel.add(buttonBox , BorderLayout.WEST);
		
	}
	
	public void menuBar() {
		pay.addActionListener(this);
		splitCheck.addActionListener(this);
		
		checkout.add(pay);
		checkout.add(splitCheck);
		
		profile.add(userName);
		profile.add(age);
		profile.add(seasionNumber);
		
		menuBar.add(profile);
		menuBar.add(checkout);
		
	}
	
	public void printBill(int type) throws FileNotFoundException {
		
		if (type == 0) {
			checkoutText += "Your total is: " + totalCost;
		}
		else if (type == 1) {
			checkoutText += "Your total is: " + (totalCost / Integer.parseInt(seasionNumber.getText()));
		}
	
		try(Formatter output = new Formatter("src/Bills/bill.csv")){
			output.format(checkoutText);
		}
		
		catch(FileNotFoundException | SecurityException e) {
				System.err.println(e);
		}
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
		
		if (totalCost > 0) {
			if (e.getSource() == pay) {
				System.out.println("Your bill has been printed");
				try {
					printBill(0);
				} 
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					DbManager.writeToFile();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				this.dispose();
				System.exit(0);
				 
			}
			else if (e.getSource() == splitCheck) {
				System.out.println("Your bill hase been splitted and printed");
				try {
					DbManager.writeToFile();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					printBill(1);
				} 
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				this.dispose();
				System.exit(0);
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
