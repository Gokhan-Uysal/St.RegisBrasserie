package Menu;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Foods.AppetizerPlate;
import Foods.BaseFoods;
import Foods.CheesePlate;
import Foods.DelicatessenPlate;

public class Starters {
	
	private ArrayList<BaseFoods> starters;
	
	BaseFoods appetizerPlate = new AppetizerPlate("Appetizer Plate" , 10 , new ImageIcon());
	BaseFoods cheesePlate = new CheesePlate("Cheese Plate" , 10 , new ImageIcon());
	BaseFoods delicatessenPlate = new DelicatessenPlate("Delicatessen Plate" , 10 , new ImageIcon());
	public Starters() {
		starters = new ArrayList<BaseFoods>();
		
		starters.add(appetizerPlate);
		starters.add(cheesePlate);
		starters.add(delicatessenPlate);
	}
	
}
