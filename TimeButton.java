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

	public TimeButton() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	public TimeButton(String buttonText, ButtonPanel parent) {
		super(buttonText);
		this.parent = parent;
		color = Color.LIGHT_GRAY;
		setBackground(this.color);
		addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}	

}
