import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MapPanel extends Panel implements MouseListener{
	
	private BufferedImage US;

	public MapPanel (ButtonPanel bPanel){
		super();

		ImageIcon USA = new ImageIcon("src\\map.png");
		JLabel label = new JLabel("",USA,JLabel.CENTER);
		this.add(label);
		addMouseListener(this);
		
		this.setVisible(true);
	}
	
	public void paintComponent(Graphics go) {
		super.paintComponents(go);
		
		go.drawImage(this.US, 0, 0, null);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("X Coordinate: "+arg0.getX());
		System.out.println("Y Coordinate: "+arg0.getY());
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
