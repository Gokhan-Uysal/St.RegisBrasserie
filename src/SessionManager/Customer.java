package SessionManager;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import Menu.menuFrame.MenuFrame;

public class Customer {
	
	private String name;
	private int age;
	private int seasionnumber;
	private Map<String , Integer> customerOrder;
	
	
	
	public Map<String, Integer> getCustomerOrder() {
		return customerOrder;
	}


	public void setCustomerOrder(Map<String, Integer> customerOrder) {
		this.customerOrder = customerOrder;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSeasionnumber() {
		return seasionnumber;
	}


	public void setSeasionnumber(int seasionnumber) {
		this.seasionnumber = seasionnumber;
	}


	public Customer(String name , int seasionnumber ,  int age)  {
		super();
		this.name = name;
		this.age = age;
		this.seasionnumber = seasionnumber;
		
		customerOrder = new LinkedHashMap<String , Integer>();
		MenuFrame menu = new MenuFrame(this.name , this.seasionnumber , this.age);
		menu.setLocation(300 , 300);
	}
	
}
