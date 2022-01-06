package SessionManager;

import Menu.menuFrame.MenuFrame;

public class Customer {
	
	private String name;
	private int age;
	private int seasionnumber;
	
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
		
		MenuFrame menu = new MenuFrame(this.name , this.seasionnumber , this.age);
		menu.setLocation(300 , 300);
	}
	
	
}
