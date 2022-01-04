package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.BaseFoods;
import Foods.salads.GevurDağı;
import Foods.salads.Sezar;
import Foods.salads.Yedikule;

public class Salads{
	 
	ArrayList<BaseFoods> salads;
	
	public ArrayList<BaseFoods> getStarters() {
		return this.salads;
	}
	
	private BaseFoods gevurDağı;
	private BaseFoods sezar;
	private BaseFoods yedikule;
	
	public Salads() {
		salads = new ArrayList<BaseFoods>();
		
		gevurDağı = new GevurDağı("Gevur Dağı" , 10 , new ImageIcon("src/Pictures/FoodImg/Salads/gavurdağı salatası.jpg"));
		sezar = new Sezar("Sezar" , 10 , new ImageIcon("src/Pictures/FoodImg/Salads/sezar salatası.jpg"));
		yedikule = new Yedikule("Yedikule" , 10 , new ImageIcon("src/Pictures/FoodImg/Salads/yedikule salatası.jpg"));
		
		salads.add(gevurDağı);
		salads.add(sezar);
		salads.add(yedikule);
	}
	
	
}
