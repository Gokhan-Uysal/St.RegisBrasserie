package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.BaseDrinks;
import Foods.drinks.Champagne;
import Foods.drinks.Coke;
import Foods.drinks.Red;
import Foods.drinks.Rose;
import Foods.drinks.Soda;
import Foods.drinks.Water;
import Foods.drinks.White;

public class Drinks {
	
	private ArrayList<BaseDrinks> drinks;
	
	private BaseDrinks cokeZero;
	private BaseDrinks coke;
	private BaseDrinks soda;
	private BaseDrinks water;
	private BaseDrinks champagne;
	private BaseDrinks red;
	private BaseDrinks white;
	private BaseDrinks rose;
	
	public Drinks() {
		drinks = new ArrayList<BaseDrinks>();
		
		cokeZero = new Coke("Coca Cola Zero" , 10 , new ImageIcon() , "America");
		coke = new Coke("Coca Cola" , 10 , new ImageIcon() , "America");
		water = new Water("Erikli Water" , 10 , new ImageIcon() , "Turkey");
		soda = new Soda("Niğde Sparkling Water" , 10 , new ImageIcon() , "Turkey");
		champagne = new Champagne("G.H. Mumm. Cordon Rouge Brut. Champagne" , 10 , new ImageIcon() , "France");
		red = new Red("Château Kaloak Red" , 10 , new ImageIcon() , "Turkey");
		white = new White("Terre Rosse, Pinot Grigio White" , 10 , new ImageIcon() , "Italy");
		rose = new Rose("Château d'Esclans, Whisperina Angel Rosé" , 10 , new ImageIcon() , "France");
		
		drinks.add(coke);
		drinks.add(cokeZero);
		drinks.add(water);
		drinks.add(soda);
		drinks.add(champagne);
		drinks.add(red);
		drinks.add(white);
		drinks.add(rose);
	}
	
	
}
