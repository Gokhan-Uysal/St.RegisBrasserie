package Foods;

import javax.swing.ImageIcon;

import Stocks.IFoods;

public abstract class BaseFoods implements IFoods{
	
	protected String name;
	protected int stockCount;
	protected float price;
	protected ImageIcon img;
	
	
	public BaseFoods(String name, float price , ImageIcon img) {
		super();
		this.name = name;
		this.price = price;
		this.stockCount = 0;
		this.img = img;
	}


	@Override
	public void addStock() {
		// TODO Auto-generated method stub
		this.stockCount += 1;
	}


	@Override
	public void removeStock() {
		// TODO Auto-generated method stub
		if (checkStock()) {
			this.stockCount -= 1;
		}
	}


	@Override
	public boolean checkStock() {
		// TODO Auto-generated method stub
		if (this.stockCount <= 0) {
			System.out.println("Out of stock");
			return false;
		}
		else {
			return true;
		}
	}
	
	
}
