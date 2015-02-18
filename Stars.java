import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class Stars extends JPanel{
//public class Stars extends JPanel
	
	public Color currentColor;
	public Boolean assertHolder;
	public int radius;
	
	public Stars(int ID) {
		currentColor = Color.BLACK;
		this.assertHolder = false;
		this.radius = 6;
	}
	
	public void setFalse() {
		this.assertHolder = false;
	}
	
	public void setTrue() {
		this.assertHolder = true;
	}
	
	public boolean getValue() {
		return this.assertHolder;
	}
	
	public void setStart() {
		currentColor = Color.green;
	}
	
	public void setStop() {
		currentColor = Color.red;
	}
	
	public void setTravels() {
		currentColor = Color.yellow;
	}
	
	// Light up different colors depending on the best route
	
	public void drawOn() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(currentColor);
		g.fillOval(0, 0, radius, radius);	
	}

	

}
