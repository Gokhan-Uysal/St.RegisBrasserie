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

public class Drinks extends FoodTypes{
	
	private ArrayList<BaseDrinks> drinks;
	
	public ArrayList<BaseDrinks> getList() {
		return this.drinks;
	}
	
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
		
		cokeZero = new Coke("Coca Cola Zero" , 15 , new ImageIcon("src/Pictures/FoodImg/Drinks/i (1).jpg") , "America");
		coke = new Coke("Coca Cola" , 15 , new ImageIcon("src/Pictures/FoodImg/Drinks/i.jpg") , "America");
		water = new Water("Erikli Water" , 10 , new ImageIcon("src/Pictures/FoodImg/Drinks/i (4).jpg") , "Turkey");
		soda = new Soda("Nigde Sparkling Water" , 12 , new ImageIcon("src/Pictures/FoodImg/Drinks/Nigde Soda.jpg") , "Turkey");
		champagne = new Champagne("G.H. Mumm. Cordon Rouge Brut. Champagne" , 240 , new ImageIcon("src/Pictures/FoodImg/Drinks/g.h mumm cordon rouge.jpg") , "France");
		red = new Red("Chateau Kaloak Red" , 850 , new ImageIcon("src/Pictures/FoodImg/Drinks/chateau kaloak red.jpg") , "Turkey");
		white = new White("Terre Rosse, Pinot Grigio White" , 60 , new ImageIcon("src/Pictures/FoodImg/Drinks/terre rosse pinot grigio white.jpg") , "Italy");
		rose = new Rose("Chateau d'Esclans, Whisperina Angel Rose" , 75 , new ImageIcon("src/Pictures/FoodImg/Drinks/chateau d_esclans, whispering angels rose.jpg") , "France");
		
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
