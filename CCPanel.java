import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CCPanel extends JPanel {

	ButtonPanel bPanel;
	MapPanel mPanel;
	DirectionsPanel dPanel;
	POIPanel pPanel;

	public CCPanel(CCFrame frame) {

		super();
		this.setPreferredSize(new Dimension(1250, 600));

		this.setLayout(new BorderLayout(5,5));

		this.dPanel = new DirectionsPanel(bPanel);
		this.pPanel = new POIPanel();
		this.bPanel = new ButtonPanel(mPanel, dPanel, pPanel);
	
		this.add(bPanel, BorderLayout.NORTH);

		this.mPanel = new MapPanel(bPanel);
		this.add(mPanel, BorderLayout.CENTER);
		
		this.add(dPanel, BorderLayout.WEST);
		this.add(pPanel, BorderLayout.EAST);

		this.setVisible(true);
	}

	public void paintComponent(Graphics g) {

	}
}
