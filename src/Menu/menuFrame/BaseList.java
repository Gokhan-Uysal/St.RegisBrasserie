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
		downCast();
		foodCount = 0;
		columnCount = 0;
		height = 0;
		this.setBackground(Color.LIGHT_GRAY);
	}
	
	public void makeList() {
		// TODO Auto-generated method stub
				JLabel foodLabel;
				for (int i = 0; i < this.foodCount; i++) {
					foodLabel = new FoodPanel(((Starters) foods).getList().get(i));
					this.add(foodLabel);
					
				}
	}
	
	public void downCast() {
		try {
			this.foods = (Starters) foods;
		}
		catch(ClassCastException e) {
			System.err.println(e);
		}
		
		try {
			this.foods = (Salads) foods;
		}
		catch(ClassCastException e) {
			System.err.println(e);
		}
		
		try {
			this.foods = (Soups) foods;
		}
		catch(ClassCastException e) {
			System.err.println(e);
		}
		
		try {
			this.foods = (Pastas) foods;
		}
		catch(ClassCastException e) {
			System.err.println(e);
		}
		
		try {
			this.foods = (MainDishes) foods;
		}
		catch(ClassCastException e) {
			System.err.println(e);
		}
		
		try {
			this.foods = (Drinks) foods;
		}
		catch(ClassCastException e) {
			System.err.println(e);
		}
		
		try {
			this.foods = (Desserts) foods;
		}
		catch(ClassCastException e) {
			System.err.println(e);
		}
	}
}
