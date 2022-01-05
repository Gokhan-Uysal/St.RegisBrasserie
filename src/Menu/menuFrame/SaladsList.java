package Menu.menuFrame;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;

import Menu.Salads;
import Menu.Starters;

public class SaladsList extends BaseList{
	
	public SaladsList() {
		this.foods = new Salads();
		this.foodCount = ((Salads) foods).getList().size();
		// TODO Auto-generated constructor stub
		if (this.foodCount % 2 == 0) {
			this.columnCount = foodCount / 2;
		}
		else if (this.foodCount % 2 == 1) {
			this.columnCount = (foodCount + 1) / 2;
		}
		
		this.height = columnCount * 200 + (columnCount - 1) * 40;
		
		this.setLayout(new GridLayout(this.columnCount , 2 ,  5 , 5));
		this.setPreferredSize(new Dimension(520 , height));

		makeList();
	}

	@Override
	public void makeList() {
		// TODO Auto-generated method stub
		JLabel foodLabel;
		for (int i = 0; i < this.foodCount; i++) {
			foodLabel = new FoodPanel(((Salads) foods).getList().get(i));
			this.add(foodLabel);
			
		}
		
	}
}
