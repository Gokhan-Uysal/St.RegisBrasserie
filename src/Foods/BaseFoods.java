package Foods;

import javax.swing.ImageIcon;

import Stocks.IFoods;

public abstract class BaseFoods implements IFoods{
	
	protected String name;
	protected int stockCount;
	protected ImageIcon img;
	
	
	public BaseFoods(String name, int stockCount, ImageIcon img) {
		super();
		this.name = name;
		this.stockCount = stockCount;
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
