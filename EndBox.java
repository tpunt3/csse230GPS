import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JComboBox;


public class EndBox<E> extends JComboBox<E> {
	private POIPanel pPanel;
	private MapPanel mPanel;
	private Graph US;
	private int lastSelected;

	public EndBox(){
		super();
		addActionListener(this);
	}
	
	public EndBox(E[] items, POIPanel pP, MapPanel mP, Graph US){
		super(items);
		addActionListener(this);
		this.pPanel = pP;
		this.mPanel = mP;
		this.US = US;
		this.lastSelected = 0;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		ArrayList<City> cities = new ArrayList<City>();
		cities = US.cities;

		int j = 0;
		for(int i = 0; i<cities.size();i++){
			if(  (cities.get(i).CityName.compareTo(this.getSelectedItem().toString()))==0 ){
				j=i;
			}
		}
		
		

		US.setEnd(cities.get(j));
		
		for(int  i = 0; i<this.mPanel.dotList.size(); i++){
			this.mPanel.dotList.get(i).setBlack();
		}
		
		this.mPanel.dotList.get(lastSelected).setReallyBlack();
		this.mPanel.dotList.get(j).setStop();
		this.mPanel.repaint();
		
		this.pPanel.aboutDest.setText(null);
		this.pPanel.aboutDest.insert("Destination City: "+this.getSelectedItem()
				+"\nRating: " + cities.get(j).Rating
				+"\nPopulation: "+ cities.get(j).Population,0);
		
		this.lastSelected = j;
	}
	
	
}
