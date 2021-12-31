package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.BaseFoods;
import Foods.starters.AppetizerPlate;
import Foods.starters.CheesePlate;
import Foods.starters.DelicatessenPlate;
import Foods.starters.OctopusCarpaccio;

public class Starters {
	
	private ArrayList<BaseFoods> starters;
	
	BaseFoods appetizerPlate;
	BaseFoods cheesePlate;
	BaseFoods delicatessenPlate;
	BaseFoods octopusCarpaccio;
	
	public ArrayList<BaseFoods> getStarters() {
		return this.starters;
	}
	
	public Starters() {
		starters = new ArrayList<BaseFoods>();
		appetizerPlate = new AppetizerPlate("Appetizer Plate" , 10 , new ImageIcon());
		cheesePlate = new CheesePlate("Cheese Plate" , 10 , new ImageIcon());
		delicatessenPlate = new DelicatessenPlate("Delicatessen Plate" , 10 , new ImageIcon());
		octopusCarpaccio = new OctopusCarpaccio("Octopus Carpaccio" , 10 , new ImageIcon());
		
		
		starters.add(appetizerPlate);
		starters.add(cheesePlate);
		starters.add(delicatessenPlate);
		starters.add(octopusCarpaccio);
	}
	
}
