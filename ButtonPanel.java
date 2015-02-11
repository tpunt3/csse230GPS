import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;

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

	public ButtonPanel(MapPanel mP, DirectionsPanel dP, POIPanel pP){
		this.setBackground(Color.WHITE);
		this.mPanel = mP;
		this.dPanel = dP;
		this.pPanel = pP;
		
		//making the buttons
		this.dButton = new DistanceButton("Shortest Distance", this, this.mPanel, this.dPanel, this.pPanel);
		this.tButton = new TimeButton("Shortest Time",this, this.mPanel, this.dPanel, this.pPanel);
	
		//making the comboboxes
		String[] capitals = {"Choose a City " ,"Olympia", "Indianapolis", "Baton Rouge", "Tucson"};
		//this.start = new JComboBox(capitals);
		this.start = new StartBox(capitals, this.pPanel);
		start.setSelectedIndex(0);
		this.end = new EndBox(capitals, this.pPanel);
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
