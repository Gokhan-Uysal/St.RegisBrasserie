package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.BaseFoods;
import Foods.mainDishes.Mantı;
import Foods.mainDishes.Meatball;
import Foods.mainDishes.SeaBass;
import Foods.mainDishes.Steak;
import Foods.mainDishes.Tenderloin;

public class MainDishes {
	
	private ArrayList<BaseFoods> mainDishes;
	
	private BaseFoods mantı;
	private BaseFoods meatBall;
	private BaseFoods seaBass;
	private BaseFoods steak;
	private BaseFoods tenderloin;
	
	public MainDishes() {
		mainDishes = new ArrayList<BaseFoods>();
		
		mantı = new Mantı("Mantı" , 10 , new ImageIcon());
		meatBall = new Meatball("Meatball" , 10 , new ImageIcon());
		seaBass = new SeaBass("Sea Bass" , 10 , new ImageIcon());
		steak = new Steak("Cowboy Ribeye Steak" , 10 , new ImageIcon());
		tenderloin = new Tenderloin("Grilled Tenderloin" , 10 , new ImageIcon());
		
		mainDishes.add(mantı);
		mainDishes.add(meatBall);
		mainDishes.add(seaBass);
		mainDishes.add(steak);
		mainDishes.add(tenderloin);
	}
	
	
}
