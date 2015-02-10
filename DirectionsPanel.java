import java.awt.Dimension;
import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class DirectionsPanel extends Panel {
	
	public DirectionsPanel (ButtonPanel bPanel){
		super();
		this.setSize(new Dimension(200, 300));
		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		JLabel directions = new JLabel("Directions:");
		this.add(directions);
		
		JTextArea ta = new JTextArea(10,30);
		ta.setLineWrap(true);
		this.add(ta);
		
		JLabel time = new JLabel("Time:");
		this.add(time);
		JTextArea ta2 = new JTextArea(1,25);
		ta2.setLineWrap(true);
		this.add(ta2);
		
		JLabel dist = new JLabel("Distance:");
		this.add(dist);
		JTextArea ta3 = new JTextArea(1,25);
		ta3.setLineWrap(true);
		this.add(ta3);
		
		this.setVisible(true);
	}

}
