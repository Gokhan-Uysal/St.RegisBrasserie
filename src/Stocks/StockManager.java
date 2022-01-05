package Stocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StockManager {

	
	public static void connection() throws SQLException {
		//String url = "jdbc:postgresql:///stock-manager?socketFactory=com.google.cloud.sql.postgres.SocketFactory&cloudSqlInstance=	\n"
				//+ "restaurant-manager-337114:europe-west4:stock-manager:stock-manager";
		String url = "jdbc:postgresql://localhost:5432/stock-manager";
		Connection connection;
		
		try {
			connection = DriverManager.getConnection(url , "guysal" , "1029384756!");
			System.out.println("Connected!");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
