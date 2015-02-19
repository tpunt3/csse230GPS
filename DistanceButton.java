import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Stack;


public class DistanceButton extends Button implements ActionListener {
	private Color color;
//	private Graph CNS;
//	private Astar astar;
//	private Stack<Node> stack;
	private int start;
	private int stop;
	private ButtonPanel parent;
	private MapPanel mPanel;
	private DirectionsPanel dPanel;
	private Graph US;
	

	public DistanceButton(String buttonText, ButtonPanel parent, MapPanel mP, DirectionsPanel dP, POIPanel pPanel, Graph US) {
		super(buttonText);
		this.parent = parent;
		this.mPanel = mP;
		this.dPanel = dP;
		this.US = US;
//		this.CNS = CNS;
//		astar = new Astar();
		color = Color.LIGHT_GRAY;
		setBackground(this.color);
		addActionListener(this);
//		this.stack = new Stack();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		AStar aStar = new AStar(US.startCity, US.endCity, US.linkedCities, US);
		LinkedList<City> shortestPath = aStar.shortDist();
		for (int i = 0; i < shortestPath.size(); i++){
			System.out.println(shortestPath.get(i).CityName);
		}
		
		//need to call Astar with (startCity, endCity, Graph US)
		
		this.dPanel.directionsText.setText(null);
		this.dPanel.timeText.setText(null);
		this.dPanel.distText.setText(null);
		this.dPanel.directionsText.insert("Stop 1 \nStop 2 \nStop 3",0);
		this.dPanel.timeText.insert("One Million Hours", 0);
		this.dPanel.distText.insert("One Million Miles", 0);
		
	}

}
