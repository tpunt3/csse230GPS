import java.io.IOException;
import java.util.ArrayList;


public class CrossCountryTouring {
	
	public static void main(String[] args) throws IOException{
	
	CCFrame newFrame = new CCFrame();
	newFrame.setVisible(true);
	newFrame.setTitle("CrossCountryTouring");
	
	ReadFile file1 = new ReadFile("C:/EclipseWorkspaces/csse220/230 Project/src/CapitalInfo");
	String[] arrayOfLines = file1.OpenFile();
	ArrayList<City> cities = new ArrayList<City>();
	for(int i = 0; i<arrayOfLines.length; i++){
		cities.add(new City(arrayOfLines[i]));
	}
	
	
	}
	
}