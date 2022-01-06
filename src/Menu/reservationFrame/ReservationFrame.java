package Menu.reservationFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Menu.menuFrame.MenuFrame;
import SessionManager.Customer;
import SessionManager.ManagerFrame;

public class ReservationFrame extends JFrame implements ActionListener{
	
	private JPanel mainPanel;
	
	private JLabel infoLabel;
	private JLabel inputLabel;
	private JLabel nameLabel;
	private JLabel bookingLabel;
	private JLabel ageLabel;
	
	
	private JTextArea nameInput;
	private JTextArea bookingInput;
	private JTextArea ageInput;
	
	private JButton submitButton;
	
	public ReservationFrame() {
		mainPanel = new JPanel();
		
		infoLabel = new JLabel();
		inputLabel = new JLabel();
		nameLabel = new JLabel();
		bookingLabel = new JLabel();
		ageLabel = new JLabel();
		
		submitButton = new JButton("Submit");
		
		nameInput = new JTextArea();
		bookingInput = new JTextArea();
		ageInput = new JTextArea();
		
		mainPanel();
		infoLabel();
		inputLabel();
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(10 , 10));
		this.setSize(new Dimension(350 , 200));
		this.setBackground(MenuFrame.textColor);
		this.add(mainPanel , BorderLayout.CENTER);
		this.setResizable(false);
		
	}
	
	public void mainPanel() {
		mainPanel.setLayout(new BorderLayout(0 , 10));
		mainPanel.setPreferredSize(new Dimension(320 , 150));
		mainPanel.setBorder(new EmptyBorder(10 , 10 , 10 , 10));
		
		submitButton.setPreferredSize(new Dimension(10 , 20));
		submitButton.addActionListener(this);
		submitButton.setForeground(Color.white);
		submitButton.setBackground(MenuFrame.buttonColor);
		submitButton.setBorderPainted(false);
		submitButton.setOpaque(true);
		
		mainPanel.setBackground(MenuFrame.backgroundColor);
		mainPanel.add(submitButton , BorderLayout.SOUTH);
	}
	
	public void infoLabel() {
		infoLabel.setLayout(new GridLayout(3 , 1 , 1 , 1));
		infoLabel.setPreferredSize(new Dimension(100, 0));
		infoLabel.setOpaque(true);
		
		ageLabel.setText("Age: ");
		ageLabel.setForeground(MenuFrame.textColor);
		nameLabel.setText("Name: ");
		nameLabel.setForeground(MenuFrame.textColor);
		bookingLabel.setText("Booking: ");
		bookingLabel.setForeground(MenuFrame.textColor);
		
		
		ageLabel.setHorizontalAlignment(JLabel.RIGHT);
		nameLabel.setHorizontalAlignment(JLabel.RIGHT);
		bookingLabel.setHorizontalAlignment(JLabel.RIGHT);
		
		infoLabel.add(nameLabel);
		infoLabel.add(ageLabel);
		infoLabel.add(bookingLabel);
		
		infoLabel.setBackground(MenuFrame.foregroundColor);
		mainPanel.add(infoLabel , BorderLayout.WEST);
	}
	
	public void inputLabel() {
		inputLabel.setLayout(new GridLayout(3 , 1 , 10 , 10));
		
		inputLabel.add(nameInput);
		nameInput.setBackground(MenuFrame.textColor);
		inputLabel.add(ageInput);
		ageInput.setBackground(MenuFrame.textColor);
		inputLabel.add(bookingInput);
		bookingInput.setBackground(MenuFrame.textColor);
		
		inputLabel.setVerticalAlignment(JLabel.CENTER);
		
		inputLabel.setBorder(new EmptyBorder(10 , 10 , 10 , 10));
		inputLabel.setPreferredSize(new Dimension(200 , 0));
		
		inputLabel.setBackground(MenuFrame.foregroundColor);
		inputLabel.setOpaque(true);
		mainPanel.add(inputLabel , BorderLayout.EAST);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == submitButton) {
			try {
				Customer newCustomer = new Customer(nameInput.getText() , Integer.parseInt(bookingInput.getText()) , Integer.parseInt(ageInput.getText()));
				ManagerFrame.getCustomerList().add(newCustomer);
				dispose();
			}
			catch(NumberFormatException | InputMismatchException  | NullPointerException e1) {
				System.err.println(e1);
			}
		}
		
	}

}
