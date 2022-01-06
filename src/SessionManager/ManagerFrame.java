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
	
	private JLabel stockInfo;
	private JLabel customerInfo;
	
	private JScrollPane scrollPane;
	
	private DbManager Db;
	
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public ManagerFrame() {
		mainPanel = new JPanel();
		stockInfo = new JLabel();
		
		customerInfo = new JLabel();
		
		Db = new DbManager();
		
		mainPanel();
		stockInfo();
		
		scrollPane = new JScrollPane(mainPanel , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		this.setLayout(new BorderLayout());
		this.setSize(new Dimension(720 , 920));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(10 , 10));
		this.setVisible(true);
		this.setResizable(false);
		this.add(mainPanel , BorderLayout.CENTER);
		this.add(stockInfo , BorderLayout.SOUTH);

	}
	
	public void mainPanel() {
		mainPanel.setLayout(new BorderLayout(10 , 10));
		mainPanel.setBackground(Color.black);
		//mainPanel.add(stockInfo , BorderLayout.SOUTH);
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
			System.out.println(info);
			stockInfo.add(foodLabel);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
