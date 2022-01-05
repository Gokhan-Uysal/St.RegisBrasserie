package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.BaseFoods;
import Foods.pastas.Fettuccine;
import Foods.pastas.Penne;
import Foods.pastas.Spaghetti;
import Foods.pastas.Tortellini;

public class Pastas {
	
	private ArrayList<BaseFoods> pastas;
	
	public ArrayList<BaseFoods> getStarters() {
		return this.pastas;
	}
	
	private BaseFoods spaghetti;
	private BaseFoods penne;
	private BaseFoods fettuccine;
	private BaseFoods tortellini;
	
	public Pastas() {
		pastas = new ArrayList<BaseFoods>();
		spaghetti = new Spaghetti("Spaghetti Al Ragu" , 10 , new ImageIcon("src/Pictures/FoodImg/Pastas/spaghetti al ragu.jpg"));
		penne = new Penne("Penne Primavera" , 10 , new ImageIcon("src/Pictures/FoodImg/Pastas/penne primavera.jpg"));
		fettuccine = new Fettuccine("Fettuccine Alfredo" , 10 , new ImageIcon("src/Pictures/FoodImg/Pastas/fettuccine alfredo.jpg"));
		tortellini = new Tortellini("Seafood Tortellini" , 10 , new ImageIcon("src/Pictures/FoodImg/Pastas/seafood tortellini.jpg"));
		
		pastas.add(spaghetti);
		pastas.add(penne);
		pastas.add(fettuccine);
		pastas.add(tortellini);
	}
	
	
}
