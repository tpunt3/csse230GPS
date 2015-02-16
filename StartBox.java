import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JComboBox;


public class StartBox<E> extends JComboBox<E> {
	private POIPanel pPanel;
	
	public StartBox(){
		super();
		addActionListener(this);
	}
	
	public StartBox(E[] items, POIPanel pP){
		super(items);
		addActionListener(this);
		this.pPanel = pP;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		ReadFile file1 = new ReadFile(
				"C:/EclipseWorkspaces/csse230/CrossCountryTouring/src/CapitalInfo");
		String[] arrayOfLines = null;
		try {
			arrayOfLines = file1.OpenFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<City> cities = new ArrayList<City>();
		for (int i = 0; i < arrayOfLines.length - 1; i++) {
			cities.add(new City(arrayOfLines[i]));
		}

		int j = 0;
		for(int i = 0; i<cities.size();i++){
			if(  (cities.get(i).CityName.compareTo(this.getSelectedItem().toString()))==0 ){
				j=i;
			}
		}
		
		System.out.println(cities);
		
		this.pPanel.aboutOrigin.setText(null);
		this.pPanel.aboutOrigin.insert("Origin City: "+this.getSelectedItem()
				+"\nRating: " + cities.get(j).Rating 
				+"\nPopulation: " + cities.get(j).Population,0);
	}
	
}
