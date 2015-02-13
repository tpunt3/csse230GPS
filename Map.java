import java.util.ArrayList;


public class Map {
	
	public ArrayList<Stars> starList;
	
	public Map() {
		starList = new ArrayList<Stars>();
	}
	
	public void DrawStars() {
		for(int i = 0; i < starList.size()-1; i++) {
			if(starList.get(i).getValue()==true) {
				starList.get(i).drawOn();
			}
			else {
				// do nothing
			}
		}
	}
	
	//Displays states and Capitals
	//Displays routes to be traveled

}
