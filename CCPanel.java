import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;

public class CCPanel extends JPanel {

	ButtonPanel bPanel;
	MapPanel mPanel;
	DirectionsPanel dPanel;
	POIPanel pPanel;

	public CCPanel(CCFrame frame, ArrayList<City> cities) throws IOException {

		super();
		this.setPreferredSize(new Dimension(1250, 600));

		this.setLayout(new BorderLayout(5,5));

		this.dPanel = new DirectionsPanel(bPanel);
		this.pPanel = new POIPanel();

		this.mPanel = new MapPanel(bPanel);
		this.bPanel = new ButtonPanel(mPanel, dPanel, pPanel,cities);
	
		this.add(bPanel, BorderLayout.NORTH);

		this.add(mPanel, BorderLayout.CENTER);
		
		this.add(dPanel, BorderLayout.WEST);
		this.add(pPanel, BorderLayout.EAST);

		this.setVisible(true);
	}

	public void paintComponent(Graphics g) {

	}
}
