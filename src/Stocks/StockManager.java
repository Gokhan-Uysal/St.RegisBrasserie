package Stocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StockManager {

	
	public static void connection() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/FoodStocks";
		Connection connection;
		
		try {
			connection = DriverManager.getConnection(url , "postgres" , "Golden05061881!");
			System.out.println("Connected!");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
