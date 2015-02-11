import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class DirectionsPanel extends Panel {
	public JTextArea directionsText;
	public JTextArea distText;
	public JTextArea timeText;
	
	public DirectionsPanel (ButtonPanel bPanel){
		super();
		this.setSize(new Dimension(200, 200));
		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		JLabel directions = new JLabel("Directions:");
		this.add(directions);
		
		this.directionsText = new JTextArea(10,30);
		directionsText.setLineWrap(true);		
		directionsText.setMaximumSize(new Dimension(450,370));

//		ta.setFont(new Font("Arial", Font.PLAIN, 15));
		this.add(directionsText);
		
		JLabel time = new JLabel("Time:");
		this.add(time);
		this.timeText = new JTextArea(1,25);
		timeText.setLineWrap(true);
		timeText.setMaximumSize(new Dimension(450,35));
//		ta2.setFont(new Font("Arial", Font.PLAIN, 15));
		this.add(timeText);
		
		JLabel dist = new JLabel("Distance:");
		this.add(dist);
		this.distText = new JTextArea(1,25);
		distText.setMaximumSize(new Dimension(450,35));
		distText.setLineWrap(true);
//		ta3.setFont(new Font("Arial", Font.PLAIN, 15));
		this.add(distText);
		
		this.setVisible(true);
	}

}
