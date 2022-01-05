package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.BaseFoods;
import Foods.mainDishes.Mantı;
import Foods.mainDishes.Meatball;
import Foods.mainDishes.SeaBass;
import Foods.mainDishes.Steak;
import Foods.mainDishes.Tenderloin;

public class MainDishes extends FoodTypes{
	
	private ArrayList<BaseFoods> mainDishes;
	
	public ArrayList<BaseFoods> getList(){
		return this.mainDishes;
	}
	
	private BaseFoods mantı;
	private BaseFoods meatBall;
	private BaseFoods seaBass;
	private BaseFoods steak;
	private BaseFoods tenderloin;
	
	public MainDishes() {
		mainDishes = new ArrayList<BaseFoods>();
		
		mantı = new Mantı("Mantı" , 70 , new ImageIcon("src/Pictures/FoodImg/Main Course/manti.jpg"));
		meatBall = new Meatball("Meatball" , 80 , new ImageIcon("src/Pictures/FoodImg/Main Course/meatball.jpg"));
		//seaBass = new SeaBass("Sea Bass" , 110 , new ImageIcon("src/Pictures/FoodImg/"));
		steak = new Steak("Cowboy Ribeye Steak" , 260 , new ImageIcon("src/Pictures/FoodImg/Main Course/cowboyRibeyeSteak.jpg"));
		tenderloin = new Tenderloin("Grilled Tenderloin" , 140 , new ImageIcon("src/Pictures/FoodImg/Main Course/grilledTenderlion.jpg"));
		
		mainDishes.add(mantı);
		mainDishes.add(meatBall);
		//mainDishes.add(seaBass);
		mainDishes.add(steak);
		mainDishes.add(tenderloin);
	}
	
	
}
