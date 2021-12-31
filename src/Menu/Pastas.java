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
		spaghetti = new Spaghetti("Spaghetti Al Ragu" , 10 , new ImageIcon());
		penne = new Penne("Penne Primavera" , 10 , new ImageIcon());
		fettuccine = new Fettuccine("Fettuccine Alfredo" , 10 , new ImageIcon());
		tortellini = new Tortellini("Seafood Tortellini" , 10 , new ImageIcon());
		
		pastas.add(spaghetti);
		pastas.add(penne);
		pastas.add(fettuccine);
		pastas.add(tortellini);
	}
	
	
}
