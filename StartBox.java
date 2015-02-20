import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JComboBox;


public class StartBox<E> extends JComboBox<E> {
	private POIPanel pPanel;
	private MapPanel mPanel;
	private Graph US;
	private int lastSelected;
	
	public StartBox(){
		super();
		addActionListener(this);
	}
	
	public StartBox(E[] items, POIPanel pP, MapPanel mP, Graph US){
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
		
		US.setStart(cities.get(j));
		
		for(int  i = 0; i<this.mPanel.dotList.size(); i++){
			this.mPanel.dotList.get(i).setBlack();
		}
		
		this.mPanel.dotList.get(lastSelected).setReallyBlack();
		this.mPanel.dotList.get(j).setStart();
		this.mPanel.repaint();
		
		this.pPanel.aboutOrigin.setText(null);
		this.pPanel.aboutOrigin.insert("Origin City: "+this.getSelectedItem()
				+"\nRating: " + cities.get(j).Rating 
				+"\nPopulation: " + cities.get(j).Population,0);
		
		this.lastSelected = j;
	}
	
}
