import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MapPanel extends JPanel{
	
	private BufferedImage US;
	public ArrayList<Dots> dotList;
	

	public MapPanel (ButtonPanel bPanel){
		super();
		this.dotList = new ArrayList<Dots>();
		

        SpringLayout layout = new SpringLayout();
        this.setLayout(layout);
		

		Dots Montgomery = new Dots(1, Color.black);
		layout.putConstraint(SpringLayout.WEST, Montgomery , 410, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Montgomery, 261, SpringLayout.NORTH, this);
		this.add(Montgomery);
		dotList.add(Montgomery);
		
		Dots Phoenix = new Dots(2, Color.black);
		layout.putConstraint(SpringLayout.WEST, Phoenix, 108, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Phoenix, 235, SpringLayout.NORTH, this);
		this.add(Phoenix);
		dotList.add(Phoenix);
		
		Dots LittleRock = new Dots(3, Color.black);
		layout.putConstraint(SpringLayout.WEST, LittleRock , 337, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, LittleRock, 233, SpringLayout.NORTH, this);
		this.add(LittleRock);
		dotList.add(LittleRock);
		
		Dots Sacramento = new Dots(4, Color.black);
		layout.putConstraint(SpringLayout.WEST, Sacramento , 19, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Sacramento, 144, SpringLayout.NORTH, this);
		this.add(Sacramento);
		dotList.add(Sacramento);
		
		Dots Denver = new Dots(5, Color.black);
		layout.putConstraint(SpringLayout.WEST, Denver, 198, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Denver, 157, SpringLayout.NORTH, this);
		this.add(Denver);
		dotList.add(Denver);
		
		Dots Hartford = new Dots(6, Color.black);
		layout.putConstraint(SpringLayout.WEST, Hartford, 535, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Hartford, 110, SpringLayout.NORTH, this);
		this.add(Hartford);
		dotList.add(Hartford);
		
		Dots Dover = new Dots(7, Color.black);
		layout.putConstraint(SpringLayout.WEST, Dover, 516, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Dover, 150, SpringLayout.NORTH, this);
		this.add(Dover);
		dotList.add(Dover);
		
		Dots DC = new Dots(8, Color.black);
		layout.putConstraint(SpringLayout.WEST, DC, 489, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, DC, 157, SpringLayout.NORTH, this);
		this.add(DC);
		dotList.add(DC);
		
		Dots Tallahassee = new Dots(9, Color.black);
		layout.putConstraint(SpringLayout.WEST, Tallahassee, 437, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Tallahassee, 286, SpringLayout.NORTH, this);
		this.add(Tallahassee);
		dotList.add(Tallahassee);
		
		Dots Atlanta = new Dots(10, Color.black);
		layout.putConstraint(SpringLayout.WEST, Atlanta, 430, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Atlanta, 240, SpringLayout.NORTH, this);
		this.add(Atlanta);
		dotList.add(Atlanta);
		
		Dots Boise = new Dots(11, Color.black);
		layout.putConstraint(SpringLayout.WEST, Boise, 91, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Boise, 88, SpringLayout.NORTH, this);
		this.add(Boise);
		dotList.add(Boise);
		
		Dots Springfield = new Dots(12, Color.black);
		layout.putConstraint(SpringLayout.WEST, Springfield, 363, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Springfield, 160, SpringLayout.NORTH, this);
		this.add(Springfield);
		dotList.add(Springfield);
		
		Dots Indianapolis = new Dots(13, Color.black);
		layout.putConstraint(SpringLayout.WEST, Indianapolis, 400, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Indianapolis, 158, SpringLayout.NORTH, this);
		this.add(Indianapolis);
		dotList.add(Indianapolis);
		
		Dots DesMoines = new Dots(14, Color.black);
		layout.putConstraint(SpringLayout.WEST, DesMoines, 321, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, DesMoines, 135, SpringLayout.NORTH, this);
		this.add(DesMoines);
		dotList.add(DesMoines);
		
		Dots Topeka = new Dots(15, Color.black);
		layout.putConstraint(SpringLayout.WEST, Topeka, 299, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Topeka, 171, SpringLayout.NORTH, this);
		this.add(Topeka);
		dotList.add(Topeka);
		
		Dots Frankfort = new Dots(16, Color.black);
		layout.putConstraint(SpringLayout.WEST, Frankfort, 417, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Frankfort, 179, SpringLayout.NORTH, this);
		this.add(Frankfort);
		dotList.add(Frankfort);
		
		Dots BatonRouge = new Dots(17, Color.black);
		layout.putConstraint(SpringLayout.WEST, BatonRouge, 353, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, BatonRouge, 292, SpringLayout.NORTH, this);
		this.add(BatonRouge);
		dotList.add(BatonRouge);
		
		Dots Augusta = new Dots(18, Color.black);
		layout.putConstraint(SpringLayout.WEST, Augusta, 555, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Augusta, 64, SpringLayout.NORTH, this);
		this.add(Augusta);
		dotList.add(Augusta);
		
		Dots Annapolis = new Dots(19, Color.black);
		layout.putConstraint(SpringLayout.WEST, Annapolis, 504, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Annapolis, 154, SpringLayout.NORTH, this);
		this.add(Annapolis);
		dotList.add(Annapolis);
		
		Dots Boston = new Dots(20, Color.black);
		layout.putConstraint(SpringLayout.WEST, Boston, 550, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Boston, 96, SpringLayout.NORTH, this);
		this.add(Boston); 
		dotList.add(Boston);
		
		Dots Lansing = new Dots(21, Color.black);
		layout.putConstraint(SpringLayout.WEST, Lansing, 412, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Lansing, 114, SpringLayout.NORTH, this);
		this.add(Lansing);
		dotList.add(Lansing);
		
		Dots StPaul = new Dots(22, Color.black);
		layout.putConstraint(SpringLayout.WEST, StPaul, 324, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, StPaul, 90, SpringLayout.NORTH, this);
		this.add(StPaul);
		dotList.add(StPaul);
		
		Dots Jackson = new Dots(23, Color.black);
		layout.putConstraint(SpringLayout.WEST, Jackson, 363, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Jackson, 265, SpringLayout.NORTH, this);
		this.add(Jackson);
		dotList.add(Jackson);
		
		Dots JeffersonCity = new Dots(24, Color.black);
		layout.putConstraint(SpringLayout.WEST, JeffersonCity, 336, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, JeffersonCity, 180, SpringLayout.NORTH, this);
		this.add(JeffersonCity);
		dotList.add(JeffersonCity);
		
		
		Dots Helena = new Dots(25, Color.black);
		layout.putConstraint(SpringLayout.WEST, Helena, 139, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Helena, 55, SpringLayout.NORTH, this);
		this.add(Helena);
		dotList.add(Helena);
		
		Dots Lincoln = new Dots(26, Color.black);
		layout.putConstraint(SpringLayout.WEST, Lincoln, 286, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Lincoln, 148, SpringLayout.NORTH, this);
		this.add(Lincoln);
		dotList.add(Lincoln);
		
		Dots CarsonCity = new Dots(27, Color.black);
		layout.putConstraint(SpringLayout.WEST, CarsonCity, 40, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, CarsonCity, 140, SpringLayout.NORTH, this);
		this.add(CarsonCity);
		dotList.add(CarsonCity);
		
		Dots Concord = new Dots(28, Color.black);
		layout.putConstraint(SpringLayout.WEST, Concord, 542, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Concord, 84, SpringLayout.NORTH, this);
		this.add(Concord);
		dotList.add(Concord);
		
		Dots Trenton = new Dots(29, Color.black);
		layout.putConstraint(SpringLayout.WEST, Trenton, 520, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH,Trenton, 134, SpringLayout.NORTH, this);
		this.add(Trenton);
		dotList.add(Trenton);
		
		Dots SantaFe = new Dots(30, Color.black);
		layout.putConstraint(SpringLayout.WEST, SantaFe, 182, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH,SantaFe, 215, SpringLayout.NORTH, this);
		this.add(SantaFe);
		dotList.add(SantaFe);
		
		Dots Albany = new Dots(31, Color.black);
		layout.putConstraint(SpringLayout.WEST, Albany, 521, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Albany, 96, SpringLayout.NORTH, this);
		this.add(Albany);
		dotList.add(Albany);
		
		Dots Raleigh = new Dots(32, Color.black);
		layout.putConstraint(SpringLayout.WEST, Raleigh, 492, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Raleigh, 203, SpringLayout.NORTH, this);
		this.add(Raleigh);
		dotList.add(Raleigh);
		
		Dots Bismark = new Dots(33, Color.black);
		layout.putConstraint(SpringLayout.WEST, Bismark, 253, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Bismark, 60, SpringLayout.NORTH, this);
		this.add(Bismark);
		dotList.add(Bismark);
		
		Dots Columbus = new Dots(34, Color.black);
		layout.putConstraint(SpringLayout.WEST, Columbus, 434, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Columbus, 151, SpringLayout.NORTH, this);
		this.add(Columbus);
		dotList.add(Columbus);
		
		Dots Oklahoma = new Dots(35, Color.black);
		layout.putConstraint(SpringLayout.WEST, Oklahoma, 278, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Oklahoma, 225, SpringLayout.NORTH, this);
		this.add(Oklahoma);
		dotList.add(Oklahoma);
		
		Dots Salem = new Dots(36, Color.black);
		layout.putConstraint(SpringLayout.WEST, Salem, 29, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Salem, 52, SpringLayout.NORTH, this);
		this.add(Salem);
		dotList.add(Salem);
		
		Dots Harrisburg = new Dots(37, Color.black);
		layout.putConstraint(SpringLayout.WEST, Harrisburg, 497, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Harrisburg, 134, SpringLayout.NORTH, this);
		this.add(Harrisburg);
		dotList.add(Harrisburg);
		
		Dots Providence = new Dots(38, Color.black);
		layout.putConstraint(SpringLayout.WEST, Providence, 548, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Providence, 104, SpringLayout.NORTH, this);
		this.add(Providence);
		dotList.add(Providence);
		
		Dots Columbia = new Dots(39, Color.black);
		layout.putConstraint(SpringLayout.WEST, Columbia, 468, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Columbia, 230, SpringLayout.NORTH, this);
		this.add(Columbia);
		dotList.add(Columbia);
		
		Dots Pierre = new Dots(40, Color.black);
		layout.putConstraint(SpringLayout.WEST, Pierre, 252, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Pierre, 98, SpringLayout.NORTH, this);
		this.add(Pierre);
		dotList.add(Pierre);
		
		Dots Nashville = new Dots(41, Color.black);
		layout.putConstraint(SpringLayout.WEST, Nashville, 400, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Nashville, 210, SpringLayout.NORTH, this);
		this.add(Nashville);
		dotList.add(Nashville);
		
		Dots Austin = new Dots(42, Color.black);
		layout.putConstraint(SpringLayout.WEST, Austin, 273, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Austin, 297, SpringLayout.NORTH, this);
		this.add(Austin);
		dotList.add(Austin);
		
		Dots SaltLakeCity = new Dots(43, Color.black);
		layout.putConstraint(SpringLayout.WEST, SaltLakeCity, 127, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, SaltLakeCity, 135, SpringLayout.NORTH, this);
		this.add(SaltLakeCity);
		dotList.add(SaltLakeCity);
		
		Dots Montpelier = new Dots(44, Color.black);
		layout.putConstraint(SpringLayout.WEST, Montpelier, 526, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Montpelier, 70, SpringLayout.NORTH, this);
		this.add(Montpelier);
		dotList.add(Montpelier);
		
		Dots Richmond = new Dots(45, Color.black);
		layout.putConstraint(SpringLayout.WEST, Richmond, 500, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Richmond, 173, SpringLayout.NORTH, this);
		this.add(Richmond);
		dotList.add(Richmond);
		
		Dots Olympia = new Dots(46, Color.black);
		layout.putConstraint(SpringLayout.WEST, Olympia, 36, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Olympia, 25, SpringLayout.NORTH, this);
		this.add(Olympia);
		dotList.add(Olympia);
		
		Dots Charleston = new Dots(47, Color.black);
		layout.putConstraint(SpringLayout.WEST, Charleston, 452, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Charleston, 172, SpringLayout.NORTH, this);
		this.add(Charleston);
		dotList.add(Charleston);
		
		Dots Madison = new Dots(48, Color.black);
		layout.putConstraint(SpringLayout.WEST, Madison, 362, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Madison, 113, SpringLayout.NORTH, this);
		this.add(Madison);
		dotList.add(Madison);
		
		Dots Cheyenne = new Dots(49, Color.black);
		layout.putConstraint(SpringLayout.WEST, Cheyenne, 202, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, Cheyenne, 136, SpringLayout.NORTH, this);
		this.add(Cheyenne);
		dotList.add(Cheyenne);
		
		
		try {
			this.US = ImageIO.read(new File("src\\map.png"));
		} catch (IOException ex) {
			// handle exception...
		}
		
		this.setVisible(true);
		this.repaint();
	}
	
	public void paintComponent(Graphics go) {
		
		super.paintComponents(go);
		
		go.drawImage(this.US,0,0,null);
		
	}
	
}
