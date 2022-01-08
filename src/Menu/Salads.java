package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.BaseFoods;
import Foods.salads.GevurDagi;
import Foods.salads.Sezar;
import Foods.salads.Yedikule;

public class Salads extends FoodTypes{
	 
	ArrayList<BaseFoods> salads;
	
	public ArrayList<BaseFoods> getList() {
		return this.salads;
	}
	
	private BaseFoods gevurDagi;
	private BaseFoods sezar;
	private BaseFoods yedikule;
	
	public Salads() {
		salads = new ArrayList<BaseFoods>();
		
		gevurDagi = new GevurDagi("Gevur Dagi" , 60 , new ImageIcon("src/Pictures/FoodImg/Salads/gavurdağı salatası.jpg"));
		sezar = new Sezar("Sezar" , 65 , new ImageIcon("src/Pictures/FoodImg/Salads/sezar salatası.jpg"));
		yedikule = new Yedikule("Yedikule" , 70 , new ImageIcon("src/Pictures/FoodImg/Salads/yedikule salatası.jpg"));
		
		salads.add(gevurDagi);
		salads.add(sezar);
		salads.add(yedikule);
	}
	
	
}
