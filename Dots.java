
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;


public class Dots extends JPanel  {

	private Color color;
	private int r;
	private int ID;

	
	public Dots() {
	}


	public Dots(int ID, Color color) {
		this.ID = ID;
		this.color = color;
		this.r = 11;
		this.setPreferredSize(new Dimension(r, r));
	}
	
	public int getID(){
		return this.ID;
	}
	
	public void setStart() {
		color = Color.green;
	}
	
	public void setStop() {
		color = Color.red;
	}
	
	public void setBlack() {
		
		if(color!=Color.red&&color!=Color.green){
				color = Color.black;
		}
	}
	
	public void setReallyBlack(){
		color = Color.black;
	}
	
	public void setTravels() {
		color = Color.yellow;
	}
	
	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		graphics.setColor(color);
		graphics.drawOval(0, 0, r, r);
		graphics.fillOval(0, 0, r, r);

	}
}