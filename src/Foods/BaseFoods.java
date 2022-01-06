package Foods;

import javax.swing.ImageIcon;


public abstract class BaseFoods{
	
	protected String name;
	protected float price;
	protected ImageIcon img;
	
	public String getName() {
		return this.name;
	}
	
	public ImageIcon getImg() {
		return this.img;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public BaseFoods(String name, float price , ImageIcon img) {
		super();
		this.name = name;
		this.price = price;
		this.img = img;
	}
}
