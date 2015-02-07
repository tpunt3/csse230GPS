import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class MapPanel extends Panel {
	
	private BufferedImage US;

	public MapPanel (ButtonPanel bPanel){
		super();
		try{
		this.US = ImageIO.read(new File("src\\map.gif"));
		} catch (IOException ex) {
			// handle exception...
		}
		
		this.setVisible(true);
	}
	

	public void paintComponent(Graphics graphicsObject) {
		graphicsObject.drawImage(this.US, 0, 0, null);
	}
	
	
}
