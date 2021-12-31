package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.BaseFoods;
import Foods.starters.AppetizerPlate;
import Foods.starters.CheesePlate;
import Foods.starters.DelicatessenPlate;
import Foods.starters.GrilledBroccoli;
import Foods.starters.OctopusCarpaccio;
import Foods.starters.PotatoChips;

public class Starters {
	
	private ArrayList<BaseFoods> starters;
	
	private BaseFoods appetizerPlate;
	private BaseFoods cheesePlate;
	private BaseFoods delicatessenPlate;
	private BaseFoods octopusCarpaccio;
	private BaseFoods potatoChips;
	private BaseFoods grilledBroccoli;
	
	public ArrayList<BaseFoods> getStarters() {
		return this.starters;
	}
	
	public Starters() {
		starters = new ArrayList<BaseFoods>();
		appetizerPlate = new AppetizerPlate("Appetizer Plate" , 10 , new ImageIcon());
		cheesePlate = new CheesePlate("Cheese Plate" , 10 , new ImageIcon());
		delicatessenPlate = new DelicatessenPlate("Delicatessen Plate" , 10 , new ImageIcon());
		octopusCarpaccio = new OctopusCarpaccio("Octopus Carpaccio" , 10 , new ImageIcon());
		potatoChips = new PotatoChips("Potato Chips" , 10 , new ImageIcon());
		grilledBroccoli = new GrilledBroccoli("Grilled Broccoli" , 10 , new ImageIcon());
		
		starters.add(appetizerPlate);
		starters.add(cheesePlate);
		starters.add(delicatessenPlate);
		starters.add(octopusCarpaccio);
		starters.add(potatoChips);
		starters.add(grilledBroccoli);
	}
	
}
