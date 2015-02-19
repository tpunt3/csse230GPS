import java.io.IOException;
import java.util.ArrayList;

public class CrossCountryTouring {

	public static ArrayList<City> cities;
	
	public static void main(String[] args) throws IOException {

		ReadFile file1 = new ReadFile(
				"C:/Users/harrislb/Documents/EclipseWorkspaces/csse220/230 Project/src/CapitalInfo");
		String[] arrayOfLines = file1.OpenFile();
		
		ReadFile file2=new ReadFile("C:/Users/harrislb/Documents/EclipseWorkspaces/csse220/230 Project/src/poiandratings.txt");
		String[] arrayOfPoi = file2.OpenFile();
		Graph USGraph = new Graph(arrayOfLines,arrayOfPoi);

	}

}