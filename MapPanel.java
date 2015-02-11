import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MapPanel extends Panel {
	
	private BufferedImage US;

	public MapPanel (ButtonPanel bPanel){
		super();

		ImageIcon USA = new ImageIcon("src\\map.png");
		JLabel label = new JLabel("",USA,JLabel.CENTER);
		this.add(label);
		
		this.setVisible(true);
	}
	
	public void paintComponent(Graphics go) {
		super.paintComponents(go);
		
		go.drawImage(this.US, 0, 0, null);
		
	}
	
	
}
