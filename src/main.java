import java.sql.SQLException;

import javax.swing.ImageIcon;

import Foods.starters.AppetizerPlate;
import Menu.*;
import Starter.StartFrame;
import Stocks.StockManager;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StockManager.connection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StartFrame startFrame = new StartFrame();
	}

}
