import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel{
	 private Image bardejov;
	 private BufferedImage image;

	//Leon
	public Panel() {
		try {
		image = ImageIO.read(getClass().getResourceAsStream("bg.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		initBoard();
	}
	   private void initBoard() {
	        
	        loadImage();
	        
	        int w = bardejov.getWidth(this);
	        int h =  bardejov.getHeight(this);
	        setPreferredSize(new Dimension(w, h));        
	    }
	private void loadImage() {
	        
	        ImageIcon ii = new ImageIcon("bg.png");
	        bardejov = ii.getImage();        
	    }
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	     g.fillRect(100,100,150,250);
	     g.drawImage(bardejov, 0, 0, null);
	     g.drawImage(image, 100, 100,1000,1000, null);
	}
 
}
