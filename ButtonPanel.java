import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;


public class ButtonPanel extends Panel {
	
	protected DistanceButton dButton;
	protected TimeButton tButton;
	protected StartBox start;
	protected EndBox end;
	private MapPanel mPanel;
	private DirectionsPanel dPanel;
	private POIPanel pPanel;

	public ButtonPanel(MapPanel mP, DirectionsPanel dP, POIPanel pP) throws IOException{
		this.setBackground(Color.WHITE);
		this.mPanel = mP;
		this.dPanel = dP;
		this.pPanel = pP;
		
		ReadFile file1 = new ReadFile(
				"C:/EclipseWorkspaces/csse230/CrossCountryTouring/src/CapitalInfo");
		String[] arrayOfLines = file1.OpenFile();
		ArrayList<City> cities = new ArrayList<City>();
		for (int i = 0; i < arrayOfLines.length - 1; i++) {
			cities.add(new City(arrayOfLines[i]));
		}
		
		
		
		//making the buttons
		this.dButton = new DistanceButton("Shortest Distance", this, this.mPanel, this.dPanel, this.pPanel);
		this.tButton = new TimeButton("Shortest Time",this, this.mPanel, this.dPanel, this.pPanel);
	
		//making the comboboxes
		
		ArrayList<City> city = cities;
		
		Object[] stuff = new Object[city.size()];
		
		for(int i = 0; i < city.size(); i++){
			stuff[i] = city.get(i).CityName;
		}
		
		//this.start = new JComboBox(capitals);
		this.start = new StartBox(stuff, this.pPanel);
		start.setSelectedIndex(0);
		this.end = new EndBox(stuff, this.pPanel);
		end.setSelectedIndex(0);
		
		//making the labels
		JLabel tLabel = new JLabel("Calculate by: ");
		JLabel fLabel = new JLabel("From: ");
		JLabel eLabel = new JLabel("To: ");
		
		//adding the buttons and combo-boxes to the panel
		this.add(fLabel);
		this.add(start);
		this.add(eLabel);
		this.add(end);
		this.add(tLabel);
		this.add(tButton);
		this.add(dButton);
		
		this.setVisible(true);
		
	}
}
