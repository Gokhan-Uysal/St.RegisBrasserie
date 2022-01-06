package SessionManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Menu.menuFrame.MenuFrame;
import Stocks.DbManager;

public class ManagerFrame extends JFrame implements ActionListener{
	
	private JPanel mainPanel;
	
	private JLabel stockInfo;
	private JLabel customerInfo;
	private JLabel tittleLabel;
	
	private JScrollPane mainPane;
	
	private static JTextArea info = new JTextArea(DbManager.stockInfo());;
	
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public ManagerFrame() {
		mainPanel = new JPanel();
		stockInfo = new JLabel();
		customerInfo = new JLabel();
		tittleLabel = new JLabel();
		
		mainPane = new JScrollPane(mainPanel , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
	
		stockInfo();
		customerLabel();
		managerTittle();
		mainPanel();
		
		this.setSize(new Dimension(1280 , 720));
		this.setVisible(true);
		this.setResizable(false);
		this.add(mainPane);
	}
	
	public void mainPanel() {
		mainPanel.setLayout(new BorderLayout(10 , 10));
		mainPanel.setBackground(MenuFrame.labelColor);
		mainPanel.add(stockInfo , BorderLayout.WEST);
		mainPanel.add(customerInfo , BorderLayout.EAST);
		mainPanel.add(tittleLabel, BorderLayout.NORTH);
	}
	
	public void managerTittle() {
		String title = "~Manager~";
		tittleLabel.setText(title);
		tittleLabel.setPreferredSize(new Dimension(150 , 100));
		tittleLabel.setHorizontalTextPosition(JLabel.CENTER);
		tittleLabel.setHorizontalAlignment(JLabel.CENTER);
		tittleLabel.setFont(new Font("Go Mono for Powerline", Font.ITALIC, 30));
		tittleLabel.setBackground(MenuFrame.labelColor);
		tittleLabel.setOpaque(true);
	}
	
	public void customerLabel() {
		JLabel tittle = new JLabel("Customers");
		tittle.setHorizontalAlignment(JLabel.CENTER);
		
		customerInfo.setLayout(new BorderLayout(10 , 10));
		customerInfo.add(tittle , BorderLayout.NORTH);
		customerInfo.setPreferredSize(new Dimension(300 , 200));
		customerInfo.setBorder(new EmptyBorder(10 , 10 , 5 , 10));
		customerInfo.setBackground(MenuFrame.buttonColor);
		customerInfo.setOpaque(true);
		
		//customerInfo.setOpaque(true);
		
		JLabel middlePart = new JLabel();
		middlePart.setLayout(new GridLayout(10 , 1 , 20 , 20));
		middlePart.setBackground(MenuFrame.buttonColor);
		middlePart.setBorder(new EmptyBorder(10 , 20 , 10 , 20));
		middlePart.setOpaque(true);
		
		
		
		
		JLabel customerLabel;
		JLabel customerName;
		JLabel customerAge;
		JLabel customerBooking;
		
		for (Customer c : customerList) {
			customerLabel = new JLabel();
			customerName = new JLabel();
			customerAge = new JLabel();
			customerBooking = new JLabel();
			
			customerLabel.setLayout(new GridLayout(3 , 1 , 10 , 10));
			customerLabel.setHorizontalAlignment(JLabel.CENTER);
			customerLabel.setVerticalAlignment(JLabel.CENTER);
			
			customerName.setText("Name: " + c.getName());
			customerAge.setText("Age: " + c.getAge());
			customerBooking.setText("Booking No: " + c.getSeasionnumber());
			
			customerLabel.add(customerName);
			customerLabel.add(customerAge);
			customerLabel.add(customerBooking);
			customerLabel.setBackground(MenuFrame.textColor);
			customerLabel.setOpaque(true);
			
			middlePart.add(customerLabel);
		}
		customerInfo.add(middlePart , BorderLayout.CENTER);
	}
	
	public void stockInfo() {
		//JLabel foodLabel;
		JLabel tittle = new JLabel("Stocks");
		tittle.setHorizontalAlignment(JLabel.CENTER);
		
		info.setEditable(false);
		info.setBackground(MenuFrame.foregroundColor);
		
		stockInfo.setHorizontalAlignment(JLabel.CENTER);
		stockInfo.setPreferredSize(new Dimension(350 , 1200));
		stockInfo.setBorder(new EmptyBorder(10 , 10 , 5 , 10));
		stockInfo.setBackground(MenuFrame.foregroundColor);
		stockInfo.setLayout(new BorderLayout(5 , 5));
		stockInfo.add(info , BorderLayout.CENTER);
		stockInfo.add(tittle , BorderLayout.NORTH);
		stockInfo.setOpaque(true);
		
	}
	
	public static void updateStockInfo() {
		info.setText(DbManager.stockInfo());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
