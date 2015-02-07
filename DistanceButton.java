import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;


public class DistanceButton extends Button implements ActionListener {
	private Color color;
//	private Graph CNS;
//	private Astar astar;
//	private Stack<Node> stack;
	private int start;
	private int stop;
	private ButtonPanel parent;
	

	public DistanceButton(String buttonText, ButtonPanel parent) {
		super(buttonText);
		this.parent = parent;
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
		
	}

}
