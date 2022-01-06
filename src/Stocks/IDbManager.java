package Stocks;

import java.io.FileNotFoundException;

import Foods.BaseFoods;

public interface IDbManager {
	void connectToDb();
	void extractData();
	int returnStock(BaseFoods food);
	boolean checkStock(BaseFoods food);
	void removeStock(BaseFoods food);
	void addStock(BaseFoods food);
}
