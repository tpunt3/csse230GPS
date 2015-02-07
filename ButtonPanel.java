import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;

import javax.swing.JComboBox;
import javax.swing.JLabel;


public class ButtonPanel extends Panel {
	
	protected DistanceButton dButton;
	protected TimeButton tButton;
	protected JComboBox start;
	protected JComboBox end;

	public ButtonPanel(){
		this.setBackground(Color.WHITE);
		
		//making the buttons
		this.tButton = new TimeButton("Time",this);
		this.dButton = new DistanceButton("Distance", this);
		
		//making the comboboxes
		String[] capitals = {"Choose a City: " ,"Olympia", "Indianapolis", "Baton Rouge", "Tucson"};
		this.start = new JComboBox(capitals);
		start.setSelectedIndex(0);
		this.end = new JComboBox(capitals);
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
