package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.BaseFoods;
import Foods.desserts.Baklava;
import Foods.desserts.CheeseCake;
import Foods.desserts.ChocolateSouffle;
import Foods.desserts.RicePudding;

public class Desserts{

	private ArrayList<BaseFoods> desserts;
	
	public ArrayList<BaseFoods> getDesserts(){
		return this.desserts;
	}
	
	private BaseFoods baklava;
	private BaseFoods cheeseCake;
	private BaseFoods chocolateSouffle;
	private BaseFoods ricePudding;
	
	public Desserts() {
		desserts = new ArrayList<BaseFoods>();
		
		baklava = new Baklava("Baklava" , 10 , new ImageIcon("src/Pictures/FoodImg/Desserts/i.jpg"));
		cheeseCake = new CheeseCake("Cheese Cake" , 10 , new ImageIcon("src/Pictures/FoodImg/Desserts/i(1).jpg"));
		chocolateSouffle = new ChocolateSouffle("Chocolate Souffle" , 10 , new ImageIcon("src/Pictures/FoodImg/Desserts/i(2).jpg"));
		ricePudding = new RicePudding("Rice Pudding" , 10 , new ImageIcon("src/Pictures/FoodImg/Desserts/i(3).jpg"));
		
		desserts.add(baklava);
		desserts.add(cheeseCake);
		desserts.add(chocolateSouffle);
		desserts.add(ricePudding);
		
	}

}
