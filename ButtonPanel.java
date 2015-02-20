import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class ButtonPanel extends Panel {
	
	protected DistanceButton dButton;
	protected TimeButton tButton;
	protected StartBox start;
	protected EndBox end;
	public MilesArea maxDist;
	public MilesArea maxTime;
	private MapPanel mPanel;
	private DirectionsPanel dPanel;
	private POIPanel pPanel;

	public ButtonPanel(MapPanel mP, DirectionsPanel dP, POIPanel pP, ArrayList<City> cities, Graph US) throws IOException{
		this.setBackground(Color.WHITE);
		this.mPanel = mP;
		this.dPanel = dP;
		this.pPanel = pP;
		
		
		//making the buttons
		this.dButton = new DistanceButton("Shortest Distance", this, this.mPanel, this.dPanel, this.pPanel, US);
		this.tButton = new TimeButton("Shortest Time",this, this.mPanel, this.dPanel, this.pPanel,US);
	
		//making the comboboxes
		
		
		Object[] stuff = new Object[cities.size()];
		
		for(int i = 0; i < cities.size(); i++){
			stuff[i] = cities.get(i).CityName;
		}
		
		//this.start = new JComboBox(capitals);
		this.start = new StartBox(stuff, this.pPanel, this.mPanel, US);
		start.setSelectedIndex(0);
		this.end = new EndBox(stuff, this.pPanel, this.mPanel, US);
		end.setSelectedIndex(0);
		
		
		this.maxDist = new MilesArea(1,10);
		this.maxTime = new MilesArea(1,10);
		
		
		//making the labels
		JLabel mTLabel = new JLabel("Max Time (in hours): ");
		JLabel mDLabel = new JLabel("Max Distance (in miles): ");
		JLabel tLabel = new JLabel("Calculate by: ");
		JLabel fLabel = new JLabel("From: ");
		JLabel eLabel = new JLabel("To: ");
		
		//adding the buttons and combo-boxes to the panel
		this.add(mTLabel);
		this.add(maxTime);
		this.add(mDLabel);
		this.add(maxDist);
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
