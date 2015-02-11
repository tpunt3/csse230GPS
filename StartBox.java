import java.awt.event.ActionEvent;

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
		this.pPanel.aboutOrigin.setText(null);
		this.pPanel.aboutOrigin.insert("Origin City: "+this.getSelectedItem()
				+"\nRating: "
				+"\nPopulation: ",0);
	}
	
}
