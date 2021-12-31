package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.BaseFoods;
import Foods.soups.ChichkenSoup;
import Foods.soups.EzogelinSoup;
import Foods.soups.SoupOfTheDay;

public class Soups {
	
	private ArrayList<BaseFoods> soups;
	
	public ArrayList<BaseFoods> getStarters() {
		return this.soups;
	}
	
	private BaseFoods chichkenSoup;
	private BaseFoods ezogelinSoup;
	private BaseFoods soupOfTheDay;
	
	public Soups() {
		soups = new ArrayList<BaseFoods>();
		chichkenSoup = new ChichkenSoup("Chichken Soup" , 10 , new ImageIcon());
		ezogelinSoup = new EzogelinSoup("Ezogelin Soup " , 10 , new ImageIcon());
		soupOfTheDay = new SoupOfTheDay("Soup Of The Day" , 10 , new ImageIcon());
		
		soups.add(chichkenSoup);
		soups.add(ezogelinSoup);
		soups.add(soupOfTheDay);
	}
	
	
}
