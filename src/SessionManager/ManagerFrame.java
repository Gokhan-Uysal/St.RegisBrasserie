package SessionManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
	
	private JLabel stockInfo = new JLabel();
	private JLabel customerInfo = new JLabel();
	
	private JScrollPane scrollPane;
	
	private DbManager Db;
	
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public ManagerFrame() {
		mainPanel = new JPanel();
		
		
		Db = new DbManager();
		
		mainPanel();
		stockInfo();
		customerLabel();
		
		scrollPane = new JScrollPane(mainPanel , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		this.setLayout(new BorderLayout());
		this.setSize(new Dimension(1080 , 1080));
		this.setLayout(new BorderLayout(10 , 10));
		this.setVisible(true);
		this.setResizable(false);
		this.add(mainPanel , BorderLayout.CENTER);
		this.add(stockInfo , BorderLayout.SOUTH);

	}
	
	public void mainPanel() {
		mainPanel.setLayout(new BorderLayout(10 , 10));
		mainPanel.setBackground(Color.black);
		mainPanel.add(customerInfo , BorderLayout.NORTH);
		//mainPanel.add(stockInfo , BorderLayout.SOUTH);
	}
	
	public void customerLabel() {
		customerInfo.setLayout(new GridLayout(customerList.size() / 4 , 4 , 20 , 20));
		customerInfo.setBackground(MenuFrame.buttonColor);
		customerInfo.setPreferredSize(new Dimension(0 , 100));
		customerInfo.setBorder(new EmptyBorder(10 , 20 , 10 , 20));
		customerInfo.setOpaque(true);
		
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
			
			customerLabel.setBackground(MenuFrame.labelColor);
			customerLabel.setOpaque(true);
			customerInfo.add(customerLabel);
		}
	}
	
	public void stockInfo() {
		JLabel foodLabel;
		String info = "";

		stockInfo.setHorizontalAlignment(JLabel.CENTER);
		stockInfo.setPreferredSize(new Dimension(0 , 350));
		stockInfo.setBorder(new EmptyBorder(10 , 10 , 5 , 10));
		stockInfo.setBackground(MenuFrame.foregroundColor);
		stockInfo.setLayout(new GridLayout(DbManager.getDb().size() / 3 , 3 , 5 , 5));
		stockInfo.setOpaque(true);
		

		for (Entry<String , Integer> foodStock : DbManager.getDb().entrySet()) {
			info = foodStock.getKey().trim() + "  " + foodStock.getValue();
			foodLabel = new JLabel(info);
			stockInfo.add(foodLabel);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
