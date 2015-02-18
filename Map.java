import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class Map {
	
	public ArrayList<Stars> starList;
	public Graphics graphics;
	
	public Map() {
		starList = new ArrayList<Stars>();
	}
	
	public void DrawStars() {
		for(int i = 0; i < starList.size()-1; i++) {
			if(starList.get(i).getValue()==true) {
				starList.get(i).paintComponent(graphics);
				// where the 0's are the x and y locations of where to draw the object
			}
			else {
				starList.get(i).paintComponent(graphics);
				// where the 0's are the x and y locations of where to draw the object
			}
		}
	}
	
	//Displays states and Capitals
	//Displays routes to be traveled

}
