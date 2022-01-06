package Menu.menuFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import Foods.BaseFoods;

public class FoodPanel extends JLabel implements ActionListener{

	//Text areas
	private JTextArea foodText;
	
	//Buttons
	private JButton addButton;
	private JButton removeButton;
	
	//Image icons
	private ImageIcon addIcon;
	private ImageIcon removeIcon;
	private ImageIcon foodImage;
	
	//Buttons label
	private JLabel subLabel;
	private JLabel imgLabel;
	private JLabel countLabel;
	
	//Food
	private BaseFoods food;
	
	//count
	private int count;
	
	public FoodPanel(BaseFoods food){
		this.food = food;
		addButton = new JButton();
		removeButton = new JButton();
		
		subLabel = new JLabel();
		imgLabel = new JLabel();
		countLabel = new JLabel();
		
		addIcon = new ImageIcon("src/Pictures/Icons/icons8-add-40.png");
		removeIcon = new ImageIcon("src/Pictures/Icons/icons8-minus-40.png");
		foodImage = food.getImg();
		
		foodText = new JTextArea();
		foodText.setEditable(false);
		
		count = 0;
		
		subLabel();
		imgLabel();
		
		this.setLayout(new BorderLayout(5  ,5));
		this.setOpaque(true);
		this.setBackground(MenuFrame.labelColor);
		this.add(subLabel , BorderLayout.SOUTH);
		this.add(imgLabel , BorderLayout.CENTER);
		
		
	}
	
	public void subLabel() {
		subLabel.setOpaque(true);
		subLabel.setLayout(new GridLayout( 1 , 3, 10 , 10));
		subLabel.setPreferredSize(new Dimension(100 , 50));
		
	
		addButton.setIcon(addIcon);
		removeButton.setIcon(removeIcon);
		
		addButton.setBackground(MenuFrame.labelColor);
		removeButton.setBackground(MenuFrame.labelColor);
		addButton.setBorderPainted(false);
		removeButton.setBorderPainted(false);
		
		addButton.addActionListener(this);
		removeButton.addActionListener(this);
		
		countLabel.setText(" " + count + " ");
		countLabel.setHorizontalAlignment(JLabel.CENTER);
		
		subLabel.setBackground(MenuFrame.labelColor);
		subLabel.setBorder(new EmptyBorder(2 , 20 , 2 , 20));
		
		subLabel.add(removeButton);
		subLabel.add(countLabel);
		subLabel.add(addButton);
		
	}
	
	public void imgLabel() {
		imgLabel.setOpaque(true);
		imgLabel.setHorizontalAlignment(JLabel.CENTER);
		imgLabel.setIcon(foodImage);
		imgLabel.setBackground(MenuFrame.labelColor);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addButton) {
			count += 1;
			MenuFrame.setTotalCost(MenuFrame.getTotalCost() + food.getPrice());
		}
		else if (e.getSource() == removeButton) {
			if (count > 0) {
				count -= 1;
				MenuFrame.setTotalCost(MenuFrame.getTotalCost() - food.getPrice());
			}
		}
		countLabel.setText(" " + count + " ");
		MenuFrame.costLabel.setText("" + MenuFrame.getTotalCost() + "₺");
	}
}
