import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Stack;

public class DistanceButton extends Button implements ActionListener {
	private Color color;
	private ButtonPanel parent;
	private MapPanel mPanel;
	private DirectionsPanel dPanel;
	private Graph US;
	private POIPanel pPanel;

	public DistanceButton(String buttonText, ButtonPanel parent, MapPanel mP,
			DirectionsPanel dP, POIPanel pPanel, Graph US) {
		super(buttonText);
		this.parent = parent;
		this.mPanel = mP;
		this.dPanel = dP;
		this.US = US;
		this.pPanel = pPanel;
		color = Color.LIGHT_GRAY;
		setBackground(this.color);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		AStar aStar = new AStar(US.startCity, US.endCity, US.linkedCities, US);
		LinkedList<City> shortestPath = aStar.shortDist();

		this.pPanel.aboutPOI.setText(null);
		
		for (int i = 0; i < shortestPath.size(); i++) {

			for (int k = 0; k < this.mPanel.dotList.size(); k++) {

				if (this.mPanel.dotList.get(k).getID() == (US.linkedCities
						.indexOf(shortestPath.get(i)) + 1)) {
					this.mPanel.dotList.get(k).setTravels();
					
					int index = (US.linkedCities.indexOf(shortestPath.get(i)));
					this.pPanel.aboutPOI.insert(US.cities.get(index).poi1+",  Rating: "+US.linkedCities.get(index).poi1r +"\n", 0);
					this.pPanel.aboutPOI.insert(US.cities.get(index).poi2+",  Rating: "+US.linkedCities.get(index).poi2r  +"\n", 0);
					this.pPanel.aboutPOI.insert(US.cities.get(index).poi3+",  Rating: "+US.linkedCities.get(index).poi3r  +"\n", 0);

					this.pPanel.aboutPOI.insert(US.cities.get(index).CityName + ":\n", 0);
				}

				
	
			}

			this.mPanel.dotList.get(
					US.linkedCities.indexOf(shortestPath.get(0))).setStart();
			this.mPanel.dotList.get(
					US.linkedCities.indexOf(shortestPath.get(shortestPath
							.size() - 1))).setStop();
			this.mPanel.repaint();
		}

		Double nD = (double) Math.round(aStar.path.f);

		this.dPanel.directionsText.setText(null);
		this.dPanel.timeText.setText(null);
		this.dPanel.distText.setText(null);

		for (int i = shortestPath.size() - 1; i >= 0; i--) {
			this.dPanel.directionsText.insert(shortestPath.get(i).CityName, 0);

			this.dPanel.directionsText.insert("\n", 0);
		}

		if (this.parent.maxDist.getText().isEmpty()) {
			this.dPanel.distText.insert(Double.toString(nD) + " miles", 0);
		} else {

			Double newDouble = new Double(this.parent.maxDist.getText());

			if (newDouble >= aStar.path.f) {

				this.dPanel.distText.insert(Double.toString(nD) + " miles", 0);
			} else {
				this.dPanel.distText
						.insert("The journey you chose is longer than your max distance!",
								0);
			}
		}
	}
}
