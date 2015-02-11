import java.awt.event.ActionEvent;

import javax.swing.JComboBox;


public class EndBox<E> extends JComboBox<E> {
	private POIPanel pPanel;

	public EndBox(){
		super();
		addActionListener(this);
	}
	
	public EndBox(E[] items, POIPanel pP){
		super(items);
		addActionListener(this);
		this.pPanel = pP;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.pPanel.aboutDest.setText(null);
		this.pPanel.aboutDest.insert("Destination City: "+this.getSelectedItem()
				+"\nRating: "
				+"\nPopulation: ",0);
	}
	
	
}
