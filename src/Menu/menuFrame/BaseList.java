package Menu.menuFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Menu.Desserts;
import Menu.Drinks;
import Menu.FoodTypes;
import Menu.MainDishes;
import Menu.Pastas;
import Menu.Salads;
import Menu.Soups;
import Menu.Starters;

public abstract class BaseList extends JPanel{
	
	protected FoodTypes foods;
	protected int foodCount;
	protected int columnCount;
	protected int height;
	
	public BaseList() {
		foodCount = 0;
		columnCount = 0;
		height = 0;
		this.setBackground(MenuFrame.foregroundColor);
	}
	
	public abstract void makeList();

}
