import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;


public class CCFrame extends JFrame{
	private CCPanel mainPanel;
	
	
	public CCFrame(){
		super();
		
		this.setSize(new Dimension(1300, 900));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		this.mainPanel = new CCPanel(this);
		this.add(this.mainPanel);
		
		this.setVisible(true);
	}   
}