import java.io.IOException;
import java.util.ArrayList;

public class CrossCountryTouring {

	public static ArrayList<City> cities;
	
	public static void main(String[] args) throws IOException {

		ReadFile file1 = new ReadFile(
				"C:/EclipseWorkspaces/csse230/CrossCountryTouring/src/CapitalInfo");
		String[] arrayOfLines = file1.OpenFile();
		Graph USGraph = new Graph(arrayOfLines);

	}

}