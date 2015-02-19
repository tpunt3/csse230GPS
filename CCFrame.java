import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;


public class CCFrame extends JFrame{
	private CCPanel mainPanel;
	private Graph US;
	
	public CCFrame(ArrayList<City> cities, Graph US) throws IOException{
		super();
		this.US = US;
		
		this.setSize(new Dimension(1300, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		this.mainPanel = new CCPanel(this,cities, this.US);
		this.add(this.mainPanel);
		
		this.setVisible(true);
	}   
}