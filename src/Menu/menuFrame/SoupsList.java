package Menu.menuFrame;

import java.awt.Dimension;
import java.awt.GridLayout;

import Menu.Soups;

public class SoupsList extends BaseList{
	
	public SoupsList() {
		this.foods = new Soups();
		this.foodCount = ((Soups) foods).getList().size();
		// TODO Auto-generated constructor stub
		if (this.foodCount % 2 == 0) {
			this.columnCount = foodCount / 2;
		}
		else if (this.foodCount % 2 == 1) {
			this.columnCount = (foodCount + 1) / 2;
		}
		
		this.height = columnCount * 200 + (columnCount - 1) * 40;
		
		this.setLayout(new GridLayout(this.columnCount , 2));
		this.setPreferredSize(new Dimension(520 , height));

		super.makeList();
	}
}
