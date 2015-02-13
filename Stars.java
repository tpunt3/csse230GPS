import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Stars {
//public class Stars extends JPanel
	
	public Color currentColor;
	//public Graphics graphic;
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
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.fillOval(0, 0, 30, 30);
		//g2d.drawOval(0, 50, 30, 30);		

		//g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
	}
	

}
