import java.awt.Button;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Stack;

public class TimeButton extends Button implements ActionListener {

	private Color color;
	private Graph US;
	private ButtonPanel parent;
	private MapPanel mPanel;
	private DirectionsPanel dPanel;
	private POIPanel pPanel;

	public TimeButton() throws HeadlessException {
	}

	public TimeButton(String buttonText, ButtonPanel parent, MapPanel mP,
			DirectionsPanel dP, POIPanel pPanel, Graph US) {
		super(buttonText);
		this.parent = parent;
		this.mPanel = mP;
		this.dPanel = dP;
		this.pPanel = pPanel;
		color = Color.LIGHT_GRAY;
		setBackground(this.color);
		addActionListener(this);
		this.US = US;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		AStar aStar = new AStar(US.startCity, US.endCity, US.linkedCities, US);
		LinkedList<City> shortTime = aStar.shortTime();
		double totalTime = Math.round(aStar.path.cost*100);
		totalTime = totalTime/100;
		
		this.pPanel.aboutPOI.setText(null);
		
		for (int i = 0; i < shortTime.size(); i++) {

			int j = 0;
			for (int k = 0; k < this.mPanel.dotList.size(); k++) {

				if (this.mPanel.dotList.get(k).getID() == (US.linkedCities
						.indexOf(shortTime.get(i)) + 1)) {
					this.mPanel.dotList.get(k).setTravels();
				

				int index = (US.linkedCities.indexOf(shortTime.get(i)));
				this.pPanel.aboutPOI.insert(US.linkedCities.get(index).poi1+",  Rating: "+US.linkedCities.get(index).poi1r +"\n", 0);
				this.pPanel.aboutPOI.insert(US.linkedCities.get(index).poi2+",  Rating: "+US.linkedCities.get(index).poi2r  +"\n", 0);
				this.pPanel.aboutPOI.insert(US.linkedCities.get(index).poi3+",  Rating: "+US.linkedCities.get(index).poi3r  +"\n", 0);
				this.pPanel.aboutPOI.insert(US.cities.get(index).CityName + ":\n", 0);
				}
				
				
				
			}

			this.mPanel.dotList.get(
					US.linkedCities.indexOf(shortTime.get(0))).setStart();
			this.mPanel.dotList.get(
					US.linkedCities.indexOf(shortTime.get(shortTime
							.size() - 1))).setStop();
			this.mPanel.repaint();
		}
		
		this.dPanel.directionsText.setText(null);
		this.dPanel.timeText.setText(null);
		this.dPanel.distText.setText(null);

		for (int i = shortTime.size() - 1; i >= 0; i--) {
			this.dPanel.directionsText.insert(shortTime.get(i).CityName, 0);

			this.dPanel.directionsText.insert("\n", 0);
		}

		if (this.parent.maxTime.getText().isEmpty()) {
			this.dPanel.timeText.insert(Double.toString(totalTime)
					+ " hours", 0);
		} else {

			Double nD = new Double(this.parent.maxTime.getText());

			if (nD >= totalTime) {
				this.dPanel.timeText.insert(Double.toString(totalTime)
						+ " hours", 0);
			} else {
				this.dPanel.timeText.insert(
						"The journey you chose is longer than your max time!",
						0);
			}
		}
	}

}
