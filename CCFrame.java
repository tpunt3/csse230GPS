import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;


public class CCFrame extends JFrame{
	private CCPanel mainPanel;
	
	
	public CCFrame(ArrayList<City> cities) throws IOException{
		super();
		
		this.setSize(new Dimension(1300, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		this.mainPanel = new CCPanel(this,cities);
		this.add(this.mainPanel);
		
		this.setVisible(true);
	}   
}