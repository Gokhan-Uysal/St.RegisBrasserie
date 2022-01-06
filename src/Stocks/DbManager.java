package Stocks;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Foods.BaseFoods;

public class DbManager implements IDbManager{
	private ArrayList<String> lines;
	private static Map<String , Integer> Db;

	
	public static Map<String, Integer> getDb() {
		return Db;
	}

	private static StringBuilder stockInfoText = new StringBuilder();
	
	public DbManager() {
		lines = new ArrayList<String>();
		Db = new LinkedHashMap<String , Integer>();
		connectToDb();
		extractData();
	}
	
	@Override
	public void connectToDb() {
		try(Scanner input = new Scanner(Paths.get("src/Stocks/Db.txt"))){
			while(input.hasNext()) {
				String line = input.nextLine().trim();
				lines.add(line);
			}
		}
		catch(IOException | NoSuchElementException e) {
			System.err.println(e);
		}
	}
	
	@Override
	public void extractData() {
		for (String line : lines) {
			try {
				String foodName = line.split("-")[0].trim();
				int amount = Integer.parseInt(line.split("-")[1].trim());
				
				Db.put(foodName, amount);
			}
			catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
				System.err.println(e);
				continue;
			}
		}
	}

	public static int returnStock(BaseFoods food) {
		for (Entry<String , Integer> stock : DbManager.Db.entrySet()) {
			if (stock.getKey().equals(food.getName().trim())) {
				return stock.getValue();
			}
		}
		return -1;
	}


	public static boolean checkStock(BaseFoods food) {
		// TODO Auto-generated method stub
		for (Entry<String , Integer> stock : DbManager.Db.entrySet()) {
			if (stock.getKey().equals(food.getName().trim())) {
				if (stock.getValue() > 0) {
					return true;
				}
			}
		}
		System.out.println("Out of stock");
		return false;
	}


	public static void removeStock(BaseFoods food) {
		for (Entry<String , Integer> stock : DbManager.Db.entrySet()) {
			if (stock.getKey().equals(food.getName().trim())) {
				if (checkStock(food)) {
					stock.setValue(stock.getValue() - 1);
				}
			}
		}
	}

	public static void addStock(BaseFoods food) {
		// TODO Auto-generated method stub
		for (Entry<String , Integer> stock : DbManager.Db.entrySet()) {
			if (stock.getKey().equals(food.getName().trim())) {
				stock.setValue(stock.getValue() + 1);
			}
		}
	}
	
	public static void writeToFile() throws FileNotFoundException {
		
		// TODO Auto-generated method stub
		try(Formatter data = new Formatter("src/Stocks/Db.txt")){
			for (Entry<String , Integer> foodStock : Db.entrySet()) {
				data.format("%s-%d\n" , foodStock.getKey() , foodStock.getValue());
			}
		}
		catch(FileNotFoundException e) {
			System.err.println("File does not exsists");
		}
	}

	public static String stockInfo() {
		for (Entry<String , Integer> stockFood : Db.entrySet()) {
			stockInfoText.append(stockFood.getKey().trim());
			stockInfoText.append(" ");
			stockInfoText.append(stockFood.getValue());
			stockInfoText.append("\n\n");
		}
		return stockInfoText.toString();
	}
}
