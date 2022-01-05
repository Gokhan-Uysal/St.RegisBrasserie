package Menu.menuFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import Foods.BaseFoods;

public class FoodPanel extends JLabel implements ActionListener{

	//Text areas
	private JTextArea countText;
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
		
		addIcon = new ImageIcon("src/Icons/icons8-add-40.png");
		removeIcon = new ImageIcon("src/Icons/icons8-minus-40.png");
		foodImage = food.getImg();
		
		countText = new JTextArea();
		foodText = new JTextArea();
		
		count = 0;
		
		subLabel();
		imgLabel();
		
		this.setLayout(new BorderLayout(5  ,5));
		this.setOpaque(true);
		this.add(subLabel , BorderLayout.SOUTH);
		this.add(imgLabel , BorderLayout.CENTER);
		
		
	}
	
	public void subLabel() {
		subLabel.setOpaque(true);
		subLabel.setLayout(new FlowLayout(FlowLayout.CENTER , 20 , 2));
		subLabel.setPreferredSize(new Dimension(100 , 50));
		
		addButton.setPreferredSize(new Dimension(50 , 50));
		removeButton.setPreferredSize(new Dimension(50 , 50));
		
		addButton.setIcon(addIcon);
		removeButton.setIcon(removeIcon);
		
		addButton.addActionListener(this);
		removeButton.addActionListener(this);
	
		countText.setText("" + count);
		
		subLabel.setBackground(Color.white);
		subLabel.add(removeButton);
		subLabel.add(countText);
		subLabel.add(addButton);
	}
	
	public void imgLabel() {
		imgLabel.setOpaque(true);
		imgLabel.setIcon(foodImage);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addButton) {
			count += 1;
		}
		else if (e.getSource() == removeButton) {
			if (count > 0) {
				count -= 1;
			}
		}
		countText.setText("" + count);
	}
}
