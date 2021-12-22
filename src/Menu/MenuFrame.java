package Menu;

import javax.swing.JFrame;

public class MenuFrame extends JFrame{
	
	private String title;
	private int[] size;
	
	public MenuFrame(){
		size = new int[2];
		size[0] = 1920;
		size[1] = 1080;
		title = "Menu";
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(size[0] , size[1]);
		this.setVisible(true);
	}
}
