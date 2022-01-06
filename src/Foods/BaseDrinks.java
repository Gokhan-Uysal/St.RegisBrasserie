package Foods;

import javax.swing.ImageIcon;

public abstract class BaseDrinks extends BaseFoods{
	
	private String origin;
	
	public String getOrigin() {
		return this.origin;
	}
	public BaseDrinks(String name, float price, ImageIcon img , String origin) {
		super(name, price, img);
		this.origin = origin;
		// TODO Auto-generated constructor stub
	}
}
