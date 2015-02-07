import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class CCPanel extends JPanel{
	
	ButtonPanel bPanel;
	MapPanel mPanel;

	public CCPanel(CCFrame frame){
		
		super();
		
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);

		
		this.bPanel = new ButtonPanel();		
		layout.addLayoutComponent(bPanel, layout.NORTH);
		this.add(bPanel);

		this.mPanel = new MapPanel();
		
		
		
		this.setVisible(true);
	}
	
	public void paintComponent(Graphics g){
		//g.drawImage(img, x, y, observer);
		//g.setColor(Color.WHITE);
	}
	
}