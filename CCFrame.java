import java.awt.Dimension;

import javax.swing.JFrame;


public class CCFrame extends JFrame{
	
	
	public CCFrame(){
		super();
		
		CCPanel newPanel = new CCPanel(this);
		this.setSize(new Dimension(500, 500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
}
