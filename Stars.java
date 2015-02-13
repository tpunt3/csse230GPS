import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Stars {
//public class Stars extends JPanel
	
	public Color currentColor;
	public Boolean assertHolder;
	
	public Stars() {
		currentColor = Color.BLACK;
		this.assertHolder = false;
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
	
	// Light up different colors depending on the best route
	
	public void drawOn() {
		
	}
	
	//@Override
	public void paintComponent(Graphics g, Color starColor, int latitude, int longitude) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(starColor);
		g2d.fillOval(latitude, longitude, 8, 8);
	}
	

}
