package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuFrame extends JFrame implements ActionListener{
	
	private String title;
	private JPanel foods;
	
	public MenuFrame(){
		//Init components
		foods = new JPanel();
		
		title = "Menu";
		this.setTitle(title);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		foodPanel();
	}
	
	public void foodPanel() {
		foods.setBackground(Color.magenta);
		foods.setPreferredSize(new Dimension(100 , 200));
		this.add(foods , BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
