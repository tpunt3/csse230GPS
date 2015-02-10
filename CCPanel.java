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

	public CCPanel(CCFrame frame) {

		super();
		//this.setSize(new Dimension(1300, 900));
		this.setPreferredSize(new Dimension(1000, 700));

		this.setLayout(new BorderLayout());

		this.bPanel = new ButtonPanel();
		this.add(bPanel, BorderLayout.NORTH);

		this.mPanel = new MapPanel(bPanel);
		this.add(mPanel, BorderLayout.CENTER);
		
		this.dPanel = new DirectionsPanel(bPanel);
		this.add(dPanel, BorderLayout.WEST);

		this.setVisible(true);
	}

	public void paintComponent(Graphics g) {

	}
}
