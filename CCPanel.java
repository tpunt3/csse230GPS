import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class CCPanel extends JPanel{

	public CCPanel(CCFrame frame){
		super();
		this.setBackground(Color.GREEN);
		JLabel title = new JLabel("Cross-Country Touring GPS");
		title.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(title);
	}
	
	public void paintComponent(Graphics g){
		//g.drawImage(img, x, y, observer);
		//g.setColor(Color.WHITE);
	}
	
	
}
