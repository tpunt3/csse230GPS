import java.awt.Button;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;


public class TimeButton extends Button implements ActionListener {
	
	private Color color;
	//private Graph CNS;
	//private Astar astar;
	//private Stack<Node> stack;
	private int start;
	private int stop;
	private ButtonPanel parent;
	private MapPanel mPanel;
	private DirectionsPanel dPanel;

	public TimeButton() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	public TimeButton(String buttonText, ButtonPanel parent, MapPanel mP, DirectionsPanel dP, POIPanel pPanel, Graph US) {
		super(buttonText);
		this.parent = parent;
		this.mPanel = mP;
		this.dPanel = dP;
		color = Color.LIGHT_GRAY;
		setBackground(this.color);
		addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.dPanel.directionsText.setText(null);
		this.dPanel.timeText.setText(null);
		this.dPanel.distText.setText(null);
		this.dPanel.directionsText.insert("Stop 1 \nStop 2 \nStop 3",0);
		this.dPanel.timeText.insert("One Million Hours", 0);
		this.dPanel.distText.insert("One Million Miles", 0);
	}	

}
